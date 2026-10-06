public class Solution {
    public static void main(String args[]){

        int []arr={20,30,40,20};


       int ans= func(arr.length-1,arr);
        System.out.println(ans);

    }

    public static int func(int ind,int[]arr){

        if(ind<=0)return 0;

        int l=Integer.MAX_VALUE;
        if(ind>=1)
         l=func(ind-1,arr)+Math.abs(arr[ind]-arr[ind-1]);

        int r=Integer.MAX_VALUE;
        if(ind>=2)
         r=func(ind-2,arr)+ Math.abs(arr[ind]-arr[ind-2]);

        return Math.min(l,r);

    }

}