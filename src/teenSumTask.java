public class teenSumTask {
    public static void main(String[] args){
        int a = 9;
        int b = 1;
        System.out.println(teenSum(a,b));
    }
    public static int  teenSum(int a, int b){
        int sum = a+b;
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
            return 19;
        }else{
            return sum;
        }
    }
}
