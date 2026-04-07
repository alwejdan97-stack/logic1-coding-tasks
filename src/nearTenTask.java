public class nearTenTask {
    public static void main(String[] args){
        int number = 10;
        System.out.println(nearTen(number));
    }
    public static boolean nearTen(int number){
        if(number > 0){
            if((number%10==0) || (number%10==1) || (number%10==2) || (number%10==8) || (number%10==9)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
