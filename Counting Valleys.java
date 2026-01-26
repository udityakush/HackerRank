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
     int steps=sc.nextInt();
     String path= sc.next();
     
 int altitude=0;
 int valley=0;
 
 for(int i=0;i<path.length();i++){
    if(path.charAt(i)=='U')
{
    altitude++;
    if(altitude==0){
    valley++;
}
}

else{
    altitude--;
}

 }
    System.out.println(valley);


    }
}
