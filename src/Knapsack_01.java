public class Knapsack_01 {
    public static void main(String[] args) {
        int []weights={3,2,5};
        int [] values={30,40,60};
        int wt=6;
        int n= values.length;
        int [][]dp=new int[n][wt+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<wt+1;j++){
                dp[i][j]=-1;
            }
        }
        //recursion and memoization approach
//        System.out.println(func(n-1,wt,weights,values,dp));
//         //func(n-1,wt,weights,values,dp);
//        System.out.println(dp[n-1][wt]);

        //Tabulation approach
        //base case
        for(int w=weights[0];w<=wt;w++){
            dp[0][w]=values[0];
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<=wt;j++){
                int notTake=dp[i-1][j];
                int take=Integer.MIN_VALUE;
                if(weights[i]<=j)
                    take=values[i]+dp[i-1][j-weights[i]];

                dp[i][j]=Math.max(take,notTake);
            }
        }
        System.out.println(dp[n-1][wt]);


    }
//    public static int func(int ind,int wt,int[]weight,int []values,int [][]dp){
//        if(ind==0){
//            if(weight[0]<=wt){
//                return values[0];
//            }else{
//                return 0;
//            }
//        }
//
//        if(dp[ind][wt]!=-1)return dp[ind][wt];
//        int notTake=func(ind-1,wt,weight,values,dp);
//
//        int take=Integer.MIN_VALUE;
//        if(weight[ind]<=wt)
//            take=values[ind]+func(ind-1,wt-weight[ind],weight,values,dp);
//
//        //return Math.max(take,notTake);
//        return dp[ind][wt]=Math.max(take,notTake);
//
//    }
}
