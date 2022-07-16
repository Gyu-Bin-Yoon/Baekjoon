import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[num];

        for (int i = 0; i < num; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        int min=input[0];
        int max=input[0];
        for (int i = 0; i < num; i++) {
            if (input[i] > max) {
                max = input[i];
            } else if (input[i] < min) {
                min = input[i];
            }
        }

        bw.write(min +" "+max);
        bw.flush();
        bw.close();
        br.close();
    }
}
