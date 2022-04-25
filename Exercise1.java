import java.util.Scanner;

public class Exercise1 {

    static int getLongestSequence(int arr[], int n){
        //counter to count the sequence, initialize it
        int cnt = 0;
        //counter to count the longest sequence, initialize it
        int result = 0;
        //for loop to check through the whole array
        for(int i = 0; i < n; i++){
            //if condition to reset the counter to 0 if there is found an 0
            if(arr[i] == 0)
                cnt = 0;
                //if there are multiple 1s, the counter is incremented, and then
                //by using Math.max function, we get the highest number between counter and result
            else{
                cnt++;
                result = Math.max(result,cnt);
            }
        }
        return result;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the array?");
        //array length
        int n = input.nextInt();

        //declare the array
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The longest sequence of 1s is: " + (getLongestSequence(arr, n)));
    }
}
