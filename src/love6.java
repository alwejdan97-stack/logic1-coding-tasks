public class love6 {
    public static void main(String[] args){
        int a=3;
        int b=9;
        System.out.println(love6(a,b));
    }
    public static boolean love6(int a, int b){
        if(a==6 || b==6){
            return true;
        }else if(a+b==6){
            return true;
        }else if(a-b==6){
            return false;
        }else{
            return false;
        }
    }
}
