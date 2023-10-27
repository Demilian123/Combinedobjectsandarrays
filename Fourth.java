package combined_arrays_and_objects;

public class Fourth {
    public static void main(String[] args) 
    {
    int a[]={10,20,30,40,50};
    int element = 40;
    int index = -1;

    for(int i=0;i<5;i++)
    {
        if(a[i]==element)
        {
            index = i;
        }
    }
    System.out.println(index);
}
}
  