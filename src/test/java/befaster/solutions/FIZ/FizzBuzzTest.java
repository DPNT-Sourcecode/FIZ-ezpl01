package befaster.solutions.FIZ;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testDivisibleByThreeReturnsFizz() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz", solution.fizzBuzz(3));
    }
    @Test
    public void testDivisibleByFiveReturnsBuzz() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("buzz", solution.fizzBuzz(5));
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
    public void testGreaterThanTen_NotDivisibleByFiveOrThree_ReturnsNumber() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("22", solution.fizzBuzz(22));
    }
    @Test
    public void testOddNumberGreaterThanTen_WithAllSameDigits_ReturnsFakeDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fake deluxe", solution.fizzBuzz(11));
    }
    @Test
    public void testEvenNumberGreaterThanTen_WithAllSameDigits_ReturnsFizzDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz deluxe", solution.fizzBuzz(66));
    }
    @Test
    public void testDivisibleByThreeAndContainsAThree_ReturnsFizzDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz deluxe", solution.fizzBuzz(33));
    }
    @Test
    public void testDivisibleByFiveAndContainsAFive_ReturnsBuzzDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("buzz deluxe", solution.fizzBuzz(55));
    }
    @Test
    public void testFizzBuzzDeluxe() throws Exception {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        Assert.assertEquals("fizz buzz fake deluxe", solution.fizzBuzz(555));
    }
}
