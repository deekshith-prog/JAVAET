package day01;
import java.util.*;
public class ratsfood {
    public static void main(String[] args) {
        int r=7;
        int unit=2;
        int a[]={2,8,3,5,7,4,1,2};
        int totalfood=r*unit;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum>=totalfood){
                System.out.println(i+1);
                break;
            }
        }
    }

}
