public class MukemmelSayi {
    public static void main(String[] args) {
        //mükemmel sayi midir
        int number = 76;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }

        }
        if(number==total){
            System.out.println("mükemmel sayi");
        }
        else {
            System.out.println("mükemmel sayı değil");
        }
    }
}
