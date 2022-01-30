public class App {
    public static void main(String[] args) {
        OddonacciExpo odd = new OddonacciExpo();
        long runtime = System.currentTimeMillis();
        //System.out.println(odd.oddonacciExpo(45));
        System.out.println("Start run time: "+runtime);
        long endtime = System.currentTimeMillis();
        System.out.println("End run time: "+ runtime);
        System.out.println("Time spent: "+ (endtime-runtime));
    }
}
