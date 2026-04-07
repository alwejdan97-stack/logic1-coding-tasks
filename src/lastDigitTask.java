public class lastDigitTask {
    public static void main(String[] args){
        int a = 23;
        int b =19;
        int c = 3;
        System.out.println(lastDigit(a,b,c));
    }
    public static boolean  lastDigit(int a, int b, int c){
        if(a > 0 && b > 0 && c > 0){
            if(a%10==b%10 || a%10==c%10 || c%10==b%10){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
