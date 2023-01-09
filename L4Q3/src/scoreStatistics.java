import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class scoreStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> score = new ArrayList();
        System.out.print("Enter a score (negative score to quit): ");
        score.add(sc.nextDouble());

        int i = 0;
        while (score.get(i) >= 0){
            i++;
            System.out.print("Enter a score (negative score to quit): ");
            score.add(sc.nextDouble());
        }

        double scoreMax = 0;
        for (int counter = 0; counter < (score.size()-1); counter++){
            if (score.get(counter) >= 0 && score.get(counter) > scoreMax){
                scoreMax = score.get(counter);
            }
        }
        double scoreMin = scoreMax;
        for (int counter = 0; counter < (score.size()-1); counter++){
            if (score.get(counter) >= 0 && score.get(counter) < scoreMin){
                scoreMin = score.get(counter);
            }
        }
        double sum = 0;
        for (int counter = 0; counter < (score.size()-1); counter++){
            if (score.get(counter) >= 0){
                sum = sum + score.get(counter);
            }
        }
        double average = sum/(score.size()-1);
        double[] squares = new double[(score.size()-1)];
        double sumSquares = 0;
        for (int counter = 0; counter < (score.size()-1); counter++){
            if (score.get(counter) >= 0) {
                squares[counter] = score.get(counter) * score.get(counter);
                sumSquares = sumSquares + squares[counter];
            }
        }

        if (score.size() >= 3){
            double stdDeviation = Math.sqrt((sumSquares-((sum*sum)/(score.size()-1)))/((score.size()-1)-1));
            System.out.printf("\nMinimum Score: %.2f",scoreMin);
            System.out.printf("\nMaximum Score: %.2f",scoreMax);
            System.out.printf("\nAverage Score: %.2f",average);
            System.out.printf("\nStandard Deviation: %.2f",stdDeviation);
        }
        else {
            System.out.print("\nMinimum Score: -");
            System.out.print("\nMaximum Score: -");
            System.out.print("\nAverage Score: -");
            System.out.print("\nStandard Deviation: -");
        }
    }
}
