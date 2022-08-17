import java.util.Scanner;
public class Fibonacci { 

public static void main(String args[]){ 
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
System.out.println(fib(n)); 
} 

static int fib(int n) { 
    
    //Answer for code 


  if (n==1)    
     return 0;
     else if(n==2)
     return 1;
return fib(n - 1) + fib(n - 2); 


    //ends here


}
}