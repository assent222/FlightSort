package pkk.interview.sort;

import java.util.Comparator;
import java.util.List;

/**
 * Created by root on 12.01.2017.
 */
public interface Sort<T> {
    void sort(List<T> list, Comparator<T> comparator);
}
