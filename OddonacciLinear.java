import jdk.jfr.Unsigned;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OddonacciLinear {
    static int step=0;
    public static void main(String[] args) {
        String content = "";
        for (int i =5;i<=100;i=i+5){
            long startTime = System.currentTimeMillis();
            Long oddonacciNumber = oddonacciLinear(i,1,1,1);
            long endTime = System.currentTimeMillis();
            content += String.format("Oddonacci(%d) : %d \n" +
                                    "Runtime in Second : %d \n" +
                                    "Step's count : %d \n" +
                                    "-----------------------------\n",i,oddonacciNumber,((endTime-startTime)/1000),step);
        }
        try{
            writeLog(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static long oddonacciLinear(int num,int first, int second, int third){
        step++;
        // base case
        if (num==1 || num==2 || num==3) return third;
        // tail recursive call
        return oddonacciLinear(num-1,second,third,first+second+third);
    }
    public static void writeLog(String content) throws IOException {
        File outputFile = new File("outputLinear.txt");
        if (!outputFile.exists())outputFile.createNewFile();
        FileWriter writer = new FileWriter(outputFile);
        writer.write(content);
        writer.close();
        System.out.println("Successfully wrote to the log file.");
    }
}
