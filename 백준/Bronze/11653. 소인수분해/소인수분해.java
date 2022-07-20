import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        int r = 2;
        while (n > 1) {
            if (n % r == 0) {
                n /= r;
                bw.write(r + "\n");
            } else {
                r++;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
