public class FixedAccount implements Interface{
    private double balance;
    public FixedAccount(double balance){
        this.balance = balance;
    }
    @Override
    public double computeInterest() {
        return balance*0.03;
    }
}
