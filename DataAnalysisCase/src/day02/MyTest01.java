package day02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MyTest01 {
	public static void main(String[] args) {
		HashMap<NameVersion, List> map = new HashMap<>();
	
		try(
				BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例分析day02\\资料\\app.txt"));
				) {
			String line;
			while((line = br.readLine())!=null) {
				String[] split = line.split(",");
				String name = split[0]+","+split[1]+","+split[2]+","+split[3];
				String version =split[split.length-1];
				List<String> list = new ArrayList<>();
				boolean add = list.add(version);
				map.put(new NameVersion(name), list);
				}
			  ArrayList<NameVersion> list = new ArrayList<>(map.keySet());
			  Collection<List> value = map.values();
			  ArrayList<List> values = new ArrayList<>(value);
			for (int i = 0; i < list.size()-1; i++) {
				String namei = list.get(i).getName();
				String[] spliti = namei.split(",");
				String datei = spliti[0];
				String si=spliti[1]+spliti[2]+spliti[3];
				for (int j = i+1; j < list.size(); j++) {
					String namej = list.get(j).getName();
					String[] splitj = namej.split(",");
					String datej = splitj[0];
					String sj=splitj[1]+splitj[2]+splitj[3];
					List listi = values.get(i);
					List listj = values.get(j);
					if(namei.equals(namej)) {
						listi.add( listj.get(0));
						map.remove(list.get(j));
					}
				}
			}
			ArrayList<NameVersion> list2 = new ArrayList<>(map.keySet());
			dateSort(list2);
			ArrayList<List> arrayList = new ArrayList<>(map.values());
			for (List list3 : arrayList) {
				listSort(list3);
			}
		for (NameVersion nameVersion : list2) {
			List list3 = map.get(nameVersion);
			if(list3.size()>1)
			System.out.println(nameVersion+"----"+list3.get(0)+list3.get(list3.size()-1));
		}
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
}

	private static void listSort(List<String> list3) {
		Collections.sort(list3, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
	}

	private static void dateSort(ArrayList<NameVersion> list2) {
		Collections.sort(list2, new Comparator<NameVersion>() {
			@Override
			public int compare(NameVersion o1, NameVersion o2) {
				String[] split1 = o1.getName().split(",");
				String date1=split1[0];
				String[] split2 = o2.getName().split(",");
				String date2 =split2[0];
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date parse2 = null;
				Date parse1 = null;
				try {
					parse1 = sdf.parse(date1);
					parse2 = sdf.parse(date2);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return parse1.before(parse2)?-1:1;
			}
		});
	}
}
