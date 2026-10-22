public class Partition_Subset_With_Minimal_sum_diff {
    public static void main(String[] args) {

       // int []arr={3,2,7};
        int []arr={1,2,3,4};

        int n=arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
          totalSum+=arr[i];
        }
        boolean[][]dp=new boolean[n][totalSum+1];
        //Tabulation approach
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(arr[0]<=totalSum)dp[0][arr[0]]=true;

        for(int i=1;i<n;i++){
            for(int tar=0;tar<=totalSum;tar++){
                boolean notTake=dp[i-1][tar];
                boolean take=false;
                if(arr[i]<=tar)
                    take=dp[i-1][tar-arr[i]];

                dp[i][tar]=notTake || take;

            }
        }

        System.out.println("Dp table");
        for(int i=0;i<n;i++){
            for(int j=0;j<totalSum;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<=totalSum/2;i++){
            if(dp[n-1][i]==true){
                int s1=i;
                int s2=totalSum-i;

                int diff=Math.abs(s1-s2);
                mini=Math.min(mini,diff);
            }
        }

        System.out.println(mini);

    }
}
