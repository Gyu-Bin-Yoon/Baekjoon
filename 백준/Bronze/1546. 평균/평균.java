import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());
        float[] score=new float[n];
        float max=0;
        StringTokenizer st=new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            score[i]=Integer.parseInt(st.nextToken());
            if(max<score[i]) max=score[i];
        }

        float sum=0;
        for(int i=0;i<n;i++){
            score[i]=score[i]/max*100;
            sum+=score[i];
        }

        bw.write(String.valueOf(sum/n));
        bw.flush();
        bw.close();
        br.close();
    }
}
