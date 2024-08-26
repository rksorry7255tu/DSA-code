public class maxprofit {
    public static void main(String[]args){
        int prices[]={2,4,1};
        int small=prices[0];
        int smallindex=0;
        int largeindex=0;
        int large=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<small){
                small=prices[i];
                smallindex=i;
            }
            if(prices[i]>large){
                large=prices[i];
                largeindex=i;
            }
        }
        if(smallindex<largeindex){
            maxprofit=large-small;
            
        }
        else if(smallindex>largeindex){
            large=0;
            for(int i=smallindex;i<prices.length;i++){
                if(prices[i]>large){
                    large=prices[i];
                }
            }
            maxprofit=large-small;
        }
        else{
            maxprofit=0;
        }
         if(smallindex>largeindex){
            large=prices[0];
            small=prices[0];
            for(int i=0;i<=largeindex;i++){
                if(prices[i]>large){
                    large=prices[i];
                }
                if(prices[i]<small){
                    small=prices[i];
                }
            }
            maxprofit=large-small;
         }else if(smallindex==prices[prices.length-1]){
            large=prices[0];
            small=prices[0];
            for(int i=0;i<=largeindex;i++){
                if(prices[i]>large){
                    large=prices[i];
                }
                if(prices[i]<small){
                    small=prices[i];
                }
            }
            maxprofit=large-small;
        }
        
        System.out.println(maxprofit);
        
    }
}
