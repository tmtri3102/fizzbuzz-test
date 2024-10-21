public class FizzBuzz {
    public String isFizzBuzz(int number) {
        if (number <= 0) return "Invalid number";
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        String theNumber = "" + number;
        boolean contain3 = theNumber.contains("3");
        boolean contain5 = theNumber.contains("5");
        if ((divisibleBy3 || contain3) && (divisibleBy5 || contain5)) {
            return "FizzBuzz";
        } else if (divisibleBy3 || contain3) {
            return "Fizz";
        } else if (divisibleBy5 || contain5) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
