package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoApp {

	public static void main(String[] args) {
		PersonManager pm = new PersonManager();
		for (int i = 1; i <= 100; i++) {
			pm.addPerson(createTestPerson());
		}

		GenderAnalyzer genderAnalyzer = new GenderAnalyzer();
		pm.doAnalysis(genderAnalyzer);

		CountryAnalyzer countryAnalyzer = new CountryAnalyzer();
		pm.doAnalysis(countryAnalyzer);
		HashMap<String, Integer> countryResult = countryAnalyzer.getResult(); // STRG+ALT+V => Variable erzeugen
		for (String country : countryResult.keySet()) {
			System.out.println(country + " : " + countryResult.get(country));
		}

		MaxSalaryAnalyzer maxSalaryAnalyzer = new MaxSalaryAnalyzer();
		pm.doAnalysis(maxSalaryAnalyzer);

		BMIAnalyzer bmiAnalyzer = new BMIAnalyzer();
		pm.doAnalysis(bmiAnalyzer);
		ArrayList<Pair<Person, Double>> result = bmiAnalyzer.getResult();
		for (Pair<Person, Double> personBmiPair : result) {
			System.out.println(personBmiPair.getKey() + " : " + personBmiPair.getValue());
		}

	}
	
	
	public static Person createTestPerson()
	{
		String[] firstnames = new String[] {"John", "Max", "Susi", "Georg", "Gerald", "Michael", "Steve", "J�rg", "Sebastian", "Louis", "Thomas", "Tom", "Sandra", "Beate", "Birgit"};
		String[] lastnames = new String[] {"Muster", "Doe", "Schultz", "Cuevas", "Rhodes", "Mckenzie", "Taylor", "Glenn", "Reilly", "Morris", "Herman", "Beltran", "Swanson", "Roth"};
		String[] eyeColors = new String[] {"blau", "braun", "grün", "gelb"};
		String[] countries = new String[] {"AT", "DE", "CH", "SI"};
		char[] genders = new char[] {'M', 'F'};
		
		Person p = new Person(
				getRandom(firstnames), getRandom(lastnames), 
				getRandom(genders), 
				(int) (Math.random()* 100.0), 
				getRandom(countries), (int) (Math.random() * 5900) + 1000, 
				getRandom(eyeColors), (int) (Math.random() * 50) + 50,
				(int)(Math.random() * 50) + 160);
		

	
		return p;
	}
	
	public static String getRandom(String[] arr)
	{
		return arr[(int) (Math.random() * 100.0) % arr.length];
	}
	
	public static char getRandom(char[] arr)
	{
		return arr[(int) (Math.random() * 100) % arr.length];		
	}
	
}
