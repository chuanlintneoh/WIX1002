public class Person implements Comparable{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void display(){
        System.out.println(name);
    }
    @Override
    public int compareTo(Object obj) {
        Person a = (Person) obj;
        return name.compareToIgnoreCase(a.getName());
    }
}
