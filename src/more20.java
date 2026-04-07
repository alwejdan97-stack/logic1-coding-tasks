public class more20 {
    public static void main(String[] args){
        int number = 21;
        System.out.println(more20(number));
    }
    public static boolean more20(int number){
            if(number>0) {
                if (number % 20 == 1 || number % 20 == 2) {
                    return true;
                } else {
                    return false;
                }
            }else{
                return false;
            }
    }

}
