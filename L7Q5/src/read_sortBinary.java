import java.io.*;
import java.util.*;
public class read_sortBinary {
    public static void main(String[] args) {
        try {
            FileInputStream fileOpen = new FileInputStream("C:\\Users\\chuan\\IdeaProjects\\L7Q5\\person.dat");
            ObjectInputStream fileReader = new ObjectInputStream(fileOpen);
            int TotalNumberofRecord = fileReader.readInt();
            ArrayList<String> Name = new ArrayList<>();
            ArrayList<Integer> Age = new ArrayList<>();
            ArrayList<Character> Gender = new ArrayList<>();
            for (int i = 0; i < TotalNumberofRecord; i++){
                Name.add(fileReader.readUTF());
                Age.add(fileReader.readInt());
                Gender.add(fileReader.readChar());
            }
            for (int i = 0; i < TotalNumberofRecord; i++){
                System.out.printf("%s | %d | %c\n",Name.get(i),Age.get(i),Gender.get(i));
            }//unnecessary
            for (int i = 0; i < TotalNumberofRecord - 1; i++){
                for (int j = 0; j < TotalNumberofRecord - 1; j++){
                    if((Name.get(j).compareToIgnoreCase(Name.get(j+1)))>0) {
                        String temp = Name.get(j);
                        Name.set(j,Name.get(j+1));
                        Name.set(j+1,temp);

                        int temp1 = Age.get(j);
                        Age.set(j,Age.get(j+1));
                        Age.set(j+1,temp1);

                        char temp2 = Gender.get(j);
                        Gender.set(j,Gender.get(j+1));
                        Gender.set(j+1,temp2);
                    }
                }
            }
            System.out.println("\nSorted by names");
            System.out.println("Name | Age | Gender");
            for (int i = 0; i < TotalNumberofRecord; i++){
                System.out.printf("%s | %d | %s\n",Name.get(i),Age.get(i),Gender.get(i) == 'M'?"Male":"Female");
            }
            fileOpen.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
