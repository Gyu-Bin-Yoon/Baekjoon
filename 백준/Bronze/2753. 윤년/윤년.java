import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());
        boolean answer;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                answer = true;
            } else answer = false;
        } else {
            answer = false;
        }

        if (answer) bw.write('1');
        else bw.write('0');

        bw.flush();

        br.close();
        bw.close();

    }
}
