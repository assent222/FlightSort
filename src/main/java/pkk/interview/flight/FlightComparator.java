package pkk.interview.flight;

import java.util.Comparator;

public class FlightComparator implements Comparator<Flight> {

    final String rbds;

    FlightComparator(String rbds) {
        this.rbds = rbds;
    }

    public int compare(Flight a, Flight b) {
        int rbda = rbds.indexOf(a.getRbd());
        int rbdb = rbds.indexOf(b.getRbd());
        return Integer.compare(rbda, rbdb);
    }
}