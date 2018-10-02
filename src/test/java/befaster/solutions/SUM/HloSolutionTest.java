package befaster.solutions.SUM;

import befaster.solutions.HLO.HelloSolution;
import org.junit.Assert;
import org.junit.Test;

public class HloSolutionTest {
    @Test
    public void helloTest() throws Exception {
        HelloSolution helloSolution = new HelloSolution();
        String feedback = helloSolution.hello("Friend");
        Assert.assertEquals("Hello, World!", feedback);
    }
}
