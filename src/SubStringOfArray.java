import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SubStringOfArray {

    public static boolean fun(String s,int k)
    {
       HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            set.add(ch);
        }
        if(set.size()==k)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int n=s.length();
        int ans=0;

        System.out.println("Enter the number of characters in the string");
        int k=sc.nextInt();


        for(int i=0;i<n-k+1;i++) {
            boolean temp = fun(s.substring(i, i + k), k);

            if (temp) ;
            {
                ans = ans + 1;
            }
        }
        System.out.println(ans);

    }
}
