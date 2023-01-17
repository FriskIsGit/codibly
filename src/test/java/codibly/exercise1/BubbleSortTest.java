package codibly.exercise1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest{

    @Test
    public void testIntegers(){
        BubbleSort sort = new BubbleSort();

        List<Comparable<Double>> input = Arrays.asList(1d,4d,5d,6d,8d,3d,8d);
        List<Comparable<Double>> result = sort.sort(input);

        List<Comparable<Double>> expected = Arrays.asList(1d,3d,4d,5d,6d,8d,8d);
        assertEquals(expected, result);
    }
    @Test
    public void testDoubles(){
        BubbleSort sort = new BubbleSort();
        List<Comparable<Double>> input = Arrays.asList(-9.3,0.2,4d,0.1,5d,9d);
        List<Comparable<Double>> result = sort.sort(input);

        List<Comparable<Double>> expected = Arrays.asList(-9.3,0.1,0.2,4d,5d,9d);
        assertEquals(expected, result);
    }
    @Test
    public void testEmpty(){
        BubbleSort sort = new BubbleSort();
        List<Comparable<Double>> input = List.of();
        List<Comparable<Double>> result = sort.sort(input);

        List<Comparable<Double>> expected = List.of();
        assertEquals(expected, result);
    }
}
