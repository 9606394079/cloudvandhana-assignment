public class RomanToInteger {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currValue = 0;

            switch (currentChar) {
                case 'I':
                    currValue = 1;
                    break;
                case 'V':
                    currValue = 5;
                    break;
                case 'X':
                    currValue = 10;
                    break;
                case 'L':
                    currValue = 50;
                    break;
                case 'C':
                    currValue = 100;
                    break;
                case 'D':
                    currValue = 500;
                    break;
                case 'M':
                    currValue = 1000;
                    break;
            }

            if (currValue >= prevValue) {
                result += currValue;
            } else {
                result -= currValue;
            }

            prevValue = currValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX";
        int integerValue = romanToInt(romanNumeral);
        System.out.println("Roman number " + romanNumeral + " is equivalent to integer " + integerValue);
    }
}