import java.io.*;

public class Que4 {
    public static void main(String[] args ) throws IOException {

        FileInputStream fis = new FileInputStream("input4.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("output4.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        
        while (true) {                              
            String s = br.readLine();               
            if (s == null) {                        
                break;
            }
              int n = Integer.parseInt(s);
              int sq = n * n;
              String t = sq +"\n";
              osw.write(t);                                            
}
            br.close();
            osw.close();

            System.out.println("done");
    }}