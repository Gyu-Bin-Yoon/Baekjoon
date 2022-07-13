import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        String[] nums = br.readLine().split("");

        int result = 0;
        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(nums[i]);
            result += n;
        }

        bw.write(String.valueOf(result));
        bw.flush();

        br.close();
        bw.close();
    }
}
