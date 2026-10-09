public class Maximum_Path_Sum_In_Matrix {
    public static void main(String[] args) {
        int [][]mat={
                {1,2,10,4},
                {100,3,2,1},
                {1,1,20,2},
                {1,2,2,1}
        };
        int n=mat.length;
        int m=mat[0].length;
        System.out.println(func(n-1,m-1,mat,m));


    }

    public static int func(int r,int c,int [][]mat,int m){
        if(c<0 || c >= m )return Integer.MIN_VALUE;

        if(r==0){
            return mat[0][c];
        }

        int up=func(r-1,c,mat,m);
        int leftdiag=func(r-1,c-1,mat,m);
        int rightdiag=func(r-1,c+1,mat,m);

        return mat[r][c]+Math.max(up,Math.max(leftdiag,rightdiag));


    }


}
