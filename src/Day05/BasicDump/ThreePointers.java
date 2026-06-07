package Day05.BasicDump;

public class ThreePointers {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5,6};
        int a2[]={2,4,6,8,10};
        int a3[]={2,3,6,9,12};
        int x=0,y=0,z=0;
        while(x<a1.length){
            if(a1[x]==a2[y]&&a2[y]==a3[z]){
                System.out.println(a1[x]);
                x++;
                y++;
                z++;
            }else if(a1[x]<a2[y]){
                x++;
            }else if(a2[y]<a3[z]){
                y++;
            }else{
                z++;
            }
        }

    }
}

