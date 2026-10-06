public class StartPattern {
    public static void main(String[] args) {
        int n=5;



        for(int i=0;i<=n-1;i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    if ((i == 0 && j == 0) || (i == 0 && j == n - 1) || (i == n - 1 && j == 0) || (i == n - 1 && j == n - 1)) {
                        System.out.print("_");
                    } else {
                        System.out.print("*");
                    }
                }
                if (i % 2 == 1 && j % 2 == 1) {
                    if (i % 2 == 1 && j % 2 == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("_");
                    }
                }
                if((i%2==1 && j%2==0)|| (i%2==0 && j%2==1))
                System.out.print("_");

            }
            System.out.println();
        }

    }
}
