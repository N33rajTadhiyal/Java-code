public class stock_buy_and_Sell2 {
    public static void main(String[] args) {
        /**
         * we can buy and sell the stock as many time as we want to maxmise the profit .
         * but we have to always sell the stock before buying it 
         * we cant hold 2 stock at the same time
         */


          int a[]={5,2,6,1,4,7,3,6};
          /** this the the price of stock on different days */
          int profit=0;
          for(int i =1;i<a.length;i++)
          {
              if(a[i]>a[i-1])
              {
                  profit+=a[i]-a[i-1];
              }
          }

          System.out.println(profit+" :max amount of profit");

    }
    
}
