import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());
        boolean exist = false;

        for(int i=0;i<n;i++){
            String s =String.valueOf(i);
            int length=s.length();
            int total=0;
            int[] num=new int[length];
            for(int j=0;j<length;j++){
                num[j]=s.charAt(j)-48;
                total+=num[j];
            }
            if(i+total == n){
                bw.write(String.valueOf(i));
                exist=true;
                break;
            }
        }

        if (!exist) bw.write(String.valueOf(0));

        bw.flush();
        bw.close();
        br.close();
    }
}
