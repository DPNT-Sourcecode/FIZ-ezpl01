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
    @Test
    public void testFizzBuzzDigit() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz buzz", solution.fizzBuzz(53));
    }
    @Test
    public void testDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("deluxe", solution.fizzBuzz(22));
    }
    @Test
    public void testFakeDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fake deluxe", solution.fizzBuzz(11));
    }
    @Test
    public void testFizzDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz deluxe", solution.fizzBuzz(66));
    }
    @Test
    public void testFizzFakeDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz fake deluxe", solution.fizzBuzz(33));
    }
    @Test
    public void testBuzzFakeDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("buzz fake deluxe", solution.fizzBuzz(55));
    }
    @Test
    public void testFizzBuzzDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz buzz fake deluxe", solution.fizzBuzz(555));
    }
}
