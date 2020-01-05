package Util;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Ruslan Nasibov (@nasibrus)
 */

public class CurrencyExchange {

    public static void main(String[] args) {

        double amount, code, euro, dollar, gbpound, rusruble, swedishkrone, danishkrone, bulgarianlev, canadiandollar, chineseyen, japaneseyen, norwegiankorune, czechkorune, manat;
        DecimalFormat df = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);

        System.out.println("Which currency You want to Convert ? ");

        System.out.println("1:Euro "
                + "\n 2:Dollar "
                + "\n 3:GB Pound "
                + "\n 4:RussianRuble "
                + "\n 5:Swedish Krone "
                + "\n 6:Danish Krone "
                + "\n 7:Bulgarian Lev "
                + "\n 8:Canadian Dollar "
                + "\n 9:Chinese Yen "
                + "\n 10:Japanese Yen "
                + "\n 11:Norwegian Korune "
                + "\n 12:Czech Korune"
                + "\n 13:Manat");
        System.out.println("CZK RATES TO OTHER VALUES"
                + "\n 1 Euro = 25,45 CZK "
                + "\n 1 USD = 22,96 CZK "
                + "\n 1 GBP = 30,20 CZK "
                + "\n 100 RUB = 34,00 CZK "
                + "\n 1 SEK = 2,35 CZK "
                + "\n 1 DKK = 3,30 CZK "
                + "\n 1 BGN = 13,05 CZK "
                + "\n 1 CAD = 17,20 CZK "
                + "\n 1 CNY = 3,22 CZK "
                + "\n 100 JPY = 20,50 CZK "
                + "\n 1 NOK = 2,35 CZK"
                + "\n 1 AZN = 13,45 CZK");

        code = sc.nextInt();

        System.out.println("How much Money you want to convert ?");
        amount = sc.nextDouble();

