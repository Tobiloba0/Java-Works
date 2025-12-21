public class LogisticServices{
    public static void main(String[]args){
    System.out.println(PaymentValue(100));

    }
    public static int PaymentValue(int successful_package){
    int payment = 0;
    if(successful_package < 50){
        payment = (successful_package * 160) + 5000;

    }else if(successful_package > 49 && successful_package < 60){
        payment = (successful_package * 200) + 5000;
    } else if(successful_package > 59 && successful_package < 70){
        payment = (successful_package * 250) + 5000;
    } else if(successful_package >= 70){
        payment = (successful_package * 500) + 5000;   
    } else if(successful_package > 100){
        System.out.print("Invalid value");   
    }
    return payment;

    }



}


