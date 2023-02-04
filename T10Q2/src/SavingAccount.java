public class SavingAccount implements Interface{
    private double balance;
    public SavingAccount(double balance){
        this.balance = balance;
    }
    @Override
    public double computeInterest() {
        return balance*0.005;
    }
}
