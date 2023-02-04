public class BulkDiscount extends DiscountPolicy{
    private int minimum;
    private int discountRate;
    public BulkDiscount(int minimum,int discountRate){
        this.minimum = minimum;
        this.discountRate = discountRate;
    }
    @Override
    public double computeDiscount(int count, double itemCost) {
        if (count > minimum){
            return itemCost*discountRate/100;
        }
        else {
            return 0;
        }
    }
}
