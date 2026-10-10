public class Minimum_Path_Sum {

    public static void main(String[] args) {
        int[][]mat={
                {5,9,6},
                {11,5,2}
        };
        int n=mat.length;
        int m=mat[0].length;
        int [][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        //Recursive and memoization approaches
//        func(n-1,m-1,mat,dp);
//        System.out.println(dp[n-1][m-1]);

        //tabulation approach

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0){
                    dp[0][0]=mat[0][0];
                }else{
                    int up=Integer.MAX_VALUE;
                    int left=Integer.MAX_VALUE;
                    if(i>0)
                    up=dp[i-1][j];
                    if(j>0)
                    left=dp[i][j-1];

                    dp[i][j]=mat[i][j]+Math.min(up,left);
                }
            }
        }

        System.out.println(dp[n-1][m-1]);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(dp[i][j]+"  ");
            }
            System.out.println();
        }


    }
//   recursive and memoization approach
//    public static int func(int n,int m, int[][]mat,int[][]dp){
//        if(n==0 && m==0){
//            return mat[0][0];
//        }
//        if(n<0 || m<0)return Integer.MAX_VALUE;
//        if(dp[n][m]!=-1)return dp[n][m];
//
//        int up=func(n-1,m,mat,dp);
//        int left=func(n,m-1,mat,dp);
//
//        //return mat[n][m]+Math.min(up,left); for recursive approach
//
//        //for memoization
//        return dp[n][m]=mat[n][m]+Math.min(up,left);
//
//
//
//    }
}
