import java.util.ArrayList;

public class SubString {


    public static void main(String args[]) {


        String s = "PRASAD CHAUHAN";
        int str = s.length();

        ArrayList<String> dd = new ArrayList<>();

        for (int i = 0; i < str; i++) {
            for (int j = i; j < str; j++) {
                String temp = s.substring(i, j + 1);

                dd.add(temp + " ");

            }


        }
        System.out.println(dd);
    }
}