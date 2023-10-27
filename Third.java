package combined_arrays_and_objects;


public class Third {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        
        int sum = 0;
        for(int i=0;i<5;i++)
        {
            sum = sum+a[i];
        }
        System.out.print(sum);
    }
}
