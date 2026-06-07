package Day03;

public class LeftRightDiff {
    public static void main(String[] args) {
        int a[]={10,4,8,3};
        int left[]=new int[a.length];
        int right[]=new int[a.length];
        for(int i=1;i<a.length-1;i++){
            left[i]=a[i-1]+left[i-1];
        }
        for(int i=a.length-1;i>=1;i--){
            right[i-1]=right[i]+a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.println(Math.abs(left[i]-right[i]));

        }

    }

}

