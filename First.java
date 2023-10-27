package combined_arrays_and_objects;

public class First {
    public int add(int num1, int num2)
    {
        int result = num1+num2;
        return result;
    }
    public float add(float nums1, float nums2)
    {
        float result1 = nums1 + nums2;
        return result1;
    }
    public double add(double nums1, double nums2)
    {
        double result2 = nums1 + nums2;
        return result2;
    }

    public static void main(String[] args) {
        First f = new First();
        int result = f.add(10,20);
        System.out.println(result);
        float result1 = f.add(2.2f,2.2f);
        System.out.println(result1);
        double result2 = f.add(3.1d,3.1d);
        System.out.println(result2);

    }
}
