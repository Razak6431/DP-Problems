public class Subset_Sum_Equals_To_Target {
    public static void main(String[] args) {

        int []arr={1,2,3,4};
        int n=arr.length;
        int target=4;

        boolean [][]dp=new boolean[n+1][target+1];
        //recursion and memoization
//        System.out.println(func(n-1,target,arr,dp));
//        System.out.println(dp[n-1][target]);

        System.out.println();

//        for(int i=0;i<n+1;i++){
//            for(int j=0;j<target+1;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }


        //Tabulation approach
        //base case
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if (arr[0] <= target) dp[0][arr[0]] = true;


        for(int i=1;i<n;i++){
            for(int tar=1;tar<=target;tar++){
                Boolean notTake=dp[i-1][tar];
                boolean take=false;
                if(tar>=arr[i])
                    take=dp[i-1][tar-arr[i]];

                dp[i][tar]=take||notTake;
            }
        }

        System.out.println(dp[n-1][target]);

                for(int i=0;i<n+1;i++){
            for(int j=0;j<target+1;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }


    }

//    public static boolean func(int n,int target,int []arr,boolean [][]dp){
//        if(target==0)return true;
//        if(n==0)return (arr[0]==target);
//
//        if(dp[n][target]!=false)return dp[n][target];
//
//        boolean notTake=func(n-1,target,arr,dp);
//        boolean take=false;
//        if(target>=arr[n])
//             take=func(n-1,target-arr[n],arr,dp);
//
//
//        return dp[n][target]=take||notTake;
//    }
}
