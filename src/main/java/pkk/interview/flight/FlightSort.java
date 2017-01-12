package pkk.interview.flight;

import pkk.interview.sort.BubleSort;
import pkk.interview.sort.Sort;

import java.util.List;

/**
 * Created by root on 12.01.2017.
 */
public class FlightSort {

    private Sort<Flight> sort;

    //by default use BubleSort
    public FlightSort() {
        this.sort = new BubleSort<Flight>();
    }

    public FlightSort(Sort<Flight> sort) {
        this.sort = sort;
    }

    public void flightSort(List<Flight> flights, String rbds) {
        if (flights == null || rbds == null) {
            throw new NullPointerException();
        }
        if (flights.isEmpty() || rbds.isEmpty()) {
            throw new IllegalArgumentException();
        }
        for (Flight flight : flights) {
            if (rbds.indexOf(flight.getRbd()) < 0) {
                throw new IllegalArgumentException("rbds does not contain " + flight.getRbd());
            }
        }
        if (flights.size() == 1) {
            return;
        }

        FlightComparator comparator = new FlightComparator(rbds);
        sort.sort(flights, comparator);
    }


}
