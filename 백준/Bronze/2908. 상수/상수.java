import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int new_num1 = num1 / 100 + num1 % 100 / 10 * 10 + num1 % 10 * 100;
        int new_num2 = num2 / 100 + num2 % 100 / 10 * 10 + num2 % 10 * 100;

        if(new_num1>new_num2) bw.write(String.valueOf(new_num1));
        else bw.write(String.valueOf(new_num2));

        bw.flush();
        bw.close();
        br.close();
    }
}
