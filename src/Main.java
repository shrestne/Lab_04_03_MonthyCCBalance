public class Main {
    public static void main(String[] args) {
        double creditCardBalance = 4209;
        double interestRate = 0.17 * creditCardBalance;
        double interestRateInTwoMonths = interestRate * 2;
        System.out.println("The interest due after one month is "+ interestRate);
        System.out.println("The interest due after two months is "+ interestRateInTwoMonths);
    }
}