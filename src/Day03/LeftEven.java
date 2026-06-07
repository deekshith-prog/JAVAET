package Day03;

public class LeftEven {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]%2!=0&&a[j]%2==0){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

}
