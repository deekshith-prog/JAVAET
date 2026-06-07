package Day02;

public class Arrayscommon {
        public static void main(String[] args) {
            int a1[]={1,2,3,4,7,6};
            int a2[]={2,4,6,7,10};
            int a3[]={2,3,6,7,12};
            for(int i=0;i<a1.length;i++){
                for(int j=0;j<a2.length;j++){
                    for(int k=0;k<a3.length;k++){
                        if(a1[i]==a2[j]&&a2[j]==a3[k]){
                            System.out.println(a1[i]);
                        }
                    }
                }
            }
        }

    }
