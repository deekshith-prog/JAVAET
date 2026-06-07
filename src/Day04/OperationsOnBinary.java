package Day04;

public class OperationsOnBinary {
    static int operations(String str){
        int result=str.charAt(0)-'0';
        for(int i=1;i<str.length();i+=2){
            int value=str.charAt(i+1)-'0';
            char ch=str.charAt(i);
            if(ch=='c')
                result=result^value;
            else if(ch=='b')
                result=result|value;
            else if(ch=='a')
                result=result&value;
        }
        return result;
    }
    public static void main(String[] args) {

        String str="1c0c1c1a0b1";
        System.out.println(operations(str));

    }
}

