public class SubString {



    public static void main(String args[]) {


        String ar="PRASAD";

       int s=ar.length();

        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                for(int k=i;k<j;k++)
                {

                    System.out.print(ar.charAt(k) +" ");

                }
                System.out.println();
            }
        }




    }
}
