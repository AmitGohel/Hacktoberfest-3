import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NewClass {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float countP=0;
        float countN=0;
        float countZ=0;
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            if(arr[i]>0){
                countP=countP+1;
            }
            else if(arr[i]<0){
                countN=countN+1;
            }
            else{
                countZ=countZ+1;
            }
        }
        System.out.printf("%.6f",countP/n);
        System.out.println();
        System.out.printf("%.6f",countN/n);
        System.out.println();
        System.out.printf("%.6f",countZ/n);
    }
}
