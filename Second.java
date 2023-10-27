package combined_arrays_and_objects;


public class Second {
    public int add(int a, int b)
    {
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        Second s =  new Second();
       int c =  s.add(10,20);
       System.out.println(c);
    }
}
