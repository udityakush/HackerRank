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
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int totalstudentsarrivedontime=0;
            
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            
            for(int i =0;i<n;i++){
                if(a[i]<=0){
                    totalstudentsarrivedontime++;
                }
             
                
            }
               if(totalstudentsarrivedontime<k){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            
        }
        }
     
      
    

