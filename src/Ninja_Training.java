public class Ninja_Training {
    public static void main(String[] args) {
//        int[][] tasks={
//                {2,1,3},
//                {3,4,6},
//                {10,1,6},
//                {8,3,7}
//        };
//        int[][] tasks={
//
//                {10,50,1},
//                {5,100,11}
//        };

        int[][] tasks={

                {1,2,5},
                {3,1,1},
                {3,3,3}
        };

        int n=tasks.length;
        int [][]dp=new int[n][3+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                dp[i][j]=-1;
            }
        }
       // func(n-1,3,tasks,dp);

        //Tabulation approach
       dp[0][0]=Math.max(tasks[0][1],tasks[0][2]);
        dp[0][1]=Math.max(tasks[0][0],tasks[0][2]);
        dp[0][2]=Math.max(tasks[0][1],tasks[0][0]);
        dp[0][3]=Math.max(tasks[0][0],Math.max(tasks[0][1],tasks[0][2]));

        for(int day=1;day<=n-1;day++){
            int maxi=0;
            for(int last=0;last<4;last++){
            for(int task=0;task<3;task++) {
                if (task != last) {
                    int points = tasks[day][task] + dp[day - 1][task];
                    maxi = Math.max(points, maxi);
                    dp[day][last] = maxi;
                }
            }
            }
        }


        System.out.println(dp[n-1][3]);

        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                System.out.print(dp[i][j]+"  ");
            }
            System.out.println();
        }

    }
      // Recursive and Memoization approach
//    public static int func(int n,int last,int[][]task,int[][]dp){
//        if(n==0){
//            int maxi=0;
//            for(int i=0;i<=2;i++){
//                if(i!=last){
//                    int sum=task[0][i];
//                    maxi=Math.max(sum,maxi);
//                }
//            }
//            return maxi;
//        }
//
//        if(dp[n][last]!=-1){
//            return dp[n][last];
//        }
//        int maxi=0;
//        for(int i=0;i<=2;i++){
//            if(i!=last){
//                int points=task[n][i]+func(n-1,i,task,dp);
//                maxi=Math.max(points,maxi);
//            }
//            dp[n][last]=maxi;
//
//        }
//        //return maxi;
//        return maxi;
//
//
//    }
}
