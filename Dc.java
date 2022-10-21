import java.io.*;
import java.util.*;

 

public class Dc {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter wr = new PrintWriter(System.out);
            int T = Integer.parseInt(br.readLine().trim());
            for(int t_i = 0; t_i < T; t_i++)
            {
                String N = br.readLine();

 

                String out_ = Check_Integer(N);
                System.out.println(out_);
                
             }

 

             wr.close();
             br.close();
        }
        static String Check_Integer(String N) {
            String result = "YES";
            char[] sc = N.toCharArray();
            if(sc[0]=='0') {
                result="NO";
            }else {
            for(int i=0;i<sc.length;i++) {    
                if(sc[i]=='.') {
                    for(int j=i+1;j<sc.length;j++) {
                        if(sc[j]!='0') {
                            result="NO";
                            break;
                        }
                    }
                }
            }
            }
            return result;
        
        }
}