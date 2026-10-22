public class SpiralMatrixIII {
    public static void main(String[] args) {
        int [][]mat={
                {30,25,16,7,8,9},
                {29,24,15,6,1,2},
                {28,23,14,5,4,3},
                {27,22,13,12,11,10},
                {26,21,20,19,18,17}
        };
        int rstart=1;
        int cstart=4;
        int l=mat.length;
        int m=mat[0].length;
        int []dr={0,1,0,-1};
        int []dc={1,0,-1,0};
        int n=l*m;
        int [][]res=new int[n][2];
        res[0][0]=rstart;
        res[0][1]=cstart;

        int count=1;
        int index=0;
        int steps=1;
        while(count<n){
            for(int times=0;times<2;times++){
                int r=dr[index%4];
                int c=dc[index%4];

                for(int k=0;k<steps;k++) {
                    rstart += r;
                    cstart += c;
                    if (rstart >= 0 && rstart < l && cstart >= 0 && cstart < m) {
                        res[count][0] = rstart;
                        res[count][1] = cstart;
                        count++;
                    }
                }
                index++;
            }

            steps++;

        }


        for (int i = 0; i < n; i++) {
            System.out.println("(" + res[i][0] + "," + res[i][1] + ")");
        }






    }
}
