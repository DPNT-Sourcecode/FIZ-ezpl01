package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String answer = "";
        if(number % 3 == 0) {
            answer += "fizz";
        }
        if(number %5 == 0) {
            if(answer.length() > 0) {
                answer += " ";
            }
            answer += "buzz";
        }
        if(number.toString().contains("3") || number.toString().contains("5")) {
            if(answer.length() > 0) {
                answer += " ";
                if(number % 2 > 0) {
                    answer += "fake ";
                }
                answer += "deluxe";
            }
        }
        if(answer.length() == 0) {
            return number.toString();
        }
        else {
            return answer;
        }
    }
}
