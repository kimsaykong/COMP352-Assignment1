public class MyAlgorithm {
    public static void main(String[] args) {
        int[] arr = {43, 16, 40, 77, 53};
        System.out.print("Original Array: [");
        for (int j:arr){
            System.out.print(j + " ,");
        }
        System.out.print(" ]\n");
        arr = sortArray(arr,5);
        System.out.print("Modify Array: [");
        for(int i: arr){
            System.out.print(i+", ");
        }
        System.out.print(" ]\n");
        System.out.print("Number of step: " + step);
    }
    static int step=0;
    public static int[] sortArray(int[] a,int n){
        boolean done = true;
        int j = 0;
        while (j<= n-2){
            step++;
            if (a[j]>a[j+1]){
                //Swap index
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1]=temp;
                done=false;
            }
            j++;
        }
        j = n-1;
        while (j>=1){
            step++;
            if (a[j]<a[j-1]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1]=temp;
                done=false;
            }
            j--;
        }
        if (!done) {sortArray(a,n);}
        else{
            return a;
        }
        return a;
    }
}
