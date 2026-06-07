package Day07;

import java.sql.SQLOutput;

public class maxsubarray {
    public static void main(String[] args) {
        int arr[]={2,-5,1,7,-3,4,-6};
        int max=0;
        int csum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                csum+=arr[j];
                max=Math.max(csum,max);
            }
        }
        System.out.println(max);
    }
}
