package befaster.solutions.FIZ;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testFizz() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz", solution.fizzBuzz(3));
    }
    @Test
    public void testBuzz() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("buzz", solution.fizzBuzz(5));
    }
    @Test
    public void testFizzBuzz() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz buzz", solution.fizzBuzz(15));
    }
    @Test
    public void testNotFizzOrBuzz() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("2", solution.fizzBuzz(2));
    }
    @Test
    public void testFizzDigit() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz", solution.fizzBuzz(23));
    }
    @Test
    public void testBuzzDigit() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("buzz", solution.fizzBuzz(52));
    }
}
