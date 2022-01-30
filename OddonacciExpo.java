import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OddonacciExpo {
    static int step=0;
    public static void main(String[] args) {
        step=0;
        int i =50;
        String content = "";
            long startTime = System.currentTimeMillis();
            long oddonacciNumber = oddonacciExpo(i);
            long endTime = System.currentTimeMillis();
            content += String.format("Oddonacci(%d) : %d \n" +
                    "Runtime in Second : %d \n" +
                    "Step's count : %d \n" +
                    "-----------------------------\n",i,oddonacciNumber,((endTime-startTime)/1000),step);
        try{
            writeLog(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static long oddonacciExpo(int num){
        step++;
        //Base case
        if (num==1 ||num==2||num==3) return 1;
        // Binary Recursive Call
        return oddonacciExpo(num-1)+oddonacciExpo(num-2)+oddonacciExpo(num-3);
    }
    public static void writeLog(String content) throws IOException {
        File outputFile = new File("output.txt");
        if (!outputFile.exists())outputFile.createNewFile();
        FileWriter writer = new FileWriter(outputFile);
        writer.write(content);
        writer.close();
        System.out.println("Successfully wrote to the log.txt file.");
    }
}
