public class GeekProductoffirstLarge {
  public static void main(String[] args) {

    int a[] = {5, 7, 9, 3, 6, 2};
    int b[] = {1, 2, 6, -1, 0, 9};
    int max= a[0], min=b[0];

    for(int i =1;i<a.length;i++)
    {
        max=Math.max(max, a[i]);

    }
    for(int i =1;i<b.length;i++)
    {
        if(b[i]<min)
        {
           
            min=b[i];
        }

    }
        System.out.println(min*max+" ");

  }    
}
