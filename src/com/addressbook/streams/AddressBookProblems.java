package com.addressbook.streams;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


public class AddressBookProblems {
	
	static List<Contact> peoples = new ArrayList<Contact>();
	static List<Contact> persons = new ArrayList<Contact>();
	
	 Scanner sc = new Scanner(System.in);
	 Contact person = new Contact();
	 public List<Contact> people = new ArrayList<Contact>();
	 
	public void AddressBookSystem() {	
	Hashtable<String, Object> addressBookSystem = new Hashtable<String, Object>();
	addressBookSystem.put("Hydrabad", peoples);
	System.out.println("peoples in hyderabad are :" + addressBookSystem.get("Hydrabad"));
	}
	
	public static <T> Set<Contact> findDuplicateBySetAdd(List<T> list) {
        Set<T> items = new HashSet<>();
        return peoples.stream()
                .filter(n -> !items.add((T) n.firstName)) // Set.add() returns false if the element was already in the set.
                .collect(Collectors.toSet());

    }
	
	 public void printDuplicateElements()
	 {
		 Set<Contact> result = findDuplicateBySetAdd(peoples);
		 result.forEach(n -> {System.out.println("The duplicate element is " + n.firstName);
		 });
	 }
	 
	 public void printContactByCity(String city)
	 {
		 List<Contact> result = (List<Contact>) peoples.stream().filter(n -> n.city.equals(city)).collect(Collectors.toList());
		 result.forEach(n -> {System.out.println("The persons in a city are " + n.firstName);
			 
		 });
	 }
	 
	 public void printNoOfContacts(String city)
	 {
		long count = peoples.stream().filter(n -> n.city.equals(city)).count();
		System.out.println("The no of persons in a city are " + count);
			 
	 }
	 
	 public void addContacts() {
		
		System.out.println(" Enter First Name :");
		person.firstName = sc.nextLine();

		System.out.println("Last Name :");
		person.lastName = sc.nextLine();

		System.out.println("Address :");
		
		person.address = sc.nextLine();

		System.out.println("City :");
		person.city = sc.nextLine();

		System.out.println("State :");
		person.state = sc.nextLine();

		System.out.println("Zip :");
		person.zip = sc.nextLine();

		System.out.println("Phone Number :");
		person.phoneNumber = sc.nextLine();

		System.out.println("Email :");
		person.email = sc.nextLine();
		
		peoples.add(person);
	}
}
