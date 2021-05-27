package com.sda.service;

import com.sda.model.Location;
import com.sda.model.Person;

import java.util.List;

public class PersonProcessor {

    public void removePerson(Location location, Person person) {
        List<Person> persons = location.getPersons();
        persons.remove(person);
    }

    public void addPerson(Location location, Person person) {
        List<Person> persons = location.getPersons();

    }
}
