import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String new_s = s.toUpperCase();

        int[] alpha = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = 0;
        }

        for (int i = 0; i < new_s.length(); i++) {
            int index = new_s.charAt(i) - 65;
            alpha[index]++;
        }

        int max = 0;
        int index = -1;
        boolean same = false;
        for (int i = 0; i < 26; i++) {
            if (max < alpha[i]) {
                max = alpha[i];
                index = i;
                same = false;
            } else if (max == alpha[i]) {
                same = true;
            }
        }

        if(same) bw.write("?");
        else bw.write((char)index+65);

        bw.flush();
        bw.close();
        br.close();
    }
}
