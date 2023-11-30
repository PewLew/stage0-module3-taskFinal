package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sunm = 0;
        int rem;

        while (number > 0) {
            rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }
        System.out.println(sum);
    }

}
