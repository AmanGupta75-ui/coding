import java .util.Scanner;
public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]={10,11,-2,5,8,-20,55,78,24};
        int min,max;
        min=max=arr[0];
        for(int i=1;i<9;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];

            }
            if(max<arr[i])
            {
                max=arr[i];
            }

        }
        System.out.println("maximum element="+max);
        System.out.println("min element="+min);


    }
}
