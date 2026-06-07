package Day07;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        int arr[]={5,4,3,8,5,1,0,2,8};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(i%2!=0) {
                list.add(arr[i]);
            }else{
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
