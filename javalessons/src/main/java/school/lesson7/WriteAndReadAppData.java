package school.lesson7;

import java.io.*;

public class WriteAndReadAppData {
    public static void main(String[] args) {
        AppData head = new AppData(new String[]{"Value0","Value1","Value2"});
        AppData data = new AppData(new int[][]{{100,200,300},
                                               {400,500,600}});
        BufferedReader br = null;
        try {
            File file = new File("HomeWork7.csv");
            if(!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.println(head.writeHeader());
            pw.println(data.writeData());
            pw.close();

            br = new BufferedReader(new FileReader("HomeWork7.csv"));
            String line;
            while ((line = br.readLine()) !=null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
            }catch (IOException e){
                System.out.println("Error: " + e);
            }
        }
    }
}
