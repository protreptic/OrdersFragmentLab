package name.peterbukhal.android.ordersfragmentlab.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import name.peterbukhal.android.ordersfragmentlab.model.impl.CityImpl;

/**
 * Created by
 *      petronic on 21.03.16.
 */
public class Cities {

    private List<City> cities;

    public Cities(List<City> cities) {
        this.cities = new ArrayList<>(cities);
    }

    public List<City> getCities() {
        return Collections.unmodifiableList(cities);
    }

}
