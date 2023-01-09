import java.io.*;
import java.util.*;

public class reverseText {
    public static void main(String[] args) {
        try {//unnecessary to save to file
            FileWriter fileCreate = new FileWriter("normaltext.txt");
            BufferedWriter writer = new BufferedWriter(fileCreate);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text into file to reverse it, press q to end");
            String line;
            while (!"q".equals(line = sc.nextLine())){
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fileOpen = new FileReader("normaltext.txt");
            BufferedReader fileReader = new BufferedReader(fileOpen);
            FileWriter fileCreate = new FileWriter("reverse.txt");
            BufferedWriter writer = new BufferedWriter(fileCreate);
            String line;
            while ((line = fileReader.readLine()) != null){
                System.out.println();
                System.out.printf("Normal: %s\n",line);
                System.out.print("Reversed: ");
                for (int i = line.length()-1; i >= 0; i--){
                    System.out.print(line.charAt(i));
                    writer.write(line.charAt(i));
                }
                writer.newLine();
            }
            fileReader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
