public class ClimbingStairs {
    public static void main(String[] args) {
        int []arr={10,20,30,10};

        System.out.println(func(arr,arr.length-1));



    }


    public static int func(int []arr,int ind){

        if(ind==0){
            return arr[0];
        }
        if(ind==1)return Math.abs(arr[1]-arr[0]);

        int left=Math.abs(arr[ind]-arr[ind-1])+func(arr,ind-1);

        int right=Math.abs(arr[ind]-arr[ind-2])+func(arr,ind-2);


       return Math.min(left,right);




    }
}
