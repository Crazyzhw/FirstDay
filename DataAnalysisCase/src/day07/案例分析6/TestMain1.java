package day07.案例分析6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day07.bean.SessionBean;
public class TestMain1 {
	public static void main(String[] args) {
		/**
		 * 需要为从访问日志中梳理出每一个session（如果一个用户两次相邻请求之间的时间差<30分钟，
		 * 则该两次请求都属于同一个session，否则分属不同的session），并为session中的历次请求打上序号
		 */
		Map<String, List<SessionBean>> map = getMap();
		Map<String,List<SessionBean>> sessionMap = new HashMap<>();
		Set<Entry<String, List<SessionBean>>> set = map.entrySet();
		for (Entry<String, List<SessionBean>> entry : set) {
			List<SessionBean> value = entry.getValue();
			sortByDate(value);
		}
		makeSessionId(map);
		Set<Entry<String,List<SessionBean>>> entrySet = map.entrySet();
		for (Entry<String, List<SessionBean>> entry : entrySet) {
			List<SessionBean> list = entry.getValue();
			for (SessionBean sessionBean : list) {
				System.out.println(sessionBean);
			}
			System.out.println("----------");
		}
	/**
	 * 需求二:将每次session进行汇总，得出用户每次session的浏览起、止页面，每次session会话总时长等，
	 * @param map
	 */
		Set<Entry<String, List<SessionBean>>> entrySet2 = map.entrySet();
		for (Entry<String, List<SessionBean>> entry : entrySet2) {
			List<SessionBean> list = entry.getValue();
			for (SessionBean sessionBean : list) {
				String session = sessionBean.getSession();
				List<SessionBean> list2 = sessionMap.getOrDefault(session, new ArrayList<SessionBean>());
				list2.add(sessionBean);
				sessionMap.put(session, list2);
			}
		}
		Set<Entry<String,List<SessionBean>>> entrySet3 = sessionMap.entrySet();
		for (Entry<String, List<SessionBean>> entry : entrySet3) {
			List<SessionBean> list = entry.getValue();
			SessionBean first = list.get(0);
			SessionBean end = list.get(list.size()-1);
			//sessionid	ip1	2017-10-11 08:10:30	2017-10-11 08:11:20	/a	/b	50秒
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String ret = entry.getKey()+"\t"+first.getIp()+"\t"+format.format(first.getDate())+"\t"
					+format.format(end.getDate())+"\t"+first.getUrl()+"\t"+end.getUrl()+"\t"
					+((end.getDate().getTime()-first.getDate().getTime())/1000);
			System.out.println(ret);

		}
	}
	

	private static void makeSessionId(Map<String, List<SessionBean>> map) {
		Set<Entry<String, List<SessionBean>>> entrySet = map.entrySet();
		for (Entry<String, List<SessionBean>> entry : entrySet) {
			List<SessionBean> list = entry.getValue();
			if (list.size() == 1) {
				String uuid = UUID.randomUUID().toString();
				list.get(0).setSession(uuid);
				list.get(0).setId(1);
			} else {
				for (int i = 0; i < list.size()-1; i++) {
					SessionBean bean1 = list.get(i);
					SessionBean bean2 = list.get(i+1);
					if(sameSession(bean1,bean2)) {
						if((bean1.getSession())!=null) {
							bean2.setSession(bean1.getSession());
							bean2.setId(bean1.getId()+1);
						}else {
							String uuid1 = UUID.randomUUID().toString();
							bean1.setSession(uuid1);
							bean2.setSession(uuid1);
							bean1.setId(1);
							bean2.setId(2);
						}
					}else {
						if(bean1.getSession()!=null) {
							String uuid = UUID.randomUUID().toString();
							bean2.setSession(uuid);
							bean2.setId(1);
						}else {
							String uuid=UUID.randomUUID().toString();
							String uuid2=UUID.randomUUID().toString();
							bean1.setSession(uuid);
							bean1.setId(1);
							bean2.setSession(uuid2);
							bean2.setId(1);
						}
					}
				}
			}
		}

	}

	private static boolean sameSession(SessionBean bean1, SessionBean bean2) {
		long time1 = bean1.getDate().getTime();	
		long time2 = bean2.getDate().getTime();	
		if((time2-time1)<=(30*60*1000)) {
			return true;
		}
		return false;
	}

	private static void sortByDate(List<SessionBean> value) {
		Collections.sort(value, new Comparator<SessionBean>() {
			@Override
			public int compare(SessionBean o1, SessionBean o2) {
				Date date1 = o1.getDate();
				Date date2 = o2.getDate();
				return date1.before(date2) ? -1 : 1;
			}
		});

	}

	private static Map<String, List<SessionBean>> getMap() {
		Map<String, List<SessionBean>> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例分析day06\\access.log.fensi"));) {
			String line;
			while ((line = br.readLine()) != null) {
				// 199.21.99.79 - - [18/Sep/2013:19:39:51 +0000] "GET / HTTP/1.1" 200 4042 "-"
				// "Mozilla/5.0 (compatible; YandexBot/3.0; +http://yandex.com/bots)"
				String ipRegex = "(\\w+\\.){3}(\\w)";
				String dateRegex = "\\[.+\\d+\\]";
				String urlRegex = "(GET|POST){1}\\s(\\S)+\\s";
				String ip = getDataByRegex(line, ipRegex);
				String date = getDataByRegex(line, dateRegex);
				String url = getDataByRegex(line, urlRegex);
				if (ip != null && date != null && url != null) {
					SessionBean s = new SessionBean();
					s.set(null, ip, formatDate(date), url, 0);
					List<SessionBean> list = map.getOrDefault(ip, new ArrayList<>());
					list.add(s);
					map.put(ip, list);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

	// [18/Sep/2013:19:40:49 +0000]
	private static Date formatDate(String date) {
		String substring = date.substring(1, date.length() - 1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy:hh:mm:ss", Locale.US);
		try {
			Date date2 = sdf.parse(substring);
			return date2;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private static String getDataByRegex(String line, String ipRegex) {
		Pattern p = Pattern.compile(ipRegex);
		Matcher matcher = p.matcher(line);
		while (matcher.find()) {
			return matcher.group();
		}
		return null;
	}
}
