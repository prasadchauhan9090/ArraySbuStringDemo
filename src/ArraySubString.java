import java.util.HashMap;

public class ArraySubString {

    public static void main(String args[]) {


        int arr[]={1,2,3,5,3,4};

        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=i;k<j;k++)
                {

                    System.out.print(arr[k]+" ");

                }
                System.out.println();
            }
        }




    }
}