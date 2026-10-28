import java.util.ArrayList;

public class Longest_Common_Subsequence_Printing {
    public static void main(String[] args) {



        String s1="abcde";
        String s2="bdgek";
        int n=s1.length();
        int m=s2.length();
        int [][]dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=-1;
            }
        }

        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=m;j++){
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

        // find the length for optimized approach then traverse in a DP matrix and print the length

        int i=n;int j=m;
        StringBuilder sb=new StringBuilder();
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
               sb.append(s1.charAt(i-1));
               i--;j--;
            }else if(dp[i-1][j]>dp[i][j-1]){
                i=i-1;
            }else{
                j=j-1;
            }
        }
        System.out.println(sb.reverse().toString());


    }
}
