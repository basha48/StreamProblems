package com.addressbook.streams;

public class AddressBookMain {

	public static void main(String[] args) {
		AddressBookProblems ad = new AddressBookProblems();
		ad.addContacts();
		ad.printDuplicateElements();
		ad.printNoOfContacts("hyd");
		ad.printContactByCity("hyd");
		ad.AddressBookSystem();
	}

}
