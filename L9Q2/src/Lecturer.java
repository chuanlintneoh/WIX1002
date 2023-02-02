import java.io.*;
import java.util.*;
public class Lecturer extends PersonProfile{
    private String fileName;
    private ArrayList <String> courseCode = new ArrayList<>();
    private ArrayList <String> courseName = new ArrayList<>();
    private ArrayList <String> session = new ArrayList<>();
    private ArrayList <String> semester = new ArrayList<>();
    private ArrayList <Double> creditHour = new ArrayList<>();
    private ArrayList <Integer> numberStudent = new ArrayList<>();
    private ArrayList <Double> totalCredithour = new ArrayList<>();
    public Lecturer(String name,char gender,String dateBirth,String fileName){
        super(name,gender,dateBirth);
        this.fileName = fileName;
        try {
            FileReader fileOpen = new FileReader(fileName);
            BufferedReader fileReader = new BufferedReader(fileOpen);
            String line;
            for (int i = 1;(line = fileReader.readLine()) != null;i++){
                if (i % 6 == 1){
                    courseCode.add(line);
                }
                else if (i % 6 == 2){
                    courseName.add(line);
                }
                else if (i % 6 == 3){
                    session.add(line);
                }
                else if (i % 6 == 4){
                    semester.add(line);
                }
                else if (i % 6 == 5){
                    creditHour.add(Double.parseDouble(line));
                }
                else if (i % 6 == 0){
                    numberStudent.add(Integer.parseInt(line));
                }
            }
            fileReader.close();
            fileReader.close();
            compute();
            display();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void compute(){
        double temp;
        for (int i = 0; i < creditHour.size(); i++){
            if (numberStudent.get(i) >= 150){
                temp = creditHour.get(i)*3;
            }
            else if (numberStudent.get(i) >= 100){
                temp = creditHour.get(i)*2;
            }
            else if (numberStudent.get(i) >= 50){
                temp = creditHour.get(i)*1.5;
            }
            else {
                temp = creditHour.get(i);
            }
            totalCredithour.add(i, temp);
        }
    }
    @Override
    public void display(){
        System.out.println("Credits:");
        System.out.printf("| Course Code | %-34s | Session | Semester | Credit Hours | Number of Students Registered | Total Credit Hours |\n","Course Name");
        for (int i = 0; i < courseCode.size(); i++){
            System.out.printf("| %-11s | %-34s | %7s | %8s | %12.0f | %-29d | %-18.2f |\n",courseCode.get(i),courseName.get(i),session.get(i),semester.get(i),creditHour.get(i),numberStudent.get(i),totalCredithour.get(i));
        }
    }
}
