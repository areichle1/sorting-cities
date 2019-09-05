package org.launchcode;

import org.launchcode.comparators.AreaComparator;
import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        System.out.println("list by city");
        System.out.println("====================================");
        NameComparator nameComparator = new NameComparator();
        cities.sort(nameComparator);
        printCities(cities);
        System.out.println("\n");

        System.out.println("list by state");
        System.out.println("====================================");
        StateComparator stateComparator = new StateComparator();
        cities.sort(stateComparator);
        printCities(cities);
        System.out.println("\n");

        System.out.println("list by population");
        System.out.println("====================================");
        PopulationComparator popComparator = new PopulationComparator();
        cities.sort(popComparator);
        printCities(cities);
        System.out.println("\n");

        System.out.println("list by area");
        System.out.println("====================================");
        AreaComparator areaComparator = new AreaComparator();
        cities.sort(areaComparator);
        printCities(cities);
        System.out.println("\n");

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
