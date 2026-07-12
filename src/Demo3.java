public class Demo3 {


    public static void main(String[] args) {

        {
            int arr[]={-2,-4,-3,-9};

            int tmax=Integer.MIN_VALUE;

            for(int i=0;i<arr.length;i++) {
                tmax = Math.max(tmax, arr[i]);
            }
                System.out.print(tmax+" ");


        }
    }
}
