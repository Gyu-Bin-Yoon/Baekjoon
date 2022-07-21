import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            int min = n1 <= n2 ? n1 : n2;
            int gcd = 1;
            int cd = 2;

            int tmp_n1 = n1, tmp_n2 = n2;
            while (cd <= min) {
                if (tmp_n1 % cd == 0 && tmp_n2 % cd == 0) {
                    gcd *= cd;
                    tmp_n1 /= cd;
                    tmp_n2 /= cd;
                } else cd++;
            }

            int lcm = gcd * (n1 / gcd) * (n2 / gcd);

            bw.write(lcm + "\n");
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
