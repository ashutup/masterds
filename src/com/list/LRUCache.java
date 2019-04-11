package com.list;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
	/*
	 * HashMap and doubly linked list can be used to implement it, however java
	 * provides LinkedHashMap, where we can override removeEldestEntry method to
	 * make it work like LRU cache
	 */
	int capacity;

	public LRUCache(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
	}

	private Map<Integer, String> cache = new LinkedHashMap<Integer, String>() {

		protected boolean removeEldestEntry(Map.Entry<Integer, String> arg0) {
			boolean remove = false;
			if (size() > capacity) {
				remove = true;
				System.out
						.println("Cache is Full, removing least recently used entry from the cache");
			}
			return remove;
		};

	};

	public void add(int key, String value) {
		cache.put(key, value);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cache.toString();
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(5);

		cache.add(1, "Ashutosh");
		System.out.println(cache);

		cache.add(2, "Sameer");
		System.out.println(cache);

		cache.add(3, "Gaurva");
		System.out.println(cache);

		cache.add(4, "MAnish");
		System.out.println(cache);

		cache.add(5, "Sonu");
		System.out.println(cache);

		cache.add(6, "amit");
		System.out.println(cache);

		cache.add(7, "Sujeet");
		System.out.println(cache);

		cache.add(8, "neerav");
		System.out.println(cache);

		cache.add(9, "popli");
		System.out.println(cache);

		cache.add(10, "ausguta");
		System.out.println(cache);

		cache.add(11, "kaji");
		System.out.println(cache);

		cache.add(12, "goel");
		System.out.println(cache);

	}

}
