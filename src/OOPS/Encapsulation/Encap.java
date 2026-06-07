package OOPS.Encapsulation;
class AccessMo{
    public int a=10;
    protected int c=15;
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    private int b=5;
}
class Access1  extends AccessMo{
    void printData(){
        System.out.println(a);
        System.out.println(getB());
        System.out.println(c);
    }
}
public class Encap {
    public static void main(String[] args) {
        Access1 acc=new Access1();
        acc.printData();
    }
}
