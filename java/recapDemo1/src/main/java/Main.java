public class Main {
    public static void main(String[] args) {
        int sayi1=26;
        int sayi2=25;
        int sayi3=2;

        int buyukSayi=sayi1;

        if (buyukSayi<sayi2){
            buyukSayi=sayi2;
        }
        if (buyukSayi<sayi3){
            buyukSayi=sayi3;
        }
        System.out.println("Büyük sayı= " +buyukSayi);
    }
}
