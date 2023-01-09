import java.io.*;
import java.util.*;
public class displayCourseName {
    public static void main(String[] args) {
        try {
            FileOutputStream fileCreate = new FileOutputStream("coursename.dat");
            ObjectOutputStream objectCreate = new ObjectOutputStream(fileCreate);
            String[][] course = {
                    {"WXES1116", "Programming I"},
                    {"WXES1115", "Data Structure"},
                    {"WXES1110", "Operating System"},
                    {"WXES1112", "Computing Mathematics I"}
            };
            for (int i = 0; i < course.length; i++) {//Row: course code
                for (int j = 0; j < course[i].length; j++) {//Column: course name
                    objectCreate.writeUTF(course[i][j]);
                    if (j == 1) {
                        continue;
                    }
                    objectCreate.writeChar('|');
                }
                objectCreate.writeChar(';');
                objectCreate.writeChar(' ');
            }
            objectCreate.writeUTF("Return 0");
            objectCreate.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream fileOpen = new FileInputStream("coursename.dat");
            ObjectInputStream objectReader = new ObjectInputStream(fileOpen);
            ArrayList<String> courseCodes = new ArrayList<>();
            ArrayList<String> courseNames = new ArrayList<>();
            String line;
            while (!"Return 0".equals(line = objectReader.readUTF())){
                courseCodes.add(line);
                objectReader.readChar();
                courseNames.add(objectReader.readUTF());
                objectReader.readChar();
                objectReader.readChar();
            }
            for (int i = 0; i < courseCodes.size(); i++){
                System.out.printf("%s | %s\n",courseCodes.get(i),courseNames.get(i));
            }// used to check (unneeded)
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter course code: ");
            String search = sc.next();
            boolean foundStatus = false;
            for (int i = 0; i < courseCodes.size(); i++){
                if (search.equalsIgnoreCase(courseCodes.get(i))){
                    System.out.printf("Course found! The course name is %s.\n",courseNames.get(i));
                    foundStatus = true;
                    break;
                }
            }
            if (!foundStatus){
                System.out.println("Course not found!");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}