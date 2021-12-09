import java.util.*;

public class Sales_by_match {
    public static void main(String[] args) {
        
    int a[]={1,3,2,1,4,5,2,4,5};
    int p =0;
        Set<Integer> st = new HashSet() ;

        for(int i =0;i<a.length;i++)
        {
           if(st.contains(a[i]))
           {
               st.remove(a[i]);
               p++;
           }
           else{
               st.add(a[i]);
           }

        }
        System.out.println(p+" amount of pares");



    }
}
