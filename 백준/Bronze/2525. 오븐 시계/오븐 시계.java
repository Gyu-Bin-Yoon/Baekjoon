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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());

        if ((hour * 60 + min + time) / 60 > 23) {
            hour = (hour * 60 + min + time) % 1440 / 60;
            min = (hour * 60 + min + time) % 1440 % 60;
            bw.write(hour+" "+min);
        } else {
            hour = (hour * 60 + min + time) / 60;
            min = (hour * 60 + min + time) % 60;
            bw.write(hour+" "+min);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
