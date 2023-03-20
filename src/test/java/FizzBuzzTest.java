import com.example.fizzbuzz_kata_anavanesaolivares.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    /* 1-1
    *  3-fizz
    *  5-buzz
    *  15-fizzBuzz
    */


    @Test
    public void testTeMuestreElMismoNumeroCuandoNoEsDivisibleEntreTresyCinco(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.execute(2);
        Assertions.assertEquals("2",number);
    }

    @Test
    public void testNumeroDivisibleEntreTresSeImprimeFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.execute(3);
        Assertions.assertEquals("fizz",number);

    }

    @Test
    public void testNumeroDivisibleEntreCincoSeImprimeBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.execute(5);
        Assertions.assertEquals("buzz",number);

    }

    @Test
    public void testNumeroDivisibleEntreCincoYTresSeImprimeFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.execute(15);
        Assertions.assertEquals("fizzBuzz",number);

    }



}