package codibly.exercise1;

import java.util.List;

public class BubbleSort{

    public List<Comparable<Double>> sort(List<Comparable<Double>> input){
        if(input == null){
            throw new RuntimeException("Input cannot be null");
        }
        for (int i = 0; i < input.size(); i++){
            Comparable<Double> el = input.get(i);
            if(el == null){
                input.remove(i--);
            }
        }
        int size = input.size();
        for (int i = 0; i < size - 1; i++){
            for (int j = 0; j < size - 1; j++){
                Comparable<Double> left  = input.get(j);
                Comparable<Double> right = input.get(j + 1);

                if(left.compareTo((Double) right) > 0){
                    input.set(j, right);
                    input.set(j+1, left);
                }
            }
        }
        return input;
    }
}