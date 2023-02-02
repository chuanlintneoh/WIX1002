import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Dice Game");
        System.out.println("Game 1");
        System.out.println("""
                Player roll two dices each time.
                If both dice is equal, the player can roll again.
                Player that reaches 100 points or more wins the game.""");
        System.out.println("Game 2");
        System.out.println("""
                Player roll one dice each time.
                When the dice is 6, the player can roll one more time.
                If the player rolls 6 again in second attempt, the player won't have any score.
                Player that reaches 100 point wins the game.
                If the player scores more than 100, the last score is not counted and the player needs to roll again in next turn.""");
        while (true){
            System.out.println();
            System.out.println("1 for Game 1, 2 for Game 2, 0 for random game, 'q' to quit");
            System.out.print("Pick: ");
            char pick = sc.next().charAt(0);
            switch (pick) {
                case '0' -> {
                    int shuffle = rand.nextInt(2) + 1;
                    switch (shuffle) {
                        case 1 -> playGame1();
                        case 2 -> playGame2();
                    }
                }
                case '1' -> playGame1();
                case '2' -> playGame2();
                case 'q' -> System.exit(0);
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }

    }
    protected static void playGame1(){
        System.out.println("Game 1");
        System.out.println("Player 1");
        game1 player1 = new game1();
        System.out.println("Player 2");
        game1 player2 = new game1();
        System.out.println();
        while (player1.getScore() < 100 && player2.getScore() < 100){
            player1.play();
            player2.play();
            System.out.println();
        }
        if (player1.getScore() == player2.getScore()){
            System.out.println("It's a draw!");
            System.out.printf("| %-20s | Score |\n","Players");
            System.out.printf("| %-20s | %5d |\n",player1.getName(),player1.getScore());
            System.out.printf("| %-20s | %5d |\n",player2.getName(),player2.getScore());
        }
        else {
            System.out.println("Winner is decided!");
            System.out.println("Ranking:");
            System.out.printf("| %-20s | Score |\n","Players");
            System.out.printf("| %-20s | %5d |\n",player1.getScore() > player2.getScore()?player1.getName():player2.getName(),Math.max(player1.getScore(), player2.getScore()));
            System.out.printf("| %-20s | %5d |\n",player1.getScore() < player2.getScore()?player1.getName():player2.getName(),Math.min(player1.getScore(), player2.getScore()));
        }
    }
    protected static void playGame2(){
        System.out.println("Game 2");
        System.out.println("Player 1");
        game2 player1 = new game2();
        System.out.println("Player 2");
        game2 player2 = new game2();
        System.out.println();
        while (player1.getScore() != 100 && player2.getScore() != 100){
            player1.play();
            player2.play();
            System.out.println();
        }
        if (player1.getScore() == player2.getScore()){
            System.out.println("It's a draw!");
            System.out.printf("| %-20s | Score |\n","Players");
            System.out.printf("| %-20s | %5d |\n",player1.getName(),player1.getScore());
            System.out.printf("| %-20s | %5d |\n",player2.getName(),player2.getScore());
        }
        else {
            System.out.println("Winner is decided!");
            System.out.println("Ranking:");
            System.out.printf("| %-20s | Score |\n","Players");
            System.out.printf("| %-20s | %5d |\n",player1.getScore() > player2.getScore()?player1.getName():player2.getName(),Math.max(player1.getScore(), player2.getScore()));
            System.out.printf("| %-20s | %5d |\n",player1.getScore() < player2.getScore()?player1.getName():player2.getName(),Math.min(player1.getScore(), player2.getScore()));
        }
    }
}
