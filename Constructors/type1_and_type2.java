

 class Student{
    String name;
    Student(){
        System.out.println("this is a non-parameterized constructors");
    }
    Student(String name){
        this.name=name;
    }



}
public class type1_and_type2
{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("aman");
        System.out.println(s1.name);
        System.out.println(s2.name);

    }
}
