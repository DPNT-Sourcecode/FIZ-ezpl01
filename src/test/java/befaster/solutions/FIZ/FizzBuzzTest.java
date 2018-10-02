package befaster.solutions.FIZ;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testDivisibleByThreeReturnsFizz() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz", solution.fizzBuzz(6));
    }
    @Test
    public void testDivisibleByFiveReturnsBuzz() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("buzz", solution.fizzBuzz(10));
    }
    @Test
    public void testDivisibleByThreeAndFiveReturnsFizzBuzz() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz buzz", solution.fizzBuzz(15));
    }
    @Test
    public void testNotDivisibleByThreeOrFiveReturnsNumber() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("2", solution.fizzBuzz(2));
    }
    @Test
    public void testHasDigit_3_ReturnsFizz() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz", solution.fizzBuzz(23));
    }
    @Test
    public void testHasDigit_5_ReturnsBuzz() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("buzz", solution.fizzBuzz(52));
    }
    @Test
    public void testHasDigits_5_And_3_ReturnsFizzBuzz() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz buzz", solution.fizzBuzz(53));
    }
    @Test
    public void testNotDivisibleByFiveOrThree_ReturnsNumber() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("22", solution.fizzBuzz(22));
    }
    @Test
    public void testOddNumber_WithThree_ReturnsFakeDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz fake deluxe", solution.fizzBuzz(33));
    }
    @Test
    public void testOddNumber_WithFive_ReturnsBuzzFakeDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("buzz fake deluxe", solution.fizzBuzz(55));
    }
    @Test
    public void testFizzBuzzDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz buzz fake deluxe", solution.fizzBuzz(555));
    }
    @Test
    public void testEvenNumber_FizzBuzzNumber_ReturnsFizzBuzzDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz buzz deluxe", solution.fizzBuzz(66));
    }
}
