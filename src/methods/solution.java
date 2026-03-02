/*
import javax.xml.transform.Result;
import java.io.*;
import java.util.*;
import java.util.Scanner.nextlong;

 public class Result {



    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        Scanner sc= new Scanner(System.in);
        int n= ar.size();
        Long aVeryBigsum=0L;
        for(int i=1;i<n;i++){
            aVeryBigsum +=sc.nextLong();


        }
        return aVeryBigsum;
    }

}




class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arTemp[i]);
            ar.add(arItem);
        }

        long result = Result.aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}




 */