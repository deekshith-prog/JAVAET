package Day04;

public class RemoveIndex {
    public static void main(String[] args) {
        int a[]={100,180,260,310,40,535,695};
        int t=0;
        for(int i=1;i<a.length;i++){
            if(a[i+1]<a[i]||a[i]>a[i-1]){
                for(int j=i;j>=0;j--){
                    int profit=0;
                    if(j==0){
                        profit=a[i]-a[j];
                        t+=profit;
                    }

                }
            }
        }
        System.out.println(t);

    }
}

