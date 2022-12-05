import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rnd=new Random();
        Scanner scan=new Scanner(System.in);
        int number=rnd.nextInt(100);

        int right=0;
        int[] wrong=new int[5];
        boolean iswin=false;
        boolean isWrong = false;

        while (right<5) {
            System.out.print("Tahmininizi giriniz: ");
            int selected = scan.nextInt();
            if (selected>99 || selected<0){
                System.out.println("Lütfen 0-100 arası sayı giriniz!");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (selected == number){
                System.out.println("Tebrikler... Doğru tahmin! " + selected);
                iswin=true;
            break;
        }else {
                System.out.println("Maalesef yanlış tahmin, tekrar deneyiniz! ");
                if (selected>number){
                    System.out.println("Gizli sayıdan büyük bir değer girdiniz, lütfen daha küçük bir değer giriniz. ");
                }
                else{
                    System.out.println("Gizli sayıdan küçük bir değer girdiniz, lütfen daha büyük bir değer giriniz.");
                }
                wrong[right++]=selected;
                System.out.println("Kalan hakkınız: "+(5-right));;
            }

        }
        if (!iswin){
            System.err.println("Kaybettiniz. Doğru sayı: "+number);
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }
}
