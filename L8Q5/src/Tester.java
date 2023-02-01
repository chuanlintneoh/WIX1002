public class Tester {
    public static void main(String[] args) {
        System.out.println("Player 1");
        Game player1 = new Game();
        System.out.println("Player 2");
        Game player2 = new Game();
        System.out.println();
        while (player1.getSum() < 100 && player2.getSum() < 100){
            player1.move();
            player2.move();
        }
        System.out.println();
        if (player1.getSum() >= 100 && player2.getSum() >= 100){
            System.out.println("It's a draw!");
            System.out.printf(" %20s | %7s\n","Name","Score");
            System.out.printf(" %20s | %7d\n",player1.getName(),player1.getSum());
            System.out.printf(" %20s | %7d\n",player2.getName(),player2.getSum());
        }
        else if (player1.getSum() >= 100){
            System.out.printf("The winner is %s! With a score of %d.\n",player1.getName(),player1.getSum());
            System.out.printf("Nice try %s, your score is %d.\n",player2.getName(),player2.getSum());
        }
        else if (player2.getSum() >= 100){
            System.out.printf("The winner is %s! With a score of %d.\n",player2.getName(),player2.getSum());
            System.out.printf("Nice try %s, your score is %d.\n",player1.getName(),player1.getSum());
        }
        else {
            System.out.println("Something went wrong! There is a bug in the program.");
        }
    }
}
