package befaster.solutions.SUM;

import befaster.solutions.HLO.HelloSolution;
import org.junit.Assert;
import org.junit.Test;

public class HloSolutionTest {
    @Test
    public void helloTest() throws Exception {
        HelloSolution helloSolution = new HelloSolution();
        String param = "Michael";
        String feedback = helloSolution.hello(param);
        Assert.assertEquals("Hello, "+ param +"!", feedback);
    }
}
