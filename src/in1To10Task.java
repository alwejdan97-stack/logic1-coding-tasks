public class in1To10Task {
    public static void main(String[] args){
        int n= 5 ;
        boolean outsideMode = true;
        System.out.println(in1To10(n,outsideMode));
    }
    public static boolean in1To10(int n, boolean outsideMode){
        if(outsideMode == false){
            if(n >= 1 || n <= 10){
                return true;
            }else{
                return false;
            }
        }else if(outsideMode == true){
            if(n <= 1 || n >= 10){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
