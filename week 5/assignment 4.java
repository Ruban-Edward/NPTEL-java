import java.util.*;
public class Question5_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int length = sc.nextInt(); 
        int[] name = new int[length];
        int sum=0;
      
//Answer starts    
        for(int i=0 ; i<length ; i++)
        {
            try{
                name[i] = sc.nextInt();
                sum += name[i];
             }
            catch(InputMismatchException e){
                sum = -1;
            }
        }
        if(sum == -1)
        {
            System.out.print("You entered bad data.");
        }
        else
        {
            System.out.print(sum);
        }
//Ends

  }
}