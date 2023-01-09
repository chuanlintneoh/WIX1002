import java.util.Random;
public class randNum_nonDuplicate {
    public static void main(String[] args) {
        int[] randInt = new int[10];
        randInt[0] = randNum_nonDuplicate.generate_randNum();
        System.out.printf("Random integers: %d ",randInt[0]);
        for (int i = 1; i < randInt.length; i++){
            randInt[i] = randNum_nonDuplicate.generate_randNum();
            for (int counter = 0; counter < i; counter++){
                while (randInt[i] == randInt[counter]){
                    randInt[i] = randNum_nonDuplicate.generate_randNum();
                }
            }
            System.out.printf(" %d ",randInt[i]);
        }
    }
    static int generate_randNum(){
        Random rand = new Random();
        return rand.nextInt(21);
    }
}
