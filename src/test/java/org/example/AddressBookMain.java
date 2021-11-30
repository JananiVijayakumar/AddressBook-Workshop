package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    List<AddressBookData> AddressBookDetails = new ArrayList<>();
        public static boolean addContactsToAddressBook(){
            AddressBookData addressBookData = new AddressBookData();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the FirstName : ");
            String fname = sc.next();
            System.out.println("Enter the LastName : ");
            String lname = sc.next();
            System.out.println("Enter the Address : ");
            String address = sc.next();
            System.out.println("Enter the City : ");
            String city = sc.next();
            System.out.println("Enter the State : ");
            String state = sc.next();
            System.out.println("Enter the Email : ");
            String eMail = sc.next();
            System.out.println("Enter the Zip Code : ");
            int zipCode = sc.nextInt();
            System.out.println("Enter the Mobile Number : ");
            long mobileNumber = sc.nextLong();
            return true;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        try {
            if (!addContactsToAddressBook()){
                throw new Exception("Enter Address Book Details ");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
}
}