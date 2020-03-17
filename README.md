# ArrayList
a repo to study ArrayList collection




		//working with ArrayList
		
		//creating arraylist
		ArrayList<String> array = new ArrayList<String>();
		array.add("Pepe");
		array.add("Pepe1");
		array.add("Pepe2");
		array.add("Pepe3");
		array.add("Pepe4");
		array.add("Pepe5");
		
		System.out.println("printing arraylist");//printing arraylist
		System.out.println(array);
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("printing arraylist one by one using method reference");//printing arraylist one by one using method reference
		array.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("deleting first element by index");//deleting by index
		array.remove(0);
		
		System.out.println("------------------------------------------------------------");

		System.out.println("printing after deleting");//printing after deleting
		array.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");

		System.out.println("adding new element in first position by index");//adding new element
		array.add(0, "New Pepe");
		System.out.println("------------------------------------------------------------");
		System.out.println("printing after adding new element");//printing after adding new element
		array.forEach(System.out::println);
		
		
		System.out.println("------------------------------------------------------------");
		array.set(0, "Pepe Changed");
		System.out.println("printing after set element in the first position");//printing after deleting
		array.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		array.remove("Pepe Changed");
		System.out.println("printing after deleting Pepe Changed");//printing after deleting
		array.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		System.out.println("printing array size");
		System.out.println(array.size());
		
		
		System.out.println("------------------------------------------------------------");
		System.out.println("sorting arraylist");
		Collections.sort(array);
		array.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		System.out.println("printing element index");
		System.out.println(array.indexOf("Pepe2"));
		
		System.out.println("------------------------------------------------------------");
		System.out.println("getting element by position");
		System.out.println(array.get(1));
		
		System.out.println("------------------------------------------------------------");
		System.out.println("if array contain element Pepe1");
		System.out.println(array.contains("Pepe1"));
		
		System.out.println("------------------------------------------------------------");
		System.out.println("deleting all elements in arraylist");
		array.clear();
		array.forEach(System.out::println);
