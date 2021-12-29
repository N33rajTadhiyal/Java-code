public class IshanLovesChocklet {
    public static void main(String[] args) {
        int a[]={5,4,2,9};
        int n = a.length;
        int i =0;
        int j =n-1;
        int small=a[0];
        while(i<j)
        {
            if(a[i]>a[j])
            {
                
                i++;
            }
            else{
               j--;
            }
            
        }
        System.out.println(a[i]+" ");
        
    }
    
}
