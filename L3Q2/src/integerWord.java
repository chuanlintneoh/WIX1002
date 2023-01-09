import java.util.Random;
public class integerWord {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNum = rand.nextInt(6);
        String word;
        if (randNum == 0){
            word = "zero";
        }
        else if (randNum == 1){
            word = "one";
        }
        else if (randNum == 2){
            word = "two";
        }
        else if (randNum == 3){
            word = "three";
        }
        else if (randNum == 4){
            word = "four";
        }
        else {
            word = "five";
        }
        System.out.printf("%d is %s.",randNum,word);
    }

}
