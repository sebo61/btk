import java.sql.SQLOutput;
import java.util.concurrent.CopyOnWriteArraySet;

public class SesliHarfler {
    public static void main(String[] args) {
        char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':

            case '0':
            case 'U':
                System.out.println("kalın sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");
        }

    }
}
