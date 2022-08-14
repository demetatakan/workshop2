package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try
        {
            String title, summary, city, county, fromOwner, gearType, postType,
                    color, isDamaged, roomCount, area, floor, inSite, bathroomCount;

            title = getInput("İlan başlığı : ");
            summary = getInput("İlan açıklaması :");
            fromOwner = getInput("Sahibinden mi ? :");
            city = getInput("Şehir :");
            county = getInput("İlçe :");
            postType = getInput("Ilan tipi EMLAK içim 'e' VASITA için 'v' giriniz :").toLowerCase();

            while(!(postType.equals("e") || postType.equals("v"))){
                postType = getInput("Ilan tipini hatalı girdiniz, tekrar deneyiniz :");
            }

            if(postType.equals("v")) {
                // VASITA

                gearType = getInput("Vites tipi :");
                color = getInput("Arac rengi :");
                isDamaged = getInput("Araç hasarlı mı ?");

                Vasita vasita = new Vasita();

                vasita.setTitle(title);
                vasita.setSummary(summary);
                vasita.setFromOwner(fromOwner);
                vasita.setCity(city);
                vasita.setCounty(county);
                vasita.setGearType(gearType);
                vasita.setColor(color);
                vasita.setIsDamaged(isDamaged);

                display("İLAN BAŞLIĞI", vasita.getTitle());
                display("İLAN AÇIKLAMASI", vasita.getSummary());
                display("KİMDEN", vasita.getFromOwner());
                display("ŞEHİR", vasita.getCity());
                display("İLÇE", vasita.getCounty());
                display("VİTES TİPİ", vasita.getGearType());
                display("RENK", vasita.getColor());
                display("HASAR DURUMU", vasita.getIsDamaged());
            } else {


                roomCount = getInput("Oda sayısı :");
                area = getInput("Dairenin alanını giriniz :");
                floor = getInput("Kat bilgisi giriniz :");
                inSite = getInput("Site içinde mi?");
                bathroomCount = getInput("Banyo sayısı giriniz : ");


                Emlak emlak = new Emlak();

                emlak.setTitle(title);
                emlak.setSummary(summary);
                emlak.setFromOwner(fromOwner);
                emlak.setCity(city);
                emlak.setCounty(county);
                emlak.setRoomCount(roomCount);
                emlak.setArea(area);
                emlak.setFloor(floor);
                emlak.setInSite(inSite);
                emlak.setBathroomCount(bathroomCount);

                display("İLAN BAŞLIĞI", emlak.getTitle());
                display("İLAN AÇIKLAMASI", emlak.getSummary());
                display("KİMDEN", emlak.getFromOwner());
                display("ŞEHİR", emlak.getCity());
                display("İLÇE", emlak.getCounty());
                display("ODA SAYISI", emlak.getRoomCount());
                display("ALANI", emlak.getArea());
                display("KAÇINCI KAT", emlak.getFloor());
                display("SİTE İÇİNDE Mİ",emlak.getInSite());
                display("BANYO SAYISI", emlak.getBathroomCount());




            }
        }
        catch (Exception e){
            System.out.println("Yanlıs veri! " + e);
        }



    }

    static String getInput(String displayMessage){
        // This method allows us to get input from the user and returns it
        System.out.println(displayMessage);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    static void display(String desc, String msg){
        // Displays message by using a single name rather than using System.out.printLn
        System.out.println(desc + ": " + msg);
    }
}
