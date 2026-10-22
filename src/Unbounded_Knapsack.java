public class Unbounded_Knapsack {
    public static void main(String[] args) {
    int[] weights={2,4,6};
    int maxWeight=10;
    int [] values={5,11,13};
    int n=weights.length;

    int [][]dp=new int[n][maxWeight+1];
    for(int i=0;i<n;i++){
        for(int j=0;j<maxWeight+1;j++){
            dp[i][j]=-1;
        }
    }
     //Recursion and Memoization Technique
        //System.out.println(func(n-1,maxWeight,weights,values,dp));
//        func(n-1,maxWeight,weights,values,dp);
//        System.out.println(dp[n-1][maxWeight]);
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<maxWeight+1;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }

        //Tabulation Approach
        //--Base case--//
        for(int w=0;w<=maxWeight;w++){
            dp[0][w]=(w/weights[0])*values[0];
        }

        for(int i=1;i<n;i++){
            for(int w=0;w<=maxWeight;w++){
                int notTake=dp[i-1][w];
                int take=Integer.MIN_VALUE;
                if(weights[i]<=w){
                    take=values[i]+dp[i][w-weights[i]];
                }
                dp[i][w]=Math.max(take,notTake);
            }
        }

        System.out.println(dp[n-1][maxWeight]);



    }
//    public static int func(int ind,int wt,int []weights,int [] values,int [][]dp){
//        if(ind==0){
//            if(weights[0]<=wt){
//                return (wt/weights[0])*values[0];
//            }else{
//                return Integer.MIN_VALUE;
//            }
//        }
//       if(dp[ind][wt]!=-1){
//           return dp[ind][wt];
//       }
//        int notTake=func(ind-1,wt,weights,values,dp);
//        int take=Integer.MIN_VALUE;
//
//        if(weights[ind]<=wt){
//            take=values[ind]+func(ind,wt-weights[ind],weights,values,dp);
//        }
//
//        //return Math.max(take,notTake);
//        return dp[ind][wt]=Math.max(take,notTake);
//
//    }


}
