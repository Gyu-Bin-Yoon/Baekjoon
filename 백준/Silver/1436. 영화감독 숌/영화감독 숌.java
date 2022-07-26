import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int check = 0;
        int num = 665;
        while (check < n) {
            num++;
            if (String.valueOf(num).contains("666")) {
                check++;
            }
        }

        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
        br.close();
    }
}
