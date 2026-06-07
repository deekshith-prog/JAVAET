package Day03;

public class largestString {
    public static void main(String[] args) {
        String s="i love java programming";
        String st[]=s.split(" ");
        String max=st[0];
        for(int i=1;i<st.length;i++){
            if(st[i].length()>max.length()){
                max=st[i];
            }
        }
        System.out.println(max);
    }

}

