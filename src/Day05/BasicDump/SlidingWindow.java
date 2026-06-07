package Day05.BasicDump;

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[]={2,9,31,-4,21,7};
        int k=3;
        int W_sum=42;
        int M_sum=0;
        for(int i=k;i<arr.length;i++){
            W_sum=W_sum-arr[i-k]+arr[i];
            M_sum=Math.max(W_sum,M_sum);
        }
        System.out.println(M_sum);
    }
}