        //For amount conversion
        if (code == 1) {
            //Euro to other
            dollar = amount * 1.1146;
            System.out.println("Your " + amount + " Euro is : " + df.format(dollar) + " Dollar");
            gbpound = amount * 0.8366;
            System.out.println("Your " + amount + " Euro is : " + df.format(gbpound) + " GB Pound");
            rusruble = amount * 69.83;
            System.out.println("Your " + amount + " Euro is : " + df.format(rusruble) + " Russian Ruble");
            swedishkrone = amount * 10.4334;
            System.out.println("Your " + amount + " Euro is : " + df.format(swedishkrone) + " Swedish Krone");
            danishkrone = amount * 7.4731;
            System.out.println("Your " + amount + " Euro is : " + df.format(danishkrone) + " Danish Krone");
            bulgarianlev = amount * 1.9558;
            System.out.println("Your " + amount + " Euro is : " + df.format(bulgarianlev) + " Bulgarian Lev");
            canadiandollar = amount * 1.4643;
            System.out.println("Your " + amount + " Euro is : " + df.format(canadiandollar) + " Canadian Dollar");
            chineseyen = amount * 7.8025;
            System.out.println("Your " + amount + " Euro is : " + df.format(chineseyen) + " Chinese Yen");
            japaneseyen = amount * 122.188;
            System.out.println("Your " + amount + " Euro is : " + df.format(japaneseyen) + " Japanes Yen");
            norwegiankorune = amount * 10.0448;
            System.out.println("Your " + amount + " Euro is : " + df.format(norwegiankorune) + " Norwegian Korune");
            czechkorune = amount * 25.4652;
            System.out.println("Your " + amount + " Euro is : " + df.format(czechkorune) + " Czech Korune");
            manat = amount * 1.8921;
            System.out.println("Your " + amount + " Euro is : " + df.format(manat) + " Manat");
        }
        if (code == 2) {
            //Dollar to other
            euro = amount * 0.8972;
            System.out.println("Your " + amount + " Dollar is : " + df.format(euro) + " Euro");
            gbpound = amount * 0.8363;
            System.out.println("Your " + amount + " Dollar is : " + df.format(gbpound) + " GB Pound");
            rusruble = amount * 62.3526;
            System.out.println("Your " + amount + " Dollar is : " + df.format(rusruble) + " Russian Ruble");
            swedishkrone = amount * 9.3618;
            System.out.println("Your " + amount + " Dollar is : " + df.format(swedishkrone) + " Swedish Krone");
            danishkrone = amount * 6.7044;
            System.out.println("Your " + amount + " Dollar is : " + df.format(danishkrone) + " Danish Krone");
            bulgarianlev = amount * 1.7547;
            System.out.println("Your " + amount + " Dollar is : " + df.format(bulgarianlev) + " Bulgarian Lev");
            canadiandollar = amount * 1.3147;
            System.out.println("Your " + amount + " Dollar is : " + df.format(canadiandollar) + " Canadian Dollar");
            chineseyen = amount * 6.9988;
            System.out.println("Your " + amount + " Dollar is : " + df.format(chineseyen) + " Chinese Yen");
            japaneseyen = amount * 109.635;
            System.out.println("Your " + amount + " Dollar is : " + df.format(japaneseyen) + " Japanes Yen");
            norwegiankorune = amount * 9.0074;
            System.out.println("Your " + amount + " Dollar is : " + df.format(norwegiankorune) + " Norwegian Korune");
            czechkorune = amount * 22.96;
            System.out.println("Your " + amount + " Dollar is : " + df.format(czechkorune) + " Czech Korune");
            manat = amount * 1.70;
            System.out.println("Your " + amount + " Dollar is : " + df.format(manat) + " Manat");
        }
        if (code == 3) {
            //GBPound to other
            dollar = amount * 1.3327;
            System.out.println("Your " + amount + " GB Pound is : " + df.format(dollar) + " Dollar ");
            euro = amount * 1.1962;
            System.out.println("Your " + amount + " GB Pound is : " + df.format(euro) + " Euro ");
            rusruble = amount * 83.974;
            System.out.println("Your " + amount + " GB Pound is : " + df.format(rusruble) + " Russian Ruble ");
            swedishkrone = amount * 12.552;
            System.out.println("Your " + amount + " GB Pound is : " + df.format(swedishkrone) + " Swedish Krone ");
            danishkrone = amount * 8.984;
            System.out.println("Your " + amount + " GB Pound is : " + df.format(danishkrone) + " Danish Krone ");
            bulgarianlev = amount * 2.3405;
            System.out.println("Your " + amount + " GB Pound is : " + df.format(bulgarianlev) + " Bulgarian Lev ");
            canadiandollar = amount * 1.7522;
            System.out.println("Your " + amount + " GB Pound is : " + df.format(canadiandollar) + " Canadian Dollar ");
            chineseyen = amount * 9.3689;
            System.out.println("Your " + amount + " GB Pound is : " + df.format(chineseyen) + " Chinese Yen ");
            japaneseyen = amount * 146.12;
            System.out.println("Your " + amount + " GB Pound is : " + df.format(japaneseyen) + " Japanes Yen ");
            norwegiankorune = amount * 12.0018;
            System.out.println("Your " + amount + " GB Pound is : " + df.format(norwegiankorune) + " Norwegian Korune");
            czechkorune = amount * 30.4326;
            System.out.println("Your " + amount + " GB Pound is : " + df.format(czechkorune) + " Czech Korune");
            manat = amount * 2.2757;
            System.out.println("Your " + amount + " GB Pound is : " + df.format(manat) + " Manat");

        }
        if (code == 4) {
            //100 RusRuble to other
            dollar = (amount * 1.6038) / 100;
            System.out.println("Your " + amount + " Russian Ruble is : " + df.format(dollar) + " Dollar");
            euro = (amount * 1.4321) / 100;
            System.out.println("Your " + amount + " Russian Ruble is : " + df.format(euro) + " Euro");
            gbpound = (amount * 1.1908) / 100;
            System.out.println("Your " + amount + " Russian Ruble is : " + df.format(gbpound) + " GB Pound");
            swedishkrone = (amount * 14.947) / 100;
            System.out.println("Your " + amount + " Russian Ruble is : " + df.format(swedishkrone) + " Swedish Krone");
            danishkrone = (amount * 10.698) / 100;
            System.out.println("Your " + amount + " Russian Ruble is : " + df.format(danishkrone) + " Danish Krone");
            bulgarianlev = (amount * 2.8007) / 100;
            System.out.println("Your " + amount + " Russian Ruble is : " + df.format(bulgarianlev) + " Bulgarian Lev");
            canadiandollar = (amount * 2.0998) / 100;
            System.out.println("Your " + amount + " Russian Ruble is : " + df.format(canadiandollar) + " Canadian Dollar");
            chineseyen = (amount * 11.1569) / 100;
            System.out.println("Your " + amount + " Russian Ruble is : " + df.format(chineseyen) + " Chinese Yen");
            japaneseyen = (amount * 174.38) / 100;
            System.out.println("Your " + amount + " Russian Ruble is : " + df.format(japaneseyen) + " Japanes Yen");
            norwegiankorune = (amount * 14.3843) / 100;
            System.out.println("Your " + amount + " Russian Ruble is : " + df.format(norwegiankorune) + " Norwegian Korune");
            czechkorune = (amount * 36.4738) / 100;
            System.out.println("Your " + amount + " Russian Ruble is : " + df.format(czechkorune) + " Czech Korune");
            manat = (amount * 2.71) / 100;
            System.out.println("Your " + amount + " Russian Ruble is : " + df.format(manat) + " Manat");
        }
        if (code == 5) {
            //SwedishKrone to other
            dollar = amount * 0.1068;
            System.out.println("Your " + amount + " Swedish Krone is : " + df.format(dollar) + " Dollar");
            euro = amount * 0.0959;
            System.out.println("Your " + amount + " Swedish Krone is : " + df.format(euro) + " Euro");
            gbpound = amount * 0.0797;
            System.out.println("Your " + amount + " Swedish Krone is : " + df.format(gbpound) + " GB Pound");
            rusruble = amount * 6.69;
            System.out.println("Your " + amount + " Swedish Krone is : " + df.format(rusruble) + " Russian Ruble");
            danishkrone = amount * 0.7158;
            System.out.println("Your " + amount + " Swedish Krone is : " + df.format(danishkrone) + " Danish Krone");
            bulgarianlev = amount * 0.1875;
            System.out.println("Your " + amount + " Swedish Krone is : " + df.format(bulgarianlev) + " Bulgarian Lev");
            canadiandollar = amount * 0.1405;
            System.out.println("Your " + amount + " Swedish Krone is : " + df.format(canadiandollar) + " Canadian Dollar");
            chineseyen = amount * 0.7464;
            System.out.println("Your " + amount + " Swedish Krone is : " + df.format(chineseyen) + " Chinese Yen");
            japaneseyen = amount * 11.665;
            System.out.println("Your " + amount + " Swedish Krone is : " + df.format(japaneseyen) + " Japanes Yen");
            norwegiankorune = amount * 0.9623;
            System.out.println("Your " + amount + " Swedish Korune is : " + df.format(norwegiankorune) + " Norwegian Korune");
            czechkorune = amount * 2.4401;
            System.out.println("Your " + amount + " Swedish Korune is : " + df.format(czechkorune) + " Czech Korune");
            manat = amount * 0.1813;
            System.out.println("Your " + amount + " Swedish Korune is : " + df.format(manat) + " Manat");
        }
        if (code == 6) {
            //Danish Krone to other
            dollar = amount * 0.1492;
            System.out.println("Your " + amount + " Danish Krone is : " + df.format(dollar) + " Dollar ");
            euro = amount * 0.1338;
            System.out.println("Your " + amount + " Danish Krone is : " + df.format(euro) + " Euro ");
            gbpound = amount * 0.1113;
            System.out.println("Your " + amount + " Danish Krone is : " + df.format(gbpound) + " GB Pound ");
            rusruble = amount * 9.3469;
            System.out.println("Your " + amount + " Danish Krone is : " + df.format(rusruble) + " Russian Ruble ");
            swedishkrone = amount * 1.3971;
            System.out.println("Your " + amount + " Danish Krone is : " + df.format(swedishkrone) + " Swedish Krone ");
            bulgarianlev = amount * 0.2617;
            System.out.println("Your " + amount + " Danish Krone is : " + df.format(bulgarianlev) + " Bulgarian Lev ");
            canadiandollar = amount * 0.1963;
            System.out.println("Your " + amount + " Danish Krone is : " + df.format(canadiandollar) + " Canadian Dollar ");
            chineseyen = amount * 1.0428;
            System.out.println("Your " + amount + " Danish Krone is : " + df.format(chineseyen) + " Chinese Yen ");
            japaneseyen = amount * 16.2989;
            System.out.println("Your " + amount + " Danish Krone is : " + df.format(japaneseyen) + " Japanese Yen ");
            norwegiankorune = amount * 1.3445;
            System.out.println("Your " + amount + " Danish Krone is : " + df.format(norwegiankorune) + " Norwegian Korune ");
            czechkorune = amount * 3.4092;
            System.out.println("Your " + amount + " Danish Korune is : " + df.format(czechkorune) + " Czech Korune");
            manat = amount * 0.2533;
            System.out.println("Your " + amount + " Danish Korune is : " + df.format(manat) + " Manat");
        }
        if (code == 7) {
            //Bulgarian Lev to other
            dollar = amount * 0.5699;
            System.out.println("Your " + amount + " Bulgarian Lev is : " + df.format(dollar) + " Dollar");
            euro = amount * 0.5113;
            System.out.println("Your " + amount + " Bulgarian Lev is : " + df.format(euro) + " Euro");
            gbpound = amount * 0.4273;
            System.out.println("Your " + amount + " Bulgarian Lev is : " + df.format(gbpound) + " GB Pound");
            rusruble = amount * 35.8822;
            System.out.println("Your " + amount + " Bulgarian Lev is : " + df.format(rusruble) + " Russian Ruble");
            swedishkrone = amount * 5.3635;
            System.out.println("Your " + amount + " Bulgarian Lev is : " + df.format(swedishkrone) + " Swedish Krone");
            danishkrone = amount * 3.8389;
            System.out.println("Your " + amount + " Bulgarian Lev is : " + df.format(danishkrone) + " Danish Krone");
            canadiandollar = amount * 0.7524;
            System.out.println("Your " + amount + " Bulgarian Lev is : " + df.format(canadiandollar) + " Canadian Dollar");
            chineseyen = amount * 3.9977;
            System.out.println("Your " + amount + " Bulgarian Lev is : " + df.format(chineseyen) + " Chinese Yen");
            japaneseyen = amount * 62.4826;
            System.out.println("Your " + amount + " Bulgarian Lev is : " + df.format(japaneseyen) + " Japanese Yen");
            norwegiankorune = amount * 5.1542;
            System.out.println("Your " + amount + " Bulgarian Lev is : " + df.format(norwegiankorune) + " Norwegian Korune");
            czechkorune = amount * 13.0693;
            System.out.println("Your " + amount + " Bulgarian Lev is : " + df.format(czechkorune) + " Czech Korune");
            manat = amount * 0.971;
            System.out.println("Your " + amount + " Bulgarian Lev is : " + df.format(manat) + " Manat");
        }
        if (code == 8) {
            //Canadian Dollar to other
            dollar = amount * 0.7607;
            System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(dollar) + " Dollar");
            euro = amount * 0.6827;
            System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(euro) + " Euro");
            gbpound = amount * 0.5709;
            System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(gbpound) + " GB Pound");
            rusruble = amount * 47.623;
            System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(rusruble) + " Russian Ruble");
            swedishkrone = amount * 7.1186;
            System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(swedishkrone) + " Swedish Krone");
            danishkrone = amount * 5.0951;
            System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(danishkrone) + " Danish Krone");
            bulgarianlev = amount * 1.3353;
            System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(bulgarianlev) + " Bulgarian Lev");
            chineseyen = amount * 5.3133;
            System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(chineseyen) + " Chinese Yen");
            japaneseyen = amount * 83.354;
            System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(japaneseyen) + " Japanese Yen");
            norwegiankorune = amount * 6.8503;
            System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(norwegiankorune) + " Norwegian Korune");
            czechkorune = amount * 17.3701;
            System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(czechkorune) + " Czech Korune");
            manat = amount * 1.2906;
            System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(manat) + " Manat");
        }
        if (code == 9) {
            //Chinese Yen to other
            dollar = amount * 0.1429;
            System.out.println("Your " + amount + " ChineseYen is : " + df.format(dollar) + " Dollar");
            euro = amount * 0.1282;
            System.out.println("Your " + amount + " Chinese Yen is : " + df.format(euro) + " Euro");
            gbpound = amount * 0.1067;
            System.out.println("Your " + amount + " Chinese Yen is : " + df.format(gbpound) + " GB Pound");
            rusruble = amount * 8.9631;
            System.out.println("Your " + amount + " Chinese Yen is : " + df.format(rusruble) + " Russian Ruble");
            swedishkrone = amount * 1.3398;
            System.out.println("Your " + amount + " Chinese Yen is : " + df.format(swedishkrone) + " Swedish Krone");
            danishkrone = amount * 0.9589;
            System.out.println("Your " + amount + " Chinese Yen is : " + df.format(danishkrone) + " Danish Krone");
            bulgarianlev = amount * 0.2507;
            System.out.println("Your " + amount + " Chinese Yen is : " + df.format(bulgarianlev) + " Bulgarian Lev");
            canadiandollar = amount * 0.1882;
            System.out.println("Your " + amount + " Chinese Yen is : " + df.format(canadiandollar) + " Canadian Dollar");
            japaneseyen = amount * 15.629;
            System.out.println("Your " + amount + " Chinese Yen is : " + df.format(japaneseyen) + " Japanese Yen");
            norwegiankorune = amount * 1.2893;
            System.out.println("Your " + amount + " Chinese Yen is : " + df.format(norwegiankorune) + " Norwegian Korune");
            czechkorune = amount * 3.2692;
            System.out.println("Your " + amount + " Chinese Yen is : " + df.format(czechkorune) + " Czech Korune");
            manat = amount * 0.2429;
            System.out.println("Your " + amount + " Chinese Yen is : " + df.format(manat) + " Manat");
        }
        if (code == 10) {
            //100 JapaneseYen to other
            dollar = (amount * 0.9122) / 100;
            System.out.println("Your " + amount + " Japanese Yen is : " + df.format(dollar) + " Dollar");
            euro = (amount * 0.8187) / 100;
            System.out.println("Your " + amount + " Japanese Yen is : " + df.format(euro) + " Euro");
            gbpound = (amount * 0.6845) / 100;
            System.out.println("Your " + amount + " Japanese Yen is : " + df.format(gbpound) + " GB Pound");
            rusruble = (amount * 57.347) / 100;
            System.out.println("Your " + amount + " Japanese Yen is : " + df.format(rusruble) + " Russian Ruble");
            swedishkrone = (amount * 8.572) / 100;
            System.out.println("Your " + amount + " Japanese Yen is : " + df.format(swedishkrone) + " Swedish Krone");
            danishkrone = (amount * 6.1354) / 100;
            System.out.println("Your " + amount + " Japanese Yen is : " + df.format(danishkrone) + " Danish Krone");
            bulgarianlev = (amount * 1.6015) / 100;
            System.out.println("Your " + amount + " Japanese Yen is : " + df.format(bulgarianlev) + " Bulgarian Lev");
            canadiandollar = (amount * 1.1997) / 100;
            System.out.println("Your " + amount + " Japanese Yen is : " + df.format(canadiandollar) + " Canadian Dollar");
            chineseyen = (amount * 6.3881) / 100;
            System.out.println("Your " + amount + " Japanese Yen is : " + df.format(chineseyen) + " Chinese Yen");
            norwegiankorune = (amount * 8.2489) / 100;
            System.out.println("Your " + amount + " Japanese Yen is : " + df.format(norwegiankorune) + " Norwegian Korune");
            czechkorune = (amount * 20.9165) / 100;
            System.out.println("Your " + amount + " Japanese Yen is : " + df.format(czechkorune) + " Czech Korune");
            manat = (amount * 1.5541) / 100;
            System.out.println("Your " + amount + " Japanese Yen is : " + df.format(manat) + " Manat");
        }
        if (code == 11) {
            //Norwegian Korune to other
            dollar = amount * 0.111;
            System.out.println("Your " + amount + " Norwegian Korune is : " + df.format(dollar) + " Dollar");
            euro = amount * 0.0996;
            System.out.println("Your " + amount + " Norwegian Korune is : " + df.format(euro) + " Euro");
            gbpound = amount * 0.0833;
            System.out.println("Your " + amount + " Norwegian Korune is : " + df.format(gbpound) + " GB Pound");
            rusruble = amount * 6.9936;
            System.out.println("Your " + amount + " Norwegian Korune is : " + df.format(rusruble) + " Russian Ruble");
            swedishkrone = amount * 1.0454;
            System.out.println("Your " + amount + " Norwegian Korune is : " + df.format(swedishkrone) + " Swedish Krone");
            danishkrone = amount * 0.7482;
            System.out.println("Your " + amount + " Norwegian Korune is : " + df.format(danishkrone) + " Danish Krone");
            bulgarianlev = amount * 0.1958;
            System.out.println("Your " + amount + " Norwegian Korune is : " + df.format(bulgarianlev) + " Bulgarian Lev");
            canadiandollar = amount * 0.1466;
            System.out.println("Your " + amount + " Norwegian Korune is : " + df.format(canadiandollar) + " Canadian Dollar");
            chineseyen = amount * 0.7789;
            System.out.println("Your " + amount + " Norwegian Korune is : " + df.format(chineseyen) + " Chinese Yen");
            japaneseyen = amount * 12.1739;
            System.out.println("Your " + amount + " Norwegian Korune is : " + df.format(japaneseyen) + " Japanesw Yen");
            czechkorune = amount * 2.5464;
            System.out.println("Your " + amount + " Norwegian Korune is : " + df.format(czechkorune) + " Czech Korune");
            manat = amount * 0.1892;
            System.out.println("Your " + amount + " Norwegian Korune is : " + df.format(manat) + " Manat");
        }
        if (code == 12) {
            //Czech Korune to other
            dollar = amount * 0.0437;
            System.out.println("Your " + amount + " Czech Korune is : " + df.format(dollar) + " Dollar");
            euro = amount * 0.0392;
            System.out.println("Your " + amount + " Czech Korune is : " + df.format(euro) + " Euro");
            gbpound = amount * 0.0328;
            System.out.println("Your " + amount + " Czech Korune is : " + df.format(gbpound) + " GB Pound");
            rusruble = amount * 2.7544;
            System.out.println("Your " + amount + " Czech Korune is : " + df.format(rusruble) + " Russian Ruble");
            swedishkrone = amount * 0.4117;
            System.out.println("Your " + amount + " Czech Korune is : " + df.format(swedishkrone) + " Swedish Krone");
            danishkrone = amount * 0.2947;
            System.out.println("Your " + amount + " Czech Korune is : " + df.format(danishkrone) + " Danish Krone");
            bulgarianlev = amount * 0.0771;
            System.out.println("Your " + amount + " Czech Korune is : " + df.format(bulgarianlev) + " Bulgarian Lev");
            canadiandollar = amount * 0.0577;
            System.out.println("Your " + amount + " Czech Korune is : " + df.format(canadiandollar) + " Canadian Dollar");
            chineseyen = amount * 0.3066;
            System.out.println("Your " + amount + " Czech Korune is : " + df.format(chineseyen) + " Chinese Yen");
            japaneseyen = amount * 4.792;
            System.out.println("Your " + amount + " Czech Korune is : " + df.format(japaneseyen) + " Japanese Yen");
            norwegiankorune = amount * 0.3953;
            System.out.println("Your " + amount + " Czech Korune is : " + df.format(norwegiankorune) + " Norwegian Korune");
            manat = amount * 0.0745;
            System.out.println("Your " + amount + " Czech Korune is : " + df.format(manat) + " Manat");

        }
        if (code == 13) {
            //Manat to other
            dollar = amount * 0.5882;
            System.out.println("Your " + amount + " Manat is : " + df.format(dollar) + " Dollar");
            euro = amount * 0.5277;
            System.out.println("Your " + amount + " Manat is : " + df.format(euro) + " Euro");
            gbpound = amount * 0.4411;
            System.out.println("Your " + amount + " Manat is : " + df.format(gbpound) + " GB Pound");
            rusruble = amount * 37.041;
            System.out.println("Your " + amount + " Manat is : " + df.format(rusruble) + " Russian Ruble");
            swedishkrone = amount * 5.5367;
            System.out.println("Your " + amount + " Manat is : " + df.format(swedishkrone) + " Swedish Krone");
            danishkrone = amount * 3.9629;
            System.out.println("Your " + amount + " Manat is : " + df.format(danishkrone) + " Danish Krone");
            bulgarianlev = amount * 1.0371;
            System.out.println("Your " + amount + " Manat is : " + df.format(bulgarianlev) + " Bulgarian Lev");
            canadiandollar = amount * 0.7767;
            System.out.println("Your " + amount + " Manat is : " + df.format(canadiandollar) + " Canadian Dollar");
            chineseyen = amount * 4.1268;
            System.out.println("Your " + amount + " Manat is : " + df.format(chineseyen) + " Chinese Yen");
            japaneseyen = amount * 64.5003;
            System.out.println("Your " + amount + " Manat is : " + df.format(japaneseyen) + " Japanese Yen");
            norwegiankorune = amount * 5.3206;
            System.out.println("Your " + amount + " Manat is : " + df.format(norwegiankorune) + " Norwegian Korune");
            czechkorune = amount * 13.4913;
            System.out.println("Your " + amount + " Manat is : " + df.format(czechkorune) + " Czech Korune");
        }

    }
}
