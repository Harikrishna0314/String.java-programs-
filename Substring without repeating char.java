import java.util.*;
public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";

        boolean[] visited = new boolean[256];
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);

            while (visited[currChar]) {
                visited[s.charAt(left)] = false;
                left++;
            }

            visited[currChar] = true;
            
            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        System.out.println(maxLength);
    }
}
