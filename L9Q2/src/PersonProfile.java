public class PersonProfile {
    protected String name;
    protected char gender;
    protected String dateBirth;
    public PersonProfile(String name,char gender,String dateBirth){
        this.name = name;
        this.gender = gender;
        this.dateBirth = dateBirth;
    }
    public void display(){
        System.out.printf("Name: %s\n",name);
        System.out.printf("Gender: %s\n",gender == 'm'? "Male":"Female");
        System.out.printf("Date of Birth: %s\n",dateBirth);
    }
}
