import java.util.Scanner;
public class Question1{
	public static void main(String args[]){
        int arr[] = new int[20];
        arr[0]=4;
        arr[1]=5;
        arr[2]=2;
        arr[3]=7;
        arr[4]=3;

        //Answer 
        int sum=0;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j <arr.length; j++) 
            {
                for (int k = j + 1; k < arr.length; k++)  
                    if (arr[i] + arr[j] > arr[k]
                        && arr[i] + arr[k] > arr[j]
                        && arr[k] + arr[j] > arr[i])
                        sum+=1;
            }
    }
    System.out.print(sum);
}
}