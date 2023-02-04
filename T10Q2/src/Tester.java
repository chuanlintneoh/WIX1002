public class Tester {
    public static void main(String[] args) {
        double balance = 12000.85;
        SavingAccount a = new SavingAccount(balance);
        FixedAccount b = new FixedAccount(balance);

        System.out.printf("Balance: RM %.2f\n",balance);
        System.out.println("Saving Account");
        System.out.printf("Yearly Interest: RM %.2f\n",a.computeInterest());
        System.out.println("Fixed Account");
        System.out.printf("Yearly Interest: RM %.2f\n",b.computeInterest());
    }
}