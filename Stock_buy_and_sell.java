public class Stock_buy_and_sell {
    public static void main(String[] args) {

        /**
         * we have to find the max amount of profit we can make by selling the stocks
         * we can buy and sell only one time
         * we always have to buy the stock first before selling it
         * 
         */

        int a[]={3,9,5,1,7,4,2,3};
        /** this the the price of stock on different days */

     int min=a[0];
     int maxprofit =0;
     for(int i =0;i<a.length;i++)
     {
         min =Math.min(min, a[i]);
         int profit=a[i]-min;
         maxprofit = Math.max(maxprofit, profit);
     }
     System.out.println(maxprofit+"  :is the max profit");

    }
    
}
