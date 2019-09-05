package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class AreaComparator implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        Comparator<City> byArea = Comparator.comparingDouble(City::getArea);
        return byArea.reversed().compare(o1, o2);
    }
}
