import java.util.*;

public class LongestPrefix {
    public static void main(String[] x) {
        Scanner xyz = new Scanner(System.in);
        String[] a = new String[3];
        System.out.println("Enter 3 strings:");

        for (int i = 0; i < a.length; i++) {
            a[i] = xyz.nextLine();
        }

        String s = "";
        boolean flag = false;
		
        for (int j = 0; j < a[0].length(); j++) {
            char currentChar = a[0].charAt(j);
            flag = true;

            for (int k = 1; k < a.length; k++) {
                if (j >= a[k].length() || a[k].charAt(j) != currentChar) {
                    flag = false; 
                    break;
                }
            }

            if (flag) {
                s += currentChar;
            } else {
                break; 
            }
        }

        System.out.println("Longest common prefix: " + (s.isEmpty() ? "None" : s));
    }
}
