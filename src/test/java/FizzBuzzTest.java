import com.example.fizzbuzz_kata_anavanesaolivares.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class fizzBuzzShould {

    /* 1-1
     *  3-fizz
     *  5-buzz
     *  15-fizzBuzz
     */

    @Test
    public void print_same_number_when_it_is_not_divisible_by_three_and_five(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.execute(2);
        Assertions.assertEquals("2", number);
    }

    @Test
    public void print_fizz_when_it_is_divisible_by_three(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.execute(3);
        Assertions.assertEquals("fizz",number);
    }

    @Test
    public void print_buzz_when_it_is_divisible_by_five(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.execute(5);
        Assertions.assertEquals("buzz",number);
    }

    @Test
    public void print_fizzBuzz_when_it_is_divisible_by_three_and_five(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.execute(15);
        Assertions.assertEquals("fizzBuzz",number);
    }
}