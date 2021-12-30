public class GeeksMultiplyleftandRightArraysum {
    public static void main(String[] args) {

        int a[]={1,2,3,4};
        int r=0,l=0;
        for(int i =0;i<a.length;i++)
        {
            if(i<a.length/2)
            {
                r+=a[i];
            }
            else{
                l+=a[i];
            }
        }
        System.out.println(l*r+" :");
        
    }
    
}
