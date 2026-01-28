import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws IOException {
     Scanner sc =new Scanner(System.in);
     int n = sc.nextInt();
     int arr[][]=new int[n][n];
     int lefttoright=0;
     int righttoleft=0;
     for(int i =0;i<n;i++){
        for(int j =0;j<n;j++){
            arr[i][j]=sc.nextInt();
            
            if(i==j){
                lefttoright+=arr[i][j];   
            }
            if((i+j)==(n-1)){
                righttoleft+=arr[i][j];
            }
        }
     }
     int sum=lefttoright-righttoleft;
     if((sum<0)){
System.out.println(-sum);        
     }
        else
    {
        System.out.println(sum);
    }
     }
    
}
