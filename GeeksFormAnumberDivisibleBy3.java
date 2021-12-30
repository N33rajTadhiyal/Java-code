public class GeeksFormAnumberDivisibleBy3 {
    public static void main(String[] args) {
        int a[]={40,50,90};
        int s =0;
        for(int i =0;i<a.length;i++)
        {
            s+=a[i];
        }
        int ak = s;
        if(ak%3==0)
        {
            System.out.println(1+"");
        }
        else{
            System.out.println(0+" ");
        }
    }
    
}
