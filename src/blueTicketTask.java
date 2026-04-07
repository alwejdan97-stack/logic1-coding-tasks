public class blueTicketTask {
    public static void main(String[] args){
        int a = 9;
        int b = 1;
        int c = 0;
        System.out.println(blueTicket(a,b,c));
    }
    public static int blueTicket(int a, int b, int c){
        if((a + b == 10) || (b + c == 10) || (a + c ==10)){
            return 10;
        }else if((a + b == 10) && ((b + c < a + b) || (a + c < a + b))){
            return 5;
        }else{
            return 0;
        }
    }
}
