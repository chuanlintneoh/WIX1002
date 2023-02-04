public class Tester {
    public static void main(String[] args) {
        double itemCost = 68.90;
        int quantity = 6;
        BulkDiscount bulkDiscount = new BulkDiscount(5,25);
        OtherDiscount otherDiscount = new OtherDiscount();
        combineDiscount combineDiscount = new combineDiscount(bulkDiscount,otherDiscount);

        System.out.printf("Item Cost: RM %.2f\n",itemCost);
        System.out.printf("Quantity: %d\n",quantity);
        System.out.println();
        System.out.println("Discount");
        System.out.printf("Bulk Discount: RM %.2f\n",bulkDiscount.computeDiscount(quantity,itemCost));
        System.out.printf("Other Discount: RM %.2f\n",otherDiscount.computeDiscount(quantity,itemCost));
        System.out.printf("Highest Discount: RM %.2f\n",combineDiscount.computeDiscount(quantity,itemCost));
    }
}