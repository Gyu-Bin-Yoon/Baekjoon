import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < 'D') total += 3;
            else if ('D' <= c && c < 'G') total += 4;
            else if ('G' <= c && c < 'J') total += 5;
            else if ('J' <= c && c < 'M') total += 6;
            else if ('M' <= c && c < 'P') total += 7;
            else if ('P' <= c && c < 'T') total += 8;
            else if ('T' <= c && c < 'W') total += 9;
            else total+=10;
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();

    }
}
