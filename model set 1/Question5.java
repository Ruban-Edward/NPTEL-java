import java.util.Scanner;
public class Question5{
	public static void main(String args[]){
        int arr[] = new int[20];
        
        //Anwers
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }
}
        