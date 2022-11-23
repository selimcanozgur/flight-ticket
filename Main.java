import java.util.Scanner;
public  class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int km, age, type;
        double indirim;
        double ciftindirim;
        System.out.print("Km Giriniz: ");
        km = scanner.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        age = scanner.nextInt();
        System.out.print("Yolculuk Tipi: (1:Tek Yön - 2:Gidiş-Dönüş)");
        type = scanner.nextInt();

        double amount = (km * 0.10);

        if (age<12){
            if (type==2) {
                System.out.println("Gidiş-Dönüş %20 İndirim");
                ciftindirim = amount*0.20;
                amount = (amount-ciftindirim)*2;
            }
            indirim = (amount*0.50);
            amount = amount-indirim;
            System.out.println("%50 İndirim TUTAR: "+amount+"TL");
        }
        else if (age>=12 && age<=24){
            if (type==2) {
                System.out.println("Gidiş-Dönüş %20 İndirim");
                ciftindirim = amount*0.20;
                amount = (amount-ciftindirim)*2;
            }
            indirim = (amount*0.10);
            amount = amount-indirim;
            System.out.println("%10 İndirim TUTAR: "+amount+"TL");
        }
        else if (age>=65){
            if (type==2) {
                System.out.println("Gidiş-Dönüş %20 İndirim");
                ciftindirim = amount*0.20;
                amount = (amount-ciftindirim)*2;
            }
            indirim = (amount*0.30);
            amount = amount-indirim;
            System.out.println("%30 İndirim TUTAR: "+amount+"TL");
        }

        else {
            if (type==2) {
                System.out.println("Gidiş-Dönüş %20 İndirim");
                ciftindirim = amount*0.20;
                amount = (amount-ciftindirim)*2;
            }
            System.out.println(amount+ "TL");
        }

    }
}