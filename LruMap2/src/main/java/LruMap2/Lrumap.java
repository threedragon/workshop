package LruMap2;

import java.util.HashMap;
import java.util.Map;

public class Lrumap {

	int sizeNum;
	Map<String,String> map;

	Lrumap(int a)
	{
		sizeNum = a;
		map = new HashMap<String, String>();
	}
	int size()
	{
		return sizeNum;
	}
	public void put(String string, String string2) {
		// TODO 自動生成されたメソッド・スタブ
		map.put(string , string2);

		if (map.size() > sizeNum)
		{
			map.remove("A");
		}
	}
	
	public String get(String string) {
		// TODO 自動生成されたメソッド・スタブ
		return map.get(string);

	}



}
