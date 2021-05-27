package com.sda.model;

import java.util.List;

public class City {
    private String name;
    private List<Location> locations;
    private List<Person> persons;

    public City(String name, List<Location> locations, List<Person> persons) {
        this.name = name;
        this.locations = locations;
        this.persons = persons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
