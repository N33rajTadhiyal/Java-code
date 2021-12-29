public class IshanLovesChocklet {
    public static void main(String[] args) {

        /**
         * As we know, Ishaan has a love for chocolates. He has bought a huge chocolate bar that contains N chocolate squares. Each of the squares has a tastiness level which is denoted by an array A[].
Ishaan can eat the first or the last square of the chocolate at once. Ishaan has a sister who loves chocolates too and she demands the last chocolate square. Now, Ishaan being greedy eats the more tasty square first. 
Determine the tastiness level of the square which his sister gets.
         */
        int a[]={5,4,2,9};
        int i =0;
        int j =a.length-1;
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
