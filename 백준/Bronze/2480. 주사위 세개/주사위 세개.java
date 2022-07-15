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

        int[] num = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(st.nextToken());

        }

        if(num[0]==num[1]){
            if(num[1]==num[2]){
                bw.write(String.valueOf(10000+1000*num[0]));
            }
            else{
                bw.write(String.valueOf(1000+num[0]*100));
            }
        }else{
            if(num[1]==num[2]){
                bw.write(String.valueOf(1000+num[1]*100));
            } else if (num[0]==num[2]) {
                bw.write(String.valueOf(1000+num[0]*100));
            }else{
                int max =num[0];
                for(int i=0;i<2;i++){
                    if(max<num[i+1])
                        max=num[i+1];
                }
                bw.write(String.valueOf(max*100));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
