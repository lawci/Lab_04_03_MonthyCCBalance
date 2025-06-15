public class Main {
    public static void main(String[] args) {
        double balance = 5000.00;
        double interestRate = 0.17;
        double month1Interest = balance * interestRate;
        double month2Interest = (balance + month1Interest) * interestRate;
        System.out.println("Interest due after one month: $" + String.format("%.2f", month1Interest));
        System.out.println("Interest due after two months: $" + String.format("%.2f", month2Interest));
    }
}