
class Student1{
    String name;
    int rollno;
    String password;
    int marks[];



    Student1(String name,int rollno,String password){
        this.name=name;
        this.rollno=rollno;
        this.password=password;
        marks=new int[3];
    }

    //shallow copy constructor
//    Student1(Student1 s1){ //copy constructor
//        this.name=s1.name;
//        this.rollno=s1.rollno;
//        this.password= s1.password;
//        this.marks=s1.marks;
//    }



    //deep copy constructor
    Student1(Student1 s){ //copy constructor
        this.name=s.name;
        this.rollno=s.rollno;
        this.password= s.password;
        marks=new int[3];
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s.marks[i];
        }
    }



}


public class Copy_Constructor {
    public static void main(String[] args) {
        Student1 s=new Student1("aman",6,"asfdas");
        s.marks[0]=9;
        s.marks[1]=3;
        s.marks[2]=9;

        Student1 s1=new Student1(s);
        System.out.println(s1.name);
//        System.out.println(s1.marks[0]);//shallow copy
//        s.marks[0]=0;
//        System.out.println(s1.marks[0]);//shallow copy


        System.out.println(s1.marks[0]);//deep copy
        s.marks[0]=0;
        System.out.println(s1.marks[0]);//deep copy


    }
}
