import java.util.*;
import java.io.*;
public class Student extends PersonProfile{
    private String fileName;
    private ArrayList <String> courseCode = new ArrayList<>();
    private ArrayList <String> courseName = new ArrayList<>();
    private ArrayList <String> session = new ArrayList<>();
    private ArrayList <String> semester = new ArrayList<>();
    private ArrayList <Integer> mark = new ArrayList<>();
    private ArrayList <String> grade = new ArrayList<>();
    public Student(String name,char gender,String dateBirth,String fileName){
        super(name,gender,dateBirth);
        this.fileName = fileName;
        try {
            FileReader fileOpen = new FileReader(fileName);
            BufferedReader fileReader = new BufferedReader(fileOpen);
            String line;
            for (int i = 1;(line = fileReader.readLine()) != null;i++){
                if (i % 5 == 1){
                    courseCode.add(line);
                }
                else if (i % 5 == 2){
                    courseName.add(line);
                }
                else if (i % 5 == 3){
                    session.add(line);
                }
                else if (i % 5 == 4){
                    semester.add(line);
                }
                else if (i % 5 == 0){
                    mark.add(Integer.parseInt(line));
                    grade.add(getGrade(Integer.parseInt(line)));
                }
            }
            fileReader.close();
            fileReader.close();
            display();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private String getGrade(int mark){
        if (mark >= 85){
            return "A";
        }
        else if (mark >= 75){
            return "A-";
        }
        else if (mark >= 70){
            return "B+";
        }
        else if (mark >= 65){
            return "B";
        }
        else if (mark >= 60){
            return "B-";
        }
        else if (mark >= 55){
            return "C+";
        }
        else if (mark >= 50){
            return "C";
        }
        else if (mark >= 45){
            return "D";
        }
        else if (mark >= 35){
            return "E";
        }
        else {
            return "F";
        }
    }
    @Override
    public void display(){
        System.out.println("Results:");
        System.out.printf("| Course Code | %-34s | Session | Semester | Mark | Grade |\n","Course Name");
        for (int i = 0; i < courseCode.size(); i++){
            System.out.printf("| %-11s | %-34s | %7s | %8s | %4d | %-5s |\n",courseCode.get(i),courseName.get(i),session.get(i),semester.get(i),mark.get(i),grade.get(i));
        }
    }
}
