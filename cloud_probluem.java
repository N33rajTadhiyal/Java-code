import java.lang.ref.Cleaner;

class cloud{
    public static void main(String[] args) {
        int a[]={0,0,0,0,1,0};
        int step =0;
        int i =0;
        while(i<a.length-1)
        {
            if(a[i+2]==1)
            {
                step++;
                i =i+1;
            }
            else{
                step++;
                i = i+2;
            }
        }
         System.out.println(step+"  :total steps");
         System.out.println(a.length+" :is the length of array");


    }
}