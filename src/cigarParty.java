public class cigarParty {
    public static void  main(String[] args){
        int cig = 30;
        boolean weekend = true;
        System.out.println(cigarParty(cig,weekend));
    }
    public static boolean cigarParty(int cigars, boolean isWeekend){
        isWeekend = false;
        cigars = 0;
        if(isWeekend==false){
            if(cigars>=40 || 60 >= cigars){
                //System.out.println("successful");
                return true;
            }else{
                return false;
            }
        }else if(isWeekend==true){
            if( cigars >= 40){
                //System.out.println("successful");
                return true;
            }else{
                return false;
            }
        }return isWeekend;
    }
}
