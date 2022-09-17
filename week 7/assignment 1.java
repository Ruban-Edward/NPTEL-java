import java.util.*;
public class Question1{
    public static void main (String[] args){

//answers 
        int i,n=0,sum=0;
        Scanner in = new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            n = in.nextInt();
            sum =sum+n;
        }
//ends

        System.out.println(sum);
    }
}