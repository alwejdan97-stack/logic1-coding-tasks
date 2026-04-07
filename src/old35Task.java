public class old35Task {
    public static void main(String[] args){
        int number = 10;
        System.out.println(old35(number));
    }
    public static boolean old35(int number){
        if(number > 0){
            if(number % 3 == 0 && number % 5 != 0){
                return true;
            }if(number % 5 == 0 && number % 3 != 0){
                return true;
            }else if(number % 3 == 0 && number % 5 == 0){
                return false;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
