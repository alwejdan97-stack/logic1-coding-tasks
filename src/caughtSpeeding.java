public class caughtSpeeding {
    public static void main(String[] args){
        int s=60;
        boolean b=true;
        System.out.println(caughtSpeeding(s,b));
    }
    public static boolean caughtSpeeding(int speed, boolean isBirthday){
        if(isBirthday==true){
            if(speed <= 65){
                System.out.println("no ticket");
            }else if(speed>=66 || speed<=85){
                System.out.println("small ticket");
            }else if(speed>=86){
                System.out.println("big ticket");
            }
        }else{
            if(speed <= 60){
                System.out.println("no ticket");
            }else if(speed>=61 || speed<=80){
                System.out.println("small ticket");
            }else if(speed>=81){
                System.out.println("big ticket");
            }
        }
        return isBirthday;
    }
}
