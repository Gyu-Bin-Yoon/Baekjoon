import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int num = s.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-' || c == '=') {
                num--;
                if (i > 1 && s.substring(i - 2, i).equals("dz")) num--;
            } else if (c == 'j' && i > 0) {
                if (s.charAt(i - 1) == 'l' || s.charAt(i - 1) == 'n') num--;
            }
        }

        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
        br.close();
    }
}
