package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void say_same_input(){
        assertEquals("1", fizzBuzz.say(1));
        assertEquals("2", fizzBuzz.say(2));
    }

    @Test
    public void input_3_should_be_say_fizz(){
        assertEquals("Fizz", fizzBuzz.say(3));
    }

}
