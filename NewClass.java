import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NewClass {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] ab = new int[6];
        ab[0]=a0;
        ab[1]=a1;
        ab[2]=a2;
        ab[3]=b0;
        ab[4]=b1;
        ab[5]=b2;
        
        int countA=0;
        int countB =0;
        //compares values
        for(int i=0;i<3;i++){
            if(ab[i] > ab[i+3])
            {
            countA = countA+1;
        }
            else if(ab[i] < ab[i+3])
            {
            countB = countB+1;
            }
        }
        int[] ar = {countA,countB};
        return ar;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
