package controlselection.greetings;

//Gyakorlati feladatok
//        Gyakorlati feladat - Napszaktól függő köszönés
//        Írj egy metódust, mely paraméterként megkapja az órát és a percet, és amennyiben 5:00 után van, köszönjön “jó reggelt”-tel, 9:00 és 18:30 között “jó napot”-tal, 20:00-ig “jó estét”-tel, majd “jó éjt”-tel.
//        A controlselection.greetings.Greetings osztályba dolgozz!

public class Greetings {

    public void greetingByTime(int hour, int minute) {
        int timeInMinutes = hour * 60 + minute;
        if (timeInMinutes <= 300) {
            System.out.println("Jó éjt");
        } else if (timeInMinutes <= 540) {
            System.out.println("Jó reggelt");
        } else if (timeInMinutes <= 1110) {
            System.out.println("Jó napot");
        } else if (timeInMinutes <= 1200) {
            System.out.println("Jó estét");
        } else {
            System.out.println("Jó éjt");
        }
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        greetings.greetingByTime(4, 30);
        greetings.greetingByTime(6, 25);
        greetings.greetingByTime(14, 38);
        greetings.greetingByTime(18, 35);
        greetings.greetingByTime(23, 30);
    }
}
