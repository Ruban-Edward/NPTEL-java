import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {


    //Answer
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=2*n;i=i+2){
        if(i==n){
            continue;
        }
    sum=sum+i;
    }
System.out.print(sum);
}
}