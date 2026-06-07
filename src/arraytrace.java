import java.util.*;
public class arraytrace {
    public static void main(String[] args){
       int a[]={1,2,3,4,5};
       for(int i=0;i<a.length;i++){
           a[i+1]=a[i];
       }
       System.out.println(Arrays.toString(a));
    }
}
