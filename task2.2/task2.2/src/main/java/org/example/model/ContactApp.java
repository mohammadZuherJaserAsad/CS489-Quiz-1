package org.example.model;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.Comparator;

public class ContactApp {
    public static void main(String[] args) {
        // Sample Contacts data
        Contact[] contacts = {
                new Contact("John", "Doe", "Acme Inc.", "Manager"),
                new Contact("Alice", "Smith", "XYZ Corp", "Engineer"),
                new Contact("Bob", "Johnson", "ABC Ltd.", "Designer"),
                new Contact("Emily", "Brown", "Tech Solutions", "Developer")
        };

        // Sort contacts array by Last Name in ascending order
        Arrays.sort(contacts, Comparator.comparing(Contact::getLastName));

        // Convert contacts array to JSON format
        Gson gson = new Gson();
        String jsonContacts = gson.toJson(contacts);

        // Print JSON formatted contact data
        System.out.println(jsonContacts);
    }
}