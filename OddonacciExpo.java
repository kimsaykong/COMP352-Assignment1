public class OddonacciExpo {
    public int oddonacci(int num){
        if (num<=3) return 1;
        return oddonacci(num-1)+oddonacci(num-2)+oddonacci(num-3);
    }
}
