package codibly.exercise2;

import java.util.HashMap;
import java.util.Iterator;

public class BalancedWordsCounter{
    private final HashMap<Character, Integer> occurrences = new HashMap<>();
    public int count(String input){
        if(input.isEmpty()){
            return 0;
        }
        validateInput(input);

        int length = input.length();
        //add one and two character long sequences
        int balancedWords = length * 2 - 1;

        for (int boundary = 2; boundary < length; boundary++){
            for (int i = 0; i < length - boundary; i++){
                //this could be improved by checking characters in an array instead of creating a new string instance
                String subword = input.substring(i, i+boundary+1);
                if(isBalanced(subword)){
                    balancedWords++;
                }
            }
        }

        return balancedWords;
    }

    private void validateInput(String input){
        if(input == null){
            throw new RuntimeException("Input cannot be null");
        }
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(!Character.isLetter(c)){
                throw new RuntimeException("Unexpected character at index: " + i);
            }
        }
    }

    private boolean isBalanced(String subword){
        if(subword.length() < 3){
            return true;
        }
        occurrences.clear();
        for (int i = 0; i < subword.length(); i++){
            char c = subword.charAt(i);

            if(occurrences.containsKey(c)){
                occurrences.put(c, occurrences.get(c) + 1);
            }else{
                occurrences.put(c, 1);
            }
        }
        Iterator<Integer> iterator = occurrences.values().iterator();
        int first = iterator.next();
        while(iterator.hasNext()){
            if(first != iterator.next())
                return false;
        }
        return true;
    }
}