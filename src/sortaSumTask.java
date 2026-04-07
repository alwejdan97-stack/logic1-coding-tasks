public class sortaSumTask {
    public static void main(String[] args){
        int a = 10;
        int b = 10;
        System.out.println(sortaSum(a,b));
    }
    public static int sortaSum(int a, int b){
        int sum = a + b;
        if(sum >= 10 || sum <= 19){
            return 20;
        }else{
            return sum;
        }
    }
}
