import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Numbers");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter total Numbers");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        Integer[] ranksArray = new Integer[n];
        ranksArray[0] = 1;
        for (int i = 1; i<arr.length;i++){

            if(arr[i] != arr[i-1]){
                    ranksArray[i] = i + 1;

            }
            else{

                    ranksArray[i] = ranksArray[i - 1];


            }
        }
        System.out.println(Arrays.toString(ranksArray));
    }
}
