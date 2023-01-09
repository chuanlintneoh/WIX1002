public class triangularNum {
    public static void main(String[] args) {
        int n = 20;
        int triangularNum = 0;
        System.out.println("Triangular Numbers:");
        for (int i = 1; i <= n; i++){
            System.out.printf("%3d ",calc(triangularNum,i));
            triangularNum = calc(triangularNum,i);
            if (i%10 == 0){
                System.out.println();
            }
        }
    }
    public static int calc(int a, int b){
        return a + b;
    }
}
