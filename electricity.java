public class Main {
    public static void main(String[] args){
        int units=200;
        int result=0;
        if(units<=50){
            result=units*5;
        }
        else if(units<=200){
            result=units*10;
        }
        else if(units>200){
            result=units*15;
        }
        System.out.println(result);
    }
}