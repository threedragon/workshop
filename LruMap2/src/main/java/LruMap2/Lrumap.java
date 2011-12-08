package LruMap2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Lrumap<K,V> {

	private int sizeNum;
	private Map<K,V> datamap;
	private List<K> history;
	private List<Long> timestamp;

	public Lrumap(int in_size)
	{
		if (in_size < 1) {
			throw new IllegalArgumentException();
		}
		sizeNum = in_size;
		datamap = new HashMap<K, V>();
		history = new LinkedList<K>();
	}

	int maxSize()
	{
		return sizeNum;
	}

	public void put(K key, V value) {
		if (history.indexOf(key) != -1) {
			history.remove(key);
		}
		datamap.put(key, value);
		history.add(key);

		checkSize();
	}

	public V get(K key) {
		int num = history.indexOf(key);
		if (num != -1)
		{
			history.remove(num);
			history.add(key);
		}
		return datamap.get(key);
	}

	public void ModifySize(int in_size) {

		if (in_size <= 0)
		{
			throw new IllegalArgumentException();
		}
		sizeNum=in_size;
		while(checkSize());
	}

	private boolean checkSize()
	{
		boolean overFlag = false;
		if (history.size() > sizeNum)
		{
			datamap.remove(history.get(0));
			history.remove(0);
			overFlag = true;
		}
		return overFlag;

	}
	
	private long getCurrentTime() {
		long now = System.currentTimeMillis();
		
		return now;
	}
	
	private void delTimeup() {
		
	}


}
