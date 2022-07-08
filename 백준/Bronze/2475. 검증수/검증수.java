import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int[] num = new int[5];
        int[] re = new int[5];
        int result=0;

        for(int i=0;i<5;i++){
            num[i] = Integer.parseInt(st.nextToken());
            re[i] = num[i]*num[i];
            result+=re[i];
        }

        bw.write(String.valueOf(result%10));
        bw.flush();

        br.close();
        bw.close();

    }
}
