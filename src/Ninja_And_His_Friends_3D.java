public class Ninja_And_His_Friends_3D {
    public static void main(String[] args) {
        int [][]mat={
                {2,3,1,2},
                {3,4,2,2},
                {5,6,3,5}
        };
        int n= mat.length;
        int m=mat[0].length;
        int [][][]dp=new int[n][m][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<m;k++){
                    dp[i][j][k]=-1;
                }
            }
        }


        //recursive and memoization approach
        System.out.println(func(0,0,m-1,mat,n,m,dp));

        //System.out.println(dp[n-1][m-1][m-1]);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<m;k++){
                    System.out.print(dp[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }

    public static int func(int i,int j1, int j2,int [][]mat,int n,int m,int [][][]dp){

        if(j1<0 || j1>=m || j2<0 || j2>=m)return Integer.MIN_VALUE;

        if(i==n-1){
          if(j1==j2)return mat[i][j1];
          else return mat[i][j1]+mat[i][j2];
        }
        if(dp[i][j1][j2]!=-1){
            return dp[i][j1][j2];
        }
        int maxi=0;
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1; dj2++){

                if(j1==j2) {
                   maxi= Math.max(maxi,mat[i][j1]+func(i+1,j1+dj1,j2+dj2,mat,n,m,dp));
                }else {
                    maxi = Math.max(maxi, mat[i][j1] + mat[i][j2]+func(i + 1, j1 + dj1, j2 + dj2, mat, n, m,dp));
                }
            }
        }
        //return maxi;
        return dp[i][j1][j2]=maxi;
    }

}
