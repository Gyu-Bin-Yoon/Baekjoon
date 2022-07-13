import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            for (int j = num; j > i+1; j--) {
                bw.write(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                bw.write("*");
            }
            if (i < num - 1)
                bw.newLine();
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
