package practice;

public class MaxProfit {
	
	public int maxProfit(int[]prices){
		
	//	int minPrice = prices[0];
		int maxProfit = 0;
		
//		for(int i = 1; i < prices.length; i++){
//			
//			int profit = prices[i] - minPrice;
//			maxProfit = Math.max(maxProfit, profit);
//			minPrice = Math.min(minPrice, prices[i]);
//		}
//		
//		return maxProfit;
		
		for(int i = 0; i<prices.length; i++){
			for(int j = i + 1; j<prices.length; j++){
				
				int profit = prices[j] - prices[i];
				
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		
		return maxProfit;
	}
		
		


	public static void main(String[] args) {
		
        int[]prices = {1, 5, 8, 3, 4, 6};
		
		MaxProfit mp = new MaxProfit();
		
		int result = mp.maxProfit(prices);
		System.out.println(result);
	}

}
