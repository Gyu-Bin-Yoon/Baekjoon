import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st =new StringTokenizer(br.readLine());
        int[] calc=new int[2];
        for(int i=0;i<2;i++){
            calc[i]=Integer.parseInt(st.nextToken());
        }

        if((calc[0]+calc[1])%2==0 && (calc[0]-calc[1])%2==0 ){
            int a = (calc[0]+calc[1])/2;
            int b = (calc[0]-calc[1])/2;

            if (a >= 0 && b >= 0)
                bw.write(a + " " + b);
            else
                bw.write(String.valueOf(-1));
        }else{
            bw.write(String.valueOf(-1));
        }

        bw.flush();

        br.close();
        bw.close();

    }
}
