package codibly.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedWordsCounterTest{
    @Test
    public void test1(){
        BalancedWordsCounter counter = new BalancedWordsCounter();
        int result = counter.count("aabbabcccba");
        assertEquals(28, result);
    }
    @Test
    public void testNull(){
        BalancedWordsCounter counter = new BalancedWordsCounter();
        try{
            counter.count(null);
            fail();
        }catch (RuntimeException expected){
        }
    }
    @Test
    public void testInvalidCharacter(){
        BalancedWordsCounter counter = new BalancedWordsCounter();
        try{
            counter.count("abababa1");
            fail();
        }catch (RuntimeException expected){
        }
    }
    @Test
    public void testEmpty(){
        BalancedWordsCounter counter = new BalancedWordsCounter();
        int result = counter.count("");
        assertEquals(0, result);
    }
}
