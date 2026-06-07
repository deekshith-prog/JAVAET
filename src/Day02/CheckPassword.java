package Day02;

import java.util.*;
public class CheckPassword {
    static int checkpass(String str,int n){
        if(n<4)
            return 0;
        if(Character.isDigit(str.charAt(0)))
            return 0;
        boolean hasdigit=false;
        boolean hascapital=false;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch==' '||ch=='/')
                return 0;
            if(Character.isDigit(ch))
                hasdigit=true;
            if(Character.isUpperCase(ch))
                hascapital=true;

        }
        if(hascapital && hasdigit)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int result=checkpass(str,str.length());
        if (result == 1)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}

