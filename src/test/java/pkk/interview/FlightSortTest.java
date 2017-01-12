package pkk.interview;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pkk.interview.flight.Flight;
import pkk.interview.flight.FlightSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by root on 12.01.2017.
 */
public class FlightSortTest {

    private FlightSort flightSort;

    @Before
    public void setUp() throws Exception {
        flightSort = new FlightSort();
    }

    @Test
    public void flightSort_00() throws Exception {
        List<Flight> flights = new ArrayList<>(Arrays.asList(new Flight[]{
                new Flight("A"),
                new Flight("B"),
                new Flight("C"),
        }));

        String rbds = "CBA";

        System.out.println(flights);
        flightSort.flightSort(flights, rbds);
        System.out.println(flights);

        Assert.assertEquals(string2flights(rbds), flights);
    }

    @Test
    public void flightSort_01() throws Exception {
        List<Flight> flights = new ArrayList<>(Arrays.asList(new Flight[]{
                new Flight("A"),
        }));

        String rbds = "A";

        System.out.println(flights);
        flightSort.flightSort(flights, rbds);
        System.out.println(flights);

        Assert.assertEquals(string2flights(rbds), flights);
    }

    @Test(expected = IllegalArgumentException.class)
    public void flightSort_02() throws Exception {
        List<Flight> flights = new ArrayList<>(Arrays.asList(new Flight[]{}));
        String rbds = "A";
        flightSort.flightSort(flights, rbds);
    }


    @Test(expected = NullPointerException.class)
    public void flightSort_exception_00() throws Exception {
        List<Flight> flights = new ArrayList<>(Arrays.asList(new Flight[]{
                new Flight("A"),
                new Flight("B"),
                new Flight("C"),
        }));

        flightSort.flightSort(flights, null);
    }

    @Test(expected = NullPointerException.class)
    public void flightSort_exception_01() throws Exception {
        flightSort.flightSort(null, "AAA");
    }

    @Test(expected = IllegalArgumentException.class)
    public void flightSort_exception_02() throws Exception {
        List<Flight> flights = new ArrayList<>(Arrays.asList(new Flight[]{
                new Flight("A"),
                new Flight("B"),
                new Flight("C"),
        }));

        flightSort.flightSort(flights, "AAA");
    }

    private List<Flight> string2flights(String rbds) {
        List<Flight> flights = new ArrayList<>(rbds.length());
        for (char c : rbds.toCharArray()) {
            flights.add(new Flight(String.valueOf(c)));
        }
        return flights;
    }
}