import java.util.Random;
public class primeNum_n {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Prime Number Generator");
        int n = rand.nextInt(101);
        System.out.printf("n: %d \n",n);

        if (n == 0){
            System.out.println("No prime numbers generated.");
        }
        else {
            int[] primeNum = new int[n];
            boolean prime = false;
            int i = 0;
            int value = 1;
            while (i < primeNum.length){
                while (prime == false){
                    for (int checkPrime = 2; checkPrime <= value; checkPrime++){
                        if (value % checkPrime != 0 || value == 2){
                            prime = true;
                        }
                        else if (value % checkPrime == 0 && value != checkPrime){
                            prime = false;
                            break;
                        }
                    }
                    value++;
                }
                primeNum[i] = value-1;
                i++;
                prime = false;
            }
            System.out.println("Prime numbers: ");
            for (i = 0; i < primeNum.length; i++){
                if (i+1 < primeNum.length){
                    System.out.printf("%3d, ",primeNum[i]);
                }
                else {
                    System.out.printf("%3d ",primeNum[i]);
                }
                if ((i + 1) % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}