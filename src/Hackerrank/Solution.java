package Hackerrank;


import java.io.*;
import java.util.*;

    public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            int lenght=A.length();
            int lenght1=B.length();
            int m=(lenght+lenght1);
            System.out.println(m);
            if(A.compareTo(B)>0){
                System.out.println("yes");
            } else
                System.out.println("No");

            String A_cap = A.substring(0,1).toUpperCase() + A.substring(1);
            String B_cap = B.substring(0,1).toUpperCase() + B.substring(1);

            // Print result
            System.out.println(A_cap + " " + B_cap);

        }
    }





