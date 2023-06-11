class Animal{
    int value=99;
    void walk(){
        System.out.println("walk");
    }

    void eat(){
        System.out.println("eat");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim" +value);
    }

}

public class Example1 {
    public static void main(String[] args) {
        Fish f1=new Fish();
        f1.walk();
        f1.swim();

    }
}
