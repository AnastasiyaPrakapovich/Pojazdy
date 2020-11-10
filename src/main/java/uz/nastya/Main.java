package uz.nastya;

import java.io.Serializable;
import java.util.Scanner;
import org.apache.log4j.Logger;

class Pojazd {

    public String model;
    public Integer speed;

    public Pojazd(String model,  Integer speed) {
        this.model = model;
        this.speed = speed;
    }
}
public class Main {

    final static Logger logger = Logger.getLogger(Pojazd.class);

    Pojazd car = new Pojazd("BMW",372);
    Pojazd car2 = new Pojazd("Lexus",320);

    Pojazd ship = new Pojazd("Tanker",135);
    Pojazd ship2 = new Pojazd("Titanic",150);

    Pojazd plane = new Pojazd("Airbus A320",853);
    Pojazd plane2 = new Pojazd("Boeing-737",793);

    Pojazd bicycle = new Pojazd("BMX",15);
    Pojazd bicycle2 = new Pojazd("GT",17);

    public Serializable carSpeeds(){
        if (car.speed>car2.speed){
            return (car.model+ " jest najszybszy "+ ", predkosc - " + car.speed);
        }
        else
            return (car2.model+ " jest najszybszy "+ ", predkosc - " + car2.speed);
    }
    public Serializable shipSpeeds(){
        if (ship.speed>ship2.speed){
            return (ship.model+ " jest najszybszy "+ ", predkosc - " + ship.speed );
        }
        else
            return (ship2.model+ " jest najszybszy "+ ", predkosc - " + ship2.speed);
    }
    public Serializable planeSpeeds(){
        if (plane.speed>plane2.speed){
            return (plane.model+ " jest najszybszy "+ ", predkosc - " + plane.speed);
        }
        else
            return (plane2.model+ " jest najszybszy "+ ", predkosc - " + plane2.speed);
    }
    public Serializable bicycleSpeeds(){
        if (bicycle.speed>bicycle2.speed){
            return (bicycle.model+ " jest najszybszy "+ ", predkosc - " + bicycle.speed);
        }
        else
            return (bicycle2.model+ " jest najszybszy "+ ", predkosc - " + bicycle2.speed);
    }
    private static void menuShow(){
        logger.info(" Start Aplikacji");
        System.out.println("\n Opcje.\n 1.CAR \n 2.SHIP \n 3.PLANE \n 4.BICYCLE\n 5.ALL\n 6.EXIT");
    }

    private static void menu() {
        try {
        menuShow();
        Main m =new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String input = sc.nextLine();
        int sw = Integer.parseInt(input);
        switch (sw) {
            case 1:
                System.out.print("Pojazd CAR producenta " + m.carSpeeds()+"km"+ "\n");
                menu();
                break;
            case 2:
                System.out.print("Pojazd SHIP producenta " + m.shipSpeeds()+"km"+ "\n");
                menu();
                break;
            case 3:
                System.out.print("Pojazd PLANE producenta " + m.planeSpeeds()+"km"+ "\n");
                menu();
                break;
            case 4:
                System.out.print("Pojazd BICYCLE producenta " + m.bicycleSpeeds()+"km"+ "\n");
                menu();
                break;
            case 5:
                System.out.print("Pojazd CAR producenta " + m.carSpeeds()+"km \n");
                System.out.print("Pojazd SHIP producenta " + m.shipSpeeds()+"km \n");
                System.out.print("Pojazd PLANE producenta " + m.planeSpeeds()+"km \n");
                System.out.print("Pojazd BICYCLE producenta " + m.bicycleSpeeds()+"km \n");
                menu();
                break;
            case 6:
                System.out.println("See you soon!\n");
                logger.info(" Zamkniecie aplikacji");
                System.exit(1);
                break;
            default:
                System.out.print("Podaj prawodłową opcię");
                menu();
                break;
        }
    }
        catch (Exception e) {
            logger.error("Blad podczas otwierania menushow()");
        }
    }
    public static void main(String[] args) {
        try {
            menu();
        }
       catch (Exception e){
           logger.error("Blad podczas otwierania menu()");
       }
    }
}

