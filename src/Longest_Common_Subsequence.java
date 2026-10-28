public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        String s1="adebc";
        String s2="dcadb";
//        String s1="abc";
//        String s2="dea";
        int n=s1.length();
        int m=s2.length();
        int [][]dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=-1;
            }
        }
        //recursive and memoization approach
       // System.out.println(func(n-1,m-1,s1,s2,dp));
//        func(n-1,m-1,s1,s2,dp);
//        System.out.println(dp[n-1][m-1]);

        //Tabulation approach
        for(int i=0;i<n;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        System.out.println(dp[n][m]);
        for(int i=0;i<n+1;i++){
            for(int j=0;j<=m;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

    }
//    public static int func(int ind1,int ind2,String s1,String s2,int[][]dp){
//        if(ind1<0|| ind2<0){
//            return 0;
//        }
//      if(dp[ind1][ind2]!=-1){
//      return dp[ind1][ind2];
//       }
//        if(s1.charAt(ind1)==s2.charAt(ind2)){
//            return dp[ind1][ind2]=1+func(ind1-1,ind2-1,s1,s2,dp);
//        }
//
//        return dp[ind1][ind2]=Math.max(func(ind1,ind2-1,s1,s2,dp),func(ind1-1,ind2,s1,s2,dp));
//
//
//    }

}
