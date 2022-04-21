package com.zipcodewilmington.phonebook;


import java.util.*;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;


    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this(new LinkedHashMap<>());
    }

    public void add(String name, String phoneNumber) {

        phonebook.put(name, List.of(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {

        phonebook.put(name, List.of(phoneNumbers));

    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name, String phoneNumber) {

            if (phonebook.containsKey(name) && phonebook.containsValue(List.of(phoneNumber))){
                return true;

        }
        return false;
    }

    public List<String> lookup(String name) {

        for (Map.Entry<String, List<String>> entry:phonebook.entrySet()) {
            if (entry.getKey().equals(name)) {
                return entry.getValue();
            }
        }
             return null;
    }

    public String reverseLookup(String phoneNumber)  {

        for (Map.Entry<String, List<String>> entry:phonebook.entrySet()) {
            if (entry.getValue().equals(List.of(phoneNumber))) {
                return entry.getKey();
            }
        }

        return null;
    }

    public List<String> getAllContactNames() {

        ArrayList<String> contacts = new ArrayList();
        for (Map.Entry<String, List<String>> c:phonebook.entrySet()) {
            contacts.add(c.getKey());
        }

        return contacts;
    }

    public Map<String, List<String>> getMap() {

        return phonebook;
    }


}
