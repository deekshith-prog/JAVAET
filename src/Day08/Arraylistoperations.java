package Day08;


import java.util.ArrayList;
public class Arraylistoperations {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Ram Charan");
        list.add("Prabhas");
        list.add("NTR");
        list.add("Ram");
        list.add("Nani");
        System.out.println(list);
        list.remove(2);
        list .remove(3);
        System.out.println(list);
        list.set(2,"Kalyan Ram");
        list.set(1,"Nithin");
        System.out.println(list);

    }
}
