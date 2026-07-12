public class PracticeOnDemo {
    public static void main(String[] args)
    {
        int arr[]={5,6,5,3};
        int n=arr.length;
        int ans=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.println(i+" "+j);
                int temp=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    temp=temp+arr[k];
                }
                System.out.print(temp);
                System.out.println();
            }
        }

    }
}
