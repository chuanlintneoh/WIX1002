public class palindromicPrime_emirp {
    public static void main(String[] args) {
        int[] palprime_Num = new int[20];
        int[] emirp_Num = new int[20];

        int count = 0; int arrayIndex = 0;
        while (arrayIndex < 20){
            if (palindromicPrime(count)){
                palprime_Num[arrayIndex] = count;
                arrayIndex++;
            }
            count++;
        }

        count = 0; arrayIndex = 0;
        while (arrayIndex < 20){
            if (emirp(count)){
                emirp_Num[arrayIndex] = count;
                arrayIndex++;
            }
            count++;
        }

        System.out.println("Palindromic Prime | Emirp");
        for (int i = 0; i < 20; i++){
            System.out.printf("%10d        | %3d\n",palprime_Num[i],emirp_Num[i]);
        }
    }
    public static boolean palindromicPrime(int x){
        boolean prime = false;
        for (int checkPrime = 2; checkPrime <= x; checkPrime++){
            if (x % checkPrime != 0 || x == 2){
                prime = true;
            }
            else if (x % checkPrime == 0 && x != checkPrime){
                prime = false;
                break;
            }
        }
        boolean palindromic = false;
        int reversedNum = 0;
        int hold = x;
        reversedNum = reversedNum*10 + hold%10;
        hold = hold/10;
        while (hold != 0){
            reversedNum = reversedNum*10 + hold%10;
            hold = hold/10;
        }
        if (reversedNum == x){
            palindromic = true;
        }
        else {
            palindromic = false;
        }
        if (prime && palindromic){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean emirp(int x){
        boolean xprime = false;
        for (int checkPrime = 2; checkPrime <= x; checkPrime++){
            if (x % checkPrime != 0 || x == 2){
                xprime = true;
            }
            else if (x % checkPrime == 0 && x != checkPrime){
                xprime = false;
                break;
            }
        }

        int reversedX = 0;
        int hold = x;
        reversedX = reversedX*10 + hold%10;
        hold = hold/10;
        while (hold != 0){
            reversedX = reversedX*10 + hold%10;
            hold = hold/10;
        }
        boolean xreversed_prime = false;
        for (int checkPrime = 2; checkPrime <= reversedX; checkPrime++){
            if (reversedX % checkPrime != 0 || reversedX == 2){
                xreversed_prime = true;
            }
            else if (reversedX % checkPrime == 0 && reversedX != checkPrime){
                xreversed_prime = false;
                break;
            }
        }

        boolean Not_palindromicPrime = false;
        if (!palindromicPrime(x)){
            Not_palindromicPrime = true;
        }
        else{
            Not_palindromicPrime = false;
        }

        if (xprime && xreversed_prime && Not_palindromicPrime){
            return true;
        }
        else {
            return false;
        }
    }
}