package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class CollectionsMain {

	public static void main(String[] args) {

		//working with ArrayList
		
		//creating arraylist
		ArrayList<String> array = new ArrayList<String>();
		array.add("Pepe");
		array.add("Pepe1");
		array.add("Pepe2");
		array.add("Pepe3");
		array.add("Pepe4");
		array.add("Pepe5");
		
		System.out.println("1-printing arraylist");//printing arraylist
		System.out.println(array);
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("2-printing arraylist one by one using method reference");//printing arraylist one by one using method reference
		array.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("3-deleting first element by index");//deleting by index
		array.remove(0);
		
		System.out.println("------------------------------------------------------------");

		System.out.println("4-printing after deleting");//printing after deleting
		array.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");

		System.out.println("5-adding new element in first position by index");//adding new element
		array.add(0, "New Pepe");
		System.out.println("------------------------------------------------------------");
		System.out.println("printing after adding new element");//printing after adding new element
		array.forEach(System.out::println);
		
		
		System.out.println("------------------------------------------------------------");
		array.set(0, "Pepe Changed");
		System.out.println("6-printing after set element in the first position");//printing after deleting
		array.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		array.remove("Pepe Changed");
		System.out.println("7-printing after deleting Pepe Changed");//printing after deleting
		array.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		System.out.println("8-printing array size");
		System.out.println(array.size());
		
		
		System.out.println("------------------------------------------------------------");
		System.out.println("9-sorting arraylist");
		Collections.sort(array);
		array.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		System.out.println("10-printing element index");
		System.out.println(array.indexOf("Pepe2"));
		
		System.out.println("------------------------------------------------------------");
		System.out.println("11-getting element by position");
		System.out.println(array.get(1));
		
		System.out.println("------------------------------------------------------------");
		System.out.println("12-if array contain element Pepe1");
		System.out.println(array.contains("Pepe1"));
		
		System.out.println("------------------------------------------------------------");
		System.out.println("13-deleting all elements in arraylist");
		array.clear();
		array.forEach(System.out::println);
		
		//adding elements into array
		array.add("Pepe");
		array.add("Pepe1");
		array.add("Pepe2");
		array.add("Pepe3");
		array.add("Pepe4");
		array.add("Pepe5");
		//creating new arraylist
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("Pipo");
		array1.add("Pipo1");
		array1.add("Pipo2");
		array1.add("Pipo3");
		array1.add("Pipo4");
		array1.add("Pipo5");
		
		//adding all element of array1 into array
		System.out.println("------------------------------------------------------------");
		System.out.println("14-adding all element of array1 into array");
		array.addAll(array1);
		System.out.println("printing array elements");
		array.forEach(System.out::println);
		
		//clearing array
		array.clear();
		//adding elements into array
		array.add("Pepe");
		array.add("Pepe1");
		array.add("Pepe2");
		array.add("Pepe3");
		array.add("Pepe4");
		array.add("Pepe5");
		
		//adding a collection in array in specific index
		System.out.println("------------------------------------------------------------");
		System.out.println("15-adding a collection in array in specific index");
		array.addAll(2,array1);
		System.out.println("printing array elements");
		array.forEach(System.out::println);
		
		//get sublist from arraylist
		System.out.println("------------------------------------------------------------");
		System.out.println("15-get sublist from arraylistx");
		
		ArrayList<String> sublist = new ArrayList<String>(array.subList(1, 3));
		System.out.println("printing sublist");
		sublist.forEach(System.out::println);
		
		//comparing two arraylist(using a looong way)
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("Casa");
		array2.add("Coco");
		array2.add("Vianda");
		array2.add("Nene");
		
		ArrayList<String> array3 = new ArrayList<String>();
		array3.add("Casa");
		array3.add("Coco");
		array3.add("Vianda");
		array3.add("Nenes");
		
		ArrayList<String> arrayTemp = new ArrayList<String>();
		
		for (String tmp : array3) {
			
			arrayTemp.add(array2.contains(tmp) ? "true":"false");
		}
		
		long cont = arrayTemp.stream().filter(a -> a == "false").count();
		
		if (cont > 0) {
			System.out.println("Not equals");
		}
		else
			System.out.println("Equals");
		
		//comparing using equals(using a short way)
		if (array2.equals(array3)) {
			System.out.println("Equals");
		}
		else
			System.out.println("Not Equals");
		
		//calculating if two words are anagrams
		String word1 = "peek";
		String word2 = "keep";
		ArrayList<String> tmpArray = new ArrayList<String>();
		
		if(word1.length() == word2.length()) {
			for (int i = 0; i < word1.length(); i++) {
				 
				tmpArray.add(word2.contains(Character.toString(word1.charAt(i))) ? "true":"false");			
			}
			//ONE SOLUTION

			long tmp = tmpArray.stream().filter(a -> a == "false").count();
			
			if (tmp > 0) {
				System.out.println("The words are not anagrams");
			}
			else
				System.out.println("The words are Anagrams");
			
			//OTHER SOLUTION
			
			if (tmpArray.contains("false")) {
				System.out.println("The words are not anagrams");
			}
			else
				System.out.println("The words are Anagrams");
		}
		else
			System.out.println("The words are not Anagrams");
	}
	

}
