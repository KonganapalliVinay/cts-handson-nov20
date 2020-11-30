package com.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAnonymous {

	public static void main(String[] args) {
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(200, "mobile", 10000));
		list.add(new Items(600, "laptop", 30000));
		list.add(new Items(900, "tv", 20000));
		list.add(new Items(100, "computer", 25000));
		for (Items i : list) {
			System.out.println(i);
		}
		System.out.println("Sorting by name in ascending order");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items o1, Items o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (Items i : list) {
			System.out.println(i);
		}
		System.out.println("Sorting by name in descending order");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items o1, Items o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		for (Items i : list) {
			System.out.println(i);
		}
		System.out.println("Sorting by price in ascending order");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items o1, Items o2) {
				return o1.getPrice() - (o2.getPrice());
			}
		});
		for (Items i : list) {
			System.out.println(i);
		}
		System.out.println("Sorting by price in descending order");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items o1, Items o2) {
				return o2.getPrice() - (o1.getPrice());
			}
		});
		for (Items i : list) {
			System.out.println(i);
		}
		System.out.println("Sorting by id in ascending order");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items o1, Items o2) {
				return o1.getId()-(o2.getId());
			}
		});
		for (Items i : list) {
			System.out.println(i);
		}
		System.out.println("Sorting by id in descending order");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items o1, Items o2) {
				return o2.getId()-(o1.getId());
			}
		});
		for (Items i : list) {
			System.out.println(i);
		}
	}

}
