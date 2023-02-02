public class Tester {
    public static void main(String[] args) {
        PersonProfile a = new PersonProfile("Tneoh Chuan Lin",'m',"30 Nov 2003");
        a.display();
        new Student(a.name,a.gender,a.dateBirth,"course.txt");
        new Lecturer(a.name,a.gender,a.dateBirth,"lecturer.txt");
    }
}
