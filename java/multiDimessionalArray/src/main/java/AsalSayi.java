public class AsalSayi {

    public static void main(String[] args) {
        int number = -2;
        //asal sayı kendisinden ve 1 den başka sayıya bölünemeyen sayı


        boolean isPrime = true;

        if (number==1){
            System.out.println("sayı asal değildir");
            return;
        }
        if (number<1){
            System.out.println("geçersiz sayı.");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;

            }
        }

        if(isPrime==true){
            System.out.println("sayı asaldır");
        }
        else {
            System.out.println("sayı asal değildir.");
        }
    }
}
