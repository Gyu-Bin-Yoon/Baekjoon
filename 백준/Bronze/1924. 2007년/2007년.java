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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken());
        int date = Integer.parseInt(st.nextToken());

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int total = 0;
        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }
        total += date;
        bw.write(week[total % 7]);
        bw.flush();
        bw.close();
        br.close();
    }
}
