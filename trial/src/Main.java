import javax.management.AttributeValueExp;

class Person{
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Student extends Person{
    public Student(String name) {
        super(name);
    }
    public String getStudentName(){
        return this.getName();
    }
}

class AvgStudent extends Student{
    public AvgStudent(String name){
        super(name);
    }
    public String getAvgStudentName(){
        return this.getStudentName();
    }
    public static Person getDetail(int n){
        return switch(n){
            case 1 -> new AvgStudent("randomAvgStudent");
            case 2 -> new Student("radomStudent");
            default -> new Person("randomPerson");
        };
    }
}

public class Main {
    public static void main(String[] args) {
        Student me = new Student("Aadarsh");
        System.out.println(me.getName());

        Student a  = (Student) AvgStudent.getDetail(1);
        System.out.println(a.getStudentName());
        AvgStudent b = (AvgStudent) a;
        b.getAvgStudentName();
    }
}