package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String answer = "";
        if(number % 3 == 0 || number.toString().contains("3")) {
            answer += "fizz";
        }
        if(number %5 == 0 || number.toString().contains("5")) {
            if(answer.length() > 0) {
                answer += " ";
            }
            answer += "buzz";
        }
        if(number > 10) {
            String digits = number.toString();
            boolean deluxe = true;
            Character firstDigit = digits.charAt(0);
            for(int i=0; i < digits.length(); i++) {
                if(digits.charAt(i) != firstDigit) {
                    deluxe = false;
                }
            }
            if(deluxe) {
                if(answer.length() > 0) {
                    answer += " ";
                }
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
