package week3CodingAssignment;

public class Week3CodingAssignment {

	public static void main(String[] args) {
		
		
		/**
		 * Coding Steps:
		 * 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
				a.	Programmatically subtract the value of the first element in the array from the value in the 
				last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
				b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays 
				of different lengths).
				c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 
	
		/**
		 *  1a. is below: 93 - 3 = 90 as the new last element in the ages int array
		 */
		
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] == ages[0]) {
				ages[ages.length -1] = ages[ages.length - 1] - ages[i];
			}
			System.out.println(ages[i]);
		}
	
		/**
		 *  1b. is below: since arrays are static and cannot be added to or subtracted from,
		 *    			 I will have to add the values from the old array, along with the single value
		 *    			 from the new array, to a combinedAges array
		 */    
		
		int[] newAges = {55};
		int[] combinedAges = new int[ages.length + newAges.length];
		int counter = 0;
		
		for (int i = 0; i < ages.length; i++) {
			combinedAges[counter] = ages[i];
			counter++;
			//System.out.println(combinedAges[i]);
		}
		
		for (int i = 0; i < newAges.length; i++) {
			combinedAges[counter] = newAges[i];
			counter++;
			//System.out.println(combinedAges[i]);
		}
	
		
		for (int i = 0; i < combinedAges.length; i++) {
			System.out.println(combinedAges[i]);
		}
		
		// 55 - 3 = 52 as the new last element in the combinedAges int array
		for (int i = 0; i < combinedAges.length; i++) {
			if (combinedAges[i] == combinedAges[0]) {
				combinedAges[combinedAges.length -1] = combinedAges[combinedAges.length - 1] - combinedAges[i];
			}
			System.out.println(combinedAges[i]);
		}
		
		/**
		 *  1c. is below:
		 */
		
		int sum = 0;
		for (int age : combinedAges) {
			sum += age;
		}
		int avgAge = sum / combinedAges.length;
		System.out.println(avgAge);
		
		
		/**
		 * 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 * 		a.	Use a loop to iterate through the array and calculate the average number of letters per name. 
		 * 			Print the result to the console.
		 *		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, 
		 *			and print the result to the console.
		 */
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		/**
		 *  2a. is below:
		 */
		double namesLength = names.length;
		double totalLetters = 0;
		//System.out.println(names[0].length());
		for (int i = 0; i < names.length; i++) {
			totalLetters += names[i].length();
		}
		double avgNumOfLetters = totalLetters / namesLength;
		
		System.out.println(avgNumOfLetters + " is the average number of letters for the array.");
		
		/**
		 *  2b. is below:
		 */
		String concatNames = "";
		for (int i = 0; i < names.length; i++) {
			concatNames += names[i] + " ";
		}
		System.out.println(concatNames);
		
		
		/**
		 *  3.	How do you access the last element of any array?
		 * 		In order to access the last element of an array programmatically, 
		 * 		you would need to declare the array name and use [arrayName.length - 1] 
		 * 		(accounting for the for the indexing beginning at equals 0). See below for example
		 */
		
		int[] array = {1, 5, 10, 15};
		System.out.println(array[array.length - 1]);
		
		
		/**
		 *  4.	How do you access the first element of any array?
		 *  	Use "0" to access the first element of an array or
		 *  	arrayName[array.length - array.length] (which feels redundant).
		 */
		System.out.println(array[0]);
		System.out.println(array[array.length - array.length]);
		
		
		/**
		 *  5.	Create a new array of int called nameLengths. 
		 *  	Write a loop to iterate over the previously created names array and 
		 *  	add the length of each name to the nameLengths array.
		 */
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] += names[i].length();
		}
		// print out the new nameLengths array
		for (int name : nameLengths) {
			System.out.println(name);
		}
		
		
		/**
		 *  6.	Write a loop to iterate over the nameLengths array and calculate the sum of all 
		 *  	the elements in the array. Print the result to the console.
		 */
		
		int sumOfNameLengths = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sumOfNameLengths += nameLengths[i];
		}
		System.out.println(sumOfNameLengths);
		
		
		/**
		 * 7. Calling Method from question 7. 
		 */
		System.out.println(multiplyString("Hello", 3));
		
		
		/**
		 * 8. Calling Method from question 8.
		 */
		System.out.println(createFullName("Luka", "Doncic"));
		
		
		/**
		 * 9. Calling Method from question 9.
		 */
		int[] testArray = {0, 99, 2}; // equals 101
		System.out.println(evalIntOver100(testArray));
		
		
		/**
		 * 10.	Calling Method from question 10.
		 */
		double[] testDoubleArray1 = {0.2, 4.4, 6.6, 8.8, 100.0};
		System.out.println(getAverage(testDoubleArray1));
		
		
		/**
		 * 11. Calling Method from question 11.
		 */
		double[] testDoubleArray2 = {0.2, 4.4, 6.6, 8.8, 10.0};
		System.out.println(compareAvgArr1AndArr2(testDoubleArray1, testDoubleArray2));
		
		
		/**
		 * 12. Calling Method from question 12.
		 */
		boolean isHotOutside = true;
		double moneyInPocket = 22.00;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		
		/**
		 * 13. Calling Method from question 13.
		 */
		double hoursOfSleep1 = 6;
		int numTimesWokenUp1 = 2;
		boolean isSick1 = false;
		System.out.println(wakeUpEarly(hoursOfSleep1, numTimesWokenUp1, isSick1)); // false
		
		double hoursOfSleep2 = 6;
		int numTimesWokenUp2 = 1;
		boolean isSick2 = false;
		System.out.println(wakeUpEarly(hoursOfSleep2, numTimesWokenUp2, isSick2)); // true
		
	}

	/////// METHODS ARE BELOW ///////
	
	/**
	 *  7.	Write a method that takes a String, word, and an int, n, as arguments and returns the 
	 * 		word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
	 * 		I would expect the method to return “HelloHelloHello”).
	 */
	 
	public static String multiplyString (String word, int n) {
		String newWord = "";
		for (int i = 0; i < n; i++) {
			newWord += word;
		}
		return newWord;
	}
	
	/**
	 * 8.	Write a method that takes two Strings, firstName and lastName, and returns a 
	 * 		full name (the full name should be the first and the last name as a String separated 
	 * 		by a space).
	 */
	
	public static String createFullName (String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	
	/**
	 * 9.	Write a method that takes an array of int and returns true if 
	 * 		the sum of all the ints in the array is greater than 100.
	 */
	public static boolean evalIntOver100 (int[] arr) {
		
		int sumArray = 0;
		boolean x;
		for (int i = 0; i < arr.length; i++) {
			sumArray += arr[i];
		}
		if (sumArray > 100) {
		x = true;
		} else {
			x = false;
		}
		return x;
	}
	
	
	/**
	 * 10.	Write a method that takes an array of double and 
	 * 		returns the average of all the elements in the array.
	 */
	public static double getAverage(double[] doubleArray) {
	
		double totalOfDouble = 0;
		double lengthOfDoubleArray = doubleArray.length;
		
		for (int i = 0; i < doubleArray.length; i++) {
			totalOfDouble += doubleArray[i];
		}
		double avgOfDouble = totalOfDouble / lengthOfDoubleArray;
		return avgOfDouble;
	}
	
	
	/**
	 * 11.	Write a method that takes two arrays of double and returns 
	 * 		true if the average of the elements in the first array is 
	 * 		greater than the average of the elements in the second array.
	 */
	
	public static boolean compareAvgArr1AndArr2(double[] arrayDouble1, double[] arrayDouble2) {
		
		double a1 = getAverage(arrayDouble1);
		double a2 = getAverage(arrayDouble2);
		boolean x;
		if (a1 > a2) {
			x = true;
		} else {
			x = false;
		} 
		return x;
	}
	
	
	/**
	 * 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, 
	 * 		and a double moneyInPocket, and returns true if it is hot outside and if 
	 * 		moneyInPocket is greater than 10.50.
	 */

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean x;
		if (isHotOutside == true && moneyInPocket > 10.50) {
			x = true;
		} else {
			x = false;
		}
		return x;
		
	}
	
	/**
	 * 13.	Create a method of your own that solves a problem. 
	 * 		In comments, write what the method does and why you created it.
	 * 
	 * 		It's hard to decide whether to wake up early and begin work or to start at a normal time.
	 * 		The variables that influence my decision on if I will wake up early are the number of hours
	 * 		that I sleep, the number of times my kids wake me up, and if I am sick or not. This program
	 * 		will help me make a more definitive decision on whether it would be more beneficial to me to sleep in
	 * 		or to wake up early.
	 */
	
	public static boolean wakeUpEarly(double hoursOfSleep, int numTimesWokenUp, boolean isSick) {
		boolean x = false;
		if (hoursOfSleep >= 6.25) {
			if(numTimesWokenUp <= 3) {
				if(isSick == false) {
					x = true;
				}
			}
		} else if (hoursOfSleep >= 5.75) {
			if (numTimesWokenUp <= 1) {
				x = true;
			}
		} else {
			x = false;
		}
		
		return x;
	}
	
	
}
