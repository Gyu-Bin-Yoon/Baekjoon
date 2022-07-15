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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        int input = Integer.parseInt(br.readLine());

        second = second + input;

        if (second >= 60) {
            min = min + (second / 60);
            second = second % 60;
        }

        if (min >= 60) {
            hour = hour + (min / 60);
            min = min % 60;
        }

        if (hour >= 24) {
            hour = hour % 24;
        }

        bw.write(hour + " " + min + " " + second);
        bw.flush();

        br.close();
        bw.close();

    }
}
