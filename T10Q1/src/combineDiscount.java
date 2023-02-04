public class combineDiscount extends DiscountPolicy{
    private DiscountPolicy policy1;
    private DiscountPolicy policy2;
    public combineDiscount(DiscountPolicy policy1,DiscountPolicy policy2){
        this.policy1 = policy1;
        this.policy2 = policy2;
    }
    @Override
    public double computeDiscount(int count, double itemCost) {
        if (policy1.computeDiscount(count,itemCost) > policy2.computeDiscount(count,itemCost)){
            return policy1.computeDiscount(count,itemCost);
        }
        else {
            return policy2.computeDiscount(count,itemCost);
        }
    }
}
