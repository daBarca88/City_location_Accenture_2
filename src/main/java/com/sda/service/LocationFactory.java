package com.sda.service;

import com.sda.model.*;

import java.util.ArrayList;
import java.util.List;

public class LocationFactory {

    public City createCity(String name) {
        return new City(name, new ArrayList<Location>(), new ArrayList<Person>());
    }

    public Park createPark(String name, String address, int size) {
        return new Park(name, address, size, new ArrayList<Person>());

    }

    public Stadium createStadium(String name, String address, int size) {
        return new Stadium(name, address, size, new ArrayList<Person>());
    }

    public Cafe createCafe(String name, String address, int size) {
        return new Cafe(name, address, size, new ArrayList<Person>());
    }

    public Shop createShop(String name, String address, int size) {
        return new Shop(name, address, size, new ArrayList<Person>());
    }

    public Metro createMetro(String name, String address, int size) {
        return new Metro(name, address, size, new ArrayList<Person>());
    }

}
