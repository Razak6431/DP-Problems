public class Total_Unique_Paths {
    public static void main(String[] args) {
//        int [][]mat={
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };
        int [][]mat={
                {1,2,3},
                {5,6,7},
                {9,10,11},
                {13,14,15}
        };
        int n= mat.length;
        int m=mat[0].length;
        int[][]dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
         //recursion and memoization
        //System.out.println(func(n-1,m-1,mat,dp));

        //tabulation
        //time complexity=O(n*m)
        //space complexity =O(n*m)
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0){
                    dp[0][0]=1;
                }else {
                    int right = 0;

                    int down = 0;
                    if(j>0)
                        right = dp[i][j-1];
                    if(i>0 )
                    down = dp[i - 1][j];

                    dp[i][j] = right + down;
                }
            }
        }




        System.out.println(dp[n-1][m-1]);
        System.out.println();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(dp[i][j]+"  ");
            }
            System.out.println();
        }


    }
        //recursion and memoization
//    public static int func(int n,int m,int[][]mat,int [][]dp){
//        if(n==0&& m==0){
//            return 1;
//        }
//
//        if(n<0||m<0)return 0;
//        if(dp[n][m]!=-1){
//            return dp[n][m];
//        }
//        int left=func(n,m-1,mat,dp);
//        int up=func(n-1,m,mat,dp);
//
//        //return left+up;
//
//       return dp[n][m]=left+up;
//    }
}
