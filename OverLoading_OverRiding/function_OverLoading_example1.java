
//Compile time
class Calculator{
    int sum(int a,int b ,int c){
        return a+b+c;
    }
    double sum(double a,double b,double c){
        return a+b+c;
    }


}
public class function_OverLoading_example1 {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.sum(9,9,9));
        System.out.println(c.sum(8.8,8.9,9.));

    }
}
