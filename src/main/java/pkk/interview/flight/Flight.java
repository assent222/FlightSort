package pkk.interview.flight;

/**
 * Created by root on 12.01.2017.
 */
public class Flight {
    private final String rbd;

    public Flight(String rbd) {
        if (rbd == null) {
            throw new NullPointerException();
        }
        if (rbd.length() != 1) {
            throw new IllegalArgumentException();
        }
        this.rbd = rbd;
    }

    public String getRbd() {
        return rbd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        return rbd != null ? rbd.equals(flight.rbd) : flight.rbd == null;
    }

//    @Override
//    public int hashCode() {
//        return rbd != null ? rbd.hashCode() : 0;
//    }

    @Override
    public String toString() {
        return "Flight{" +
                "rbd='" + rbd + '\'' +
                '}';
    }
}
