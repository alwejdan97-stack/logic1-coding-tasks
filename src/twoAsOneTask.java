public class twoAsOneTask {
    public static void main(String[] args){
        int a =1;
        int b = 4;
        int c = 3;
        System.out.println(twoAsOne(a,b,c));
    }
    public static boolean twoAsOne(int a, int b, int c){
        if((a+b==c) || (a+c==b) || (b+c==a)){
            return true;
        }else{
            return false;
        }
    }
}
