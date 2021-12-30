import java.util.*;

public class GeeksArrayRotation {
    public static void main(String[] args) {
    
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of testcases");
        int ts = sc.nextInt();

        int k =0;
        while(k<ts)
        {
            
        System.err.println("enter the number of rotation");
        int r =sc.nextInt();

        System.out.println("enter the number of element in array");
        int n = sc.nextInt();
        
        System.out.println("enter the elements in arraay");
        int a[]= new int[n];
        for(int i =0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
           if(r>a.length)
           {
               r=r%a.length;
           }  

        int ra[]=new int[r];//array which will hold rotated array element
        int rra[]=new int[a.length];//this will hold all the element
        int ne=0;
        for(int i =0;i<a.length;i++)
        {
            if(i<r)
            {
                ra[i]=a[i];
            }
            else{
               rra[ne]=a[i];
               ne++;
            }
         
        }
        int ii =(a.length-ra.length);
        int kk=0;
       for(int i =ii;i<a.length;i++)
        {
          rra[i]=ra[kk];
          kk++; 
        }
       


 
        for(int i =0;i<a.length;i++)
        {
           System.out.print(rra[i]+" ");
        }

        System.out.println();
        k++;
        }

    }
    
}
