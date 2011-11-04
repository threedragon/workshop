package LruMap2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Lrumap {

	int sizeNum;
	Map<String,String> map;
	List<String> list;

	Lrumap(int a)
	{
		sizeNum = a;
		map = new HashMap<String, String>();
		list = new LinkedList<String>();
	}
	int size()
	{
		return sizeNum;
	}
	public void put(String string, String string2) {
		// TODO 自動生成されたメソッド・スタブ
		map.put(string , string2);
		list.add(string);

		if (map.size() > sizeNum)
		{
			map.remove(list.get(0));
			list.remove(0);
		}
	}

	public String get(String string) {
		// TODO 自動生成されたメソッド・スタブ
		return map.get(string);

	}



}
