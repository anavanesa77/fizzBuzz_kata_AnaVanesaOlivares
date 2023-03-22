import com.example.fizzbuzz_kata_anavanesaolivares.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FizzBuzzTest {

    /* 1-1
     *  3-fizz
     *  5-buzz
     *  15-fizzBuzz
     */

    @Test
    public void shows_same_number_when_it_is_not_divisible_by_three_and_five(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.modifyValue(2);
        Assertions.assertEquals("2",number);
    }

    @Test
    public void number_divisible_by_three_is_printed_fizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.modifyValue(3);
        Assertions.assertEquals("fizz",number);
    }

    @Test
    public void number_divisible_by_five_is_printed_buzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.modifyValue(5);
        Assertions.assertEquals("buzz",number);
    }

    @Test
    public void number_divisible_by_five_and_three_is_printed_fizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.modifyValue(15);
        Assertions.assertEquals("fizzBuzz",number);
    }
}