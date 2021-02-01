import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =0 ; i< n; i++){
            String string = sc.nextLine();
            String even = "";
            String odd = "";
            for(int j=0; j<string.length(); j++){
                 if(j%2==0){
                even+=string.charAt(j);
            }
            else{
                odd+=string.charAt(j);
            }
            }
            System.out.println(even+ " " +odd);
           
        }
    }
}
