public class dateFashionTask {
    public static void main(String[] args){
        int you = 5;
        int date = 10;
        System.out.println(dateFashion(you, date));
    }
    public static int dateFashion(int you, int date){
        if((you >= 0 || you <=10) && (date >= 0 || date <=10)){
            if(you <= 2 || date <= 2){
                System.out.println("no");
                return 0;
            }else if(you >= 8 || date >= 8){
                System.out.println("yes");
                return 2;
            }else{
                System.out.println("maybe");
                return 1;
            }
        }
        return 0;
    }
}
