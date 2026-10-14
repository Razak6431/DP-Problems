public class Minimum_Coins {
    public static void main(String[] args) {
        int []arr={1,2,1};
        int target=8;
        int n=arr.length;
        int[][]dp=new int[n][target+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=target;j++){
                dp[i][j]=-1;
            }
        }
        //recursion approach
        //System.out.println(func(n-1,target,arr,dp));
        //memoization approach
//        func(n-1,target,arr,dp);
//        System.out.println(dp[n-1][target]);
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<target;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }

        for(int i=0;i<target+1;i++){
            if(i%arr[0]==0){
                dp[0][i]=i/arr[0];
            }else{
                dp[0][i]=Integer.MAX_VALUE;
            }
        }

        for(int i=1;i<n;i++){
            for(int tar=0;tar<=target;tar++){
                int notTake=dp[i-1][tar];
                int take=Integer.MAX_VALUE;
                if(arr[i]<=tar){
                    take=1+dp[i][tar-arr[i]];
                }

                dp[i][tar]=Math.min(take,notTake);
            }
        }

        System.out.println(dp[n-1][target]);


    }
//    public static int func(int ind,int target,int[]arr,int [][]dp){
//
//        if(ind==0){
//            if(target%arr[0]==0){
//                return target/arr[0];
//            }
//            else {
//                return Integer.MAX_VALUE;
//            }
//        }
//
//        if(dp[ind][target]!=-1)return dp[ind][target];
//        int notTake=func(ind-1,target,arr,dp);
//
//        int take=Integer.MAX_VALUE;
//        if(arr[ind]<=target)
//            take=1+func(ind,target-arr[ind],arr,dp);
//
//        //return Math.min(take,notTake);
//
//        return dp[ind][target]=Math.min(take,notTake);
//
//
//
//    }
}
