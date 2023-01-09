import java.io.*;
import java.util.*;
public class wordCount {
    public static void main(String[] args) {
        try {//unnecessary to save to file
            FileWriter fileCreate = new FileWriter("word.txt");
            BufferedWriter writer = new BufferedWriter(fileCreate);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text into file for word count, press q to end");
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
            FileReader fileOpen = new FileReader("word.txt");
            BufferedReader fileReader = new BufferedReader(fileOpen);
            int characters = 0; int words =0; int lines = 0;
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
                lines++;
                characters += line.length();
                words += line.split(" ").length;
            }
            fileOpen.close();
            fileReader.close();
            System.out.println();
            System.out.printf("Number of characters: %d\n",characters);
            System.out.printf("Number of words: %d\n",words);
            System.out.printf("Number of lines: %d\n",lines);
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
