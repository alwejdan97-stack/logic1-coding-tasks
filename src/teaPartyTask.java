public class  {
    public static void main(String[] args){
        int tea = 6;
        int candy = 8;
        System.out.println(teaParty(tea,candy));
    }
    public static int teaParty(int tea, int candy){
        if(tea < 5 || candy < 5){
            System.out.println("bad party");
            return 0;
        }else if(tea >= 5 || candy >= 5){
            System.out.println("good party");
            return 1;
        }else if((tea >= 2 * candy) || (candy >= 2 * tea)){
            System.out.println("great party");
            return 3;
        }else{
            System.out.println("good party");
            return 1;
        }
    }
}
