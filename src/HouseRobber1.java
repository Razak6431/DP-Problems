import java.util.Arrays;

public class HouseRobber1 {
    public static void main(String[] args) {
        int []arr={2,8,19,9};
        int []dp=new int[arr.length];
        Arrays.fill(dp,-1);

//        func(arr.length-1, arr,dp);
//        System.out.println(dp[arr.length-1]);
//        System.out.println(func(arr.length-1, arr, dp)); // print return value


        //tabulation
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);

        for(int i=2;i<= dp.length-1;i++){
            int left=0;int right=0;
            left=arr[i]+dp[i-2];
            right=dp[i-1];

            dp[i]=Math.max(left,right);

        }
        System.out.println(dp[dp.length-1]);



    }

//    public static int func(int ind,int []arr,int []dp){
//        if(ind<0) {
//            return 0;
//        }
//        if(ind==0){
//            return arr[ind];
//        }
//
//
//        if(dp[ind]!=-1){
//              return dp[ind];
//          }
//        int pick=0;int notpick=0;
//
//        if(ind-2>=0) {
//            pick = arr[ind] + func(ind - 2, arr, dp);
//        }
//          if(ind-1>=0){
//              notpick = func(ind - 1, arr, dp);
//         }
//        dp[ind]=Math.max(pick,notpick);
//        return dp[ind];
//
//    }
}
