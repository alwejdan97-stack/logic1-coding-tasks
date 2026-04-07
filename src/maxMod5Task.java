public class maxMod5Task {
    public static void main(String[] args){
        int a = 3;
        int b = 3;
        System.out.println(maxMod5(a,b));
    }
    public static int maxMod5(int a, int b){
        if(a==b){
            return 0;
        }else if(a % 5 == b % 5){
            if(a > b){
                return b;
            }else{
                return a;
            }
        }else{
            if(a > b){
                return a;
            }else{
                return b;
            }
        }
    }
}
