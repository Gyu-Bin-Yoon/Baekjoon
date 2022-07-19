import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int num[] = new int[26];

        for (int i = 0; i < num.length; i++) {
            num[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int alpha = s.charAt(i) - 97;
            if (num[alpha] == -1) {
                num[alpha] = i;
            }
        }

        for (int i = 0; i < num.length; i++) {
            bw.write(num[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
