
class Pen{

    private String color;
    private int tip;

    void setColor(String color){
        this.color=color;
    }
    String getColor(){
        return this.color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
    int getTip(){
        return this.tip;
    }



}
public class practise{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("pink");
        p1.setTip(7);
        int tip=p1.getTip();
        System.out.println(tip);

    }
}
