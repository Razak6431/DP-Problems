import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int arr[]={10,20,30,10};
   int dp[]=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            dp[i]=-1;
        }
//        func(arr,arr.length-1,dp);
//
//        System.out.println(dp[arr.length-1]);
//
//        for(int i=0;i<dp.length;i++){
//            System.out.print(dp[i]+"  ");
//        }


        //tabulation
        dp[0]=0;
        dp[1]=Math.abs(arr[0]-arr[1]);
        for(int i=2;i<= arr.length-1;i++){
            int left=0;int right=0;
            if(i-1>=0)
             left=dp[-1]+Math.abs(arr[i-1]-arr[i]);
            if(i-2>=0)
             right=dp[i-2]+Math.abs(arr[i-2]-arr[i]);

            dp[i]=Math.min(left,right);
        }


    }

//    public static int func(int []arr,int n,int []dp){
//
//        if(n<=0){
//            return 0;
//        }
//        if(n==1){
//            return Math.abs(arr[n]-arr[n-1]);
//        }
//        if(dp[n]!=-1){
//            return dp[n];
//        }
//            int left=0;
//
//        int right=0;
//
//        if(n-1>=0)
//         left=func(arr,n-1,dp)+Math.abs(arr[n]-arr[n-1]);
//
//        if(n-2>=0)
//         right=func(arr,n-2,dp)+Math.abs(arr[n]-arr[n-2]);
//
//        return dp[n]=Math.min(left,right);
//
//    }
}
