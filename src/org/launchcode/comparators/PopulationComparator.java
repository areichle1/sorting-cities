package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        Comparator<City> byPopulation = Comparator.comparingInt(City::getPopulation);
        return byPopulation.reversed().compare(o1, o2);
    }
}
