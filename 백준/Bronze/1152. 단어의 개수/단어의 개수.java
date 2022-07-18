import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String[] sp = s.split(" ");
        ArrayList<String> split = new ArrayList<>();

        if (sp.length == 0) {
            bw.write("0");
        }else{
            for (int i = 0; i < sp.length; i++) {
                split.add(sp[i]);
            }

            if(split.get(0).equals("")) split.remove(0);
            if(split.get(split.size()-1).equals("")) split.remove(split.size()-1);
            bw.write(String.valueOf(split.size()));
        }


        bw.flush();
        bw.close();
        br.close();
    }
}

