public class RodCutting {
    public static void main(String[] args) {
        int []price={2,5,7,8,10};
        int n=5;
        int [][]dp=new int[n][n+1];
        // recusive and memoization approach
       // System.out.println(func(price.length-1,n,price,dp ));
//        func(price.length-1,n,price,dp );
//        System.out.println(dp[n-1][n]);
        
        //Tabulation approach
        for(int i=0;i<n+1;i++){
            dp[0][i]=i*price[0];
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<=n;j++){
                int notTake=dp[i-1][j];
                int take=Integer.MIN_VALUE;
                int rodLength=i+1;
                if(rodLength<=j){
                    take=price[i]+dp[i][n-rodLength];
                }
                dp[i][j]=Math.max(take,notTake);
            }
        }

        System.out.println(dp[n-1][n]);

    }
//    public static int func(int ind,int n,int []price,int [][]dp){
//        if(ind==0){
//                return n*price[0];
//        }
//
//        int notTake=func(ind-1,n,price,dp);
//        int take=Integer.MIN_VALUE;
//        int rodLength=ind+1;
//        if(rodLength<=n){
//            take=price[ind]+func(ind,n-rodLength,price,dp);
//        }
//       // return Math.max(take,notTake);
//        return dp[ind][n]=Math.max(take,notTake);
//
//
//    }
}
