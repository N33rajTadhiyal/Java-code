public class majority_element_in_array {
    public static void main(String[] args) {
        
        majority_element_in_array ma= new majority_element_in_array();
        
        int a[]={2,1,3,1,1,5};
        int m =0;
        int c=1;
       
        for(int i =1;i<a.length;i++)
        {
            if(a[i]==a[m])
            {
                c++;
            }
            else{
              c--;
            }
            if(c==0)
            {
             m=i;
             c=1;
            }
        }
        System.out.println(a[m]+" is the answer");


    }

}
