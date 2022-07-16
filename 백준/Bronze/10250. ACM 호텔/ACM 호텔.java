import java.awt.*;
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

        int T = Integer.parseInt(br.readLine());

        int[][] test = new int[T][3];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                test[i][j] = Integer.parseInt(st.nextToken());
            }

            int floor = test[i][2]%test[i][0];
            int room =test[i][2]/test[i][0];

            if(floor==0){
                bw.write(String.valueOf(test[i][0]*100+room));
            }else{
                bw.write(String.valueOf(floor*100+room+1));
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
