package day02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMain01 {
	public static void main(String[] args) {
		//获取map集合
		Map<String, List<String>> map = getMap();
		//创建一个list用来存储封装好的appbean对象
		List<AppBean> list =new ArrayList<>();
//		System.out.println(map);
		Set<Entry<String, List<String>>> entrySet = map.entrySet();
		//对map进行遍历
		for (Entry<String, List<String>> entry : entrySet) {
			String key = entry.getKey();
			List<String> value = entry.getValue();
			//对value(version)进行局部排序
			SortUtil.sortByVersion(value);
			if(value.size()>1) {
				//切割key，得到时间
				String[] split = key.split(",");
				String date=split[0];
				String user=split[1];
				String appName=split[2];
				String appStore=split[3];
				String minVersion=value.get(0);
				String maxVersion=value.get(value.size()-1);
				//封装到appbean对象里面
				AppBean bean = new AppBean();
				bean.set(date, user, appName, appStore, minVersion, maxVersion);
				list.add(bean);
			}
		}
		//通过时间对list进行排序
		SortUtil.sortByDate(list);
		for (AppBean entry : list) {
			System.out.println(entry);
		}
	}
	/**
	 *读取数据，并获取包含用户和版本的map集合 
	 */
	public static Map<String, List<String>> getMap() {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		try (
				BufferedReader br =	 new  BufferedReader(new FileReader("F:\\JAVA资料\\案例分析day02\\资料\\app.txt"));
				){
			//读取文件
			String line;
			while((line=br.readLine())!=null) {
				String[] split = line.split(",");
				String key =split[0]+","+split[1]+","+split[2]+","+split[3];
				String version =split[5];
				//存贮key和value，如果有相同的key，就只添加value，否则就新建一个value
				if(map.containsKey(key)) {
					List<String> list = map.get(key);
					list.add(version);
				}else {
					List<String> list = new ArrayList<>();
					list.add(version);
					map.put(key, list);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}
