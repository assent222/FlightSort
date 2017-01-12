package pkk.interview.sort;

import java.util.Comparator;
import java.util.List;

/**
 * Created by root on 12.01.2017.
 */
public class BubleSort<T> implements Sort<T> {

    @Override
    public void sort(List<T> list, Comparator<T> comparator) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i; j++) {
                if (comparator.compare(list.get(j - 1), list.get(j)) > 0) {
                    switchPair(list, j);
                }
            }
        }
    }

    private void switchPair(List<T> list, int index) {
        T tmp = list.get(index);
        list.set(index, list.get(index - 1));
        list.set(index - 1, tmp);
    }

}
