public class Count_Subsets_With_Sum_K {
    public static void main(String[] args) {
        int []arr={1,2,2,3};
        int target=3;
        int n= arr.length;
        int [][]dp=new int[n][target+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<target+1;j++){
                dp[i][j]=-1;
            }
        }
        //recursive and memoization approach
       // System.out.println(func(n-1,target,arr,dp));
       // System.out.println(dp[n-1][target]);

        //tabulation approach
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        if(arr[0]<=target)dp[0][arr[0]]=1;

        for(int i=1;i<n;i++){
            for(int j=0;j<=target;j++){
                int notTake=dp[i-1][j];
                int take=0;
                if(arr[i]<=j)
                    take=dp[i-1][j-arr[i]];

                dp[i][j]=take+notTake;
            }
        }
        System.out.println(dp[n-1][target]);
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=target;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }



    }
    //recursion and memoization approach
//    public static int func(int ind,int target,int []arr,int [][]dp){
//        if(target==0)return 1;
//
//        if(ind==0){
//                if(arr[0]==target){
//                    return 1;
//                }else{
//                    return 0;
//                }
//        }
//
//        if(dp[ind][target]!=-1)return dp[ind][target];
//        int notTake=func(ind-1,target,arr,dp);
//        int take=0;
//
//        if(arr[ind]<=target)
//            take=func(ind-1,target-arr[ind],arr,dp);
//       //recursive approach
//       // return take+notTake;
//    return dp[ind][target]=take+notTake;
//
//    }


}
