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

        int sub_min = hour * 60 + min - 45;
        if (sub_min >= 0)
            bw.write(sub_min / 60 + " " + sub_min % 60);
        else
            bw.write((24 * 60 + sub_min) / 60 + " " + (24 * 60 + sub_min) % 60);

        bw.flush();

        br.close();
        bw.close();
    }
}
