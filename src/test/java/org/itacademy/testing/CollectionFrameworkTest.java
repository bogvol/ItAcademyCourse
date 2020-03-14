package org.itacademy.testing;

import org.testng.annotations.Test;

import java.util.*;

public class CollectionFrameworkTest {

	@Test
	public void collectionsFrameworkTest() {
		// LinkedList example
		List<String> linkedListCars = new LinkedList<>();
		linkedListCars.add("Volvo");
		linkedListCars.add("Mazda");

		System.out.println("linkedListCars initial: " + Arrays.toString(linkedListCars.toArray()));
		System.out.println("linkedListCars first element: " + linkedListCars.get(0));

		linkedListCars.remove(0);
		linkedListCars.remove("Mazda");
		System.out.println("linkedListCars after removing: " + Arrays.toString(linkedListCars.toArray()));

		System.out.println("");
		System.out.println("");
		System.out.println("");

		// ArraysList example
		List<String> arrayListCars = new ArrayList<>();
		arrayListCars.add("Volvo");
		arrayListCars.add("Volvo");

		System.out.println("arrayListCars initial: " + Arrays.toString(arrayListCars.toArray()));
		System.out.println("arrayListCars first element: " + arrayListCars.get(0));

		arrayListCars.remove(0);
		arrayListCars.remove("Volvo");
		System.out.println("arrayListCars after removing: " + Arrays.toString(arrayListCars.toArray()));

		System.out.println("");
		System.out.println("");
		System.out.println("");

		// HashSet example
		Set<String> hashSetCars = new HashSet<>();
		hashSetCars.add("Volvo");
		hashSetCars.add("Volvo");
		hashSetCars.add("Mazda");
		System.out.println("hashSetCars initial: " + Arrays.toString(hashSetCars.toArray()));

		// classic for case
		for (Iterator<String> it = hashSetCars.iterator(); it.hasNext(); ) {
			String car = it.next();
			if (car.equals("Volvo")) {
				System.out.println("hashSetCars an element: "+ car);
			}
		}

		// for-each case
		for (String car : hashSetCars) {
			if (car.equals("Volvo")) {
				System.out.println("hashSetCars an element: " + car);
			}
		}

		hashSetCars.remove("Volvo");
		System.out.println("hashSetCars after removing: " + Arrays.toString(hashSetCars.toArray()));

		System.out.println("");
		System.out.println("");
		System.out.println("");

		// Map example
		Map<String, String> mapCars = new HashMap<>();
		mapCars.put("Trade mark #1", "Volvo");
		mapCars.put("Trade mark #2", "Volvo");
		mapCars.put("Trade mark #3", "Mazda");

		System.out.println("mapCars initial: " + Arrays.toString(mapCars.entrySet().toArray()));
		System.out.println("mapCars an element: " + mapCars.get("Trade mark #1"));

		mapCars.remove("Trade mark #1");
		System.out.println("mapCars after removing: " + Arrays.toString(mapCars.entrySet().toArray()));
	}
}
