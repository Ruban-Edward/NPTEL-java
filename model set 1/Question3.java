import java.util.Scanner;
public class Question3{

    //Answer
    static int findMissing(int arr[], int left, int right)
    {
        if (left > right)
            return right + 1;
        if (left != arr[left])
            return left;
  
        int mid = (left + right) / 2;
 
        
        if (arr[mid] == mid)
            return findMissing(arr, mid+1, right);
 
        return findMissing(arr, left, mid);
    }
    //Ends

    public static void main(String args[]){
        int arr[] = new int[20];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        arr[4]=5;
        arr[5]=6;
        System.out.println(findMissing(arr,0,arr.length-1));
  }
}