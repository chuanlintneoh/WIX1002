public class Greatest_CommonDivisor {
    public static void main(String[] args) {
        int[][] num = new int[2][2];
        num[0][0] = 24;
        num[1][0] = 8;
        num[0][1] = 200;
        num[1][1] = 625;
        for (int i = 0; i < num.length; i++){
            System.out.printf("GCD for (%d,%d): %d\n",num[0][i],num[1][i],EuclideanAlgorithm(num[0][i],num[1][i]));
        }
    }
    public static int EuclideanAlgorithm(int a, int b){
        int smallerNum, largerNum;
        if (a > b){
            largerNum = a;
            smallerNum = b;
        }
        else if (a < b){
            smallerNum = a;
            largerNum = b;
        }
        else {
            smallerNum = a;
            largerNum = a;
        }
        int remainder = a;
        while (remainder != 0){
            remainder = largerNum % smallerNum;
            if (remainder == 0){
                break;
            }
            largerNum = smallerNum;
            smallerNum = remainder;
        }
        return smallerNum;
    }
}