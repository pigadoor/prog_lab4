import enums.Places;
import source.Shorty;
import source.Sleepwalkers;
import source.Telecast;
import source.Viewers;
import source.IllegalNameException;
import java.util.Scanner;

public class Main {
    public static class NameReader {
        private static String readName(Scanner in) throws IllegalNameException {
            System.out.println("Введите имя полицейского: ");
            String policeName = in.nextLine();
            if (policeName.equals("Незнайка") | policeName.equals("Знайка") | policeName.equals("Полицейский")) throw new IllegalNameException();
            else return(policeName);
        }

        public static String getPoliceName(Scanner in) {
            String policeName;
            try {
                policeName = NameReader.readName(in);
            }
            catch(IllegalNameException e) {
                System.out.println(e.getMessage());
                return(NameReader.getPoliceName(in));
            }
            return(policeName);
        }
    }

    public static void main(String[] args) {
        
        class LittleLocalClass {
            public void sayHello() {
                System.out.println("Привет...Я маленький локальный класс, всем ПРИВЕТ!");
            }
        }
        LittleLocalClass littleLocalClass = new LittleLocalClass();
        littleLocalClass.sayHello();

        Telecast telecast = new Telecast("передача");
        Viewers policemen = new Viewers("полицейский");
        Scanner in = new Scanner(System.in);
        String policeName = NameReader.getPoliceName(in);
        policemen.watch(telecast, policeName);

        Sleepwalkers lunatiki = new Sleepwalkers("лунатики");
        Places.listOfPlaces();
        lunatiki.planted(Places.NEELOVKA);
        lunatiki.planted(Places.GOLOPYATKINO);
        lunatiki.planted(Places.BESHLEBOVO);
        lunatiki.planted(Places.GOLODAEVKA);
        lunatiki.planted(Places.NEPROLAZNOE);

        Shorty znaika = new Shorty("Знайка");
        znaika.suplie(lunatiki, "семена растений");
    }
}