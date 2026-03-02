package leetcode;


import java.util.Scanner;

class Solution1 {
        public boolean isPalindrome(Long x) {
            Scanner sc = new Scanner (System.in);

            Long num=sc.nextLong();

            Long n1=num%10;
            num=num/10;
            Long n2=num%10;
            num=num/10;
            long n3=num%10;
            num=num/10;

            long sum= (n1+n2*10+ n3*100);
            long sum1=(n1*100+ n2*10+n3);
            System.out.println((sum==sum1)?"this is":"this is not");

            return false;
        }


    }

