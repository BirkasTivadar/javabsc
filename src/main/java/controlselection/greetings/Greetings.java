package controlselection.greetings;

//Gyakorlati feladatok
//        Gyakorlati feladat - Napszaktól függő köszönés
//        Írj egy metódust, mely paraméterként megkapja az órát és a percet, és amennyiben 5:00 után van, köszönjön “jó reggelt”-tel, 9:00 és 18:30 között “jó napot”-tal, 20:00-ig “jó estét”-tel, majd “jó éjt”-tel.
//        A controlselection.greetings.Greetings osztályba dolgozz!

public class Greetings {

    public String greet(int hour, int minute) {
        String result;
        int timeInMinutes = hour * 60 + minute;

        if (timeInMinutes <= 300) result = "jó éjt";
        else if (timeInMinutes <= 540) result = "jó reggelt";
        else if (timeInMinutes <= 1110) result = "jó napot";
        else if (timeInMinutes <= 1200) result = "jó estét";
        else result = "jó éjt";

        return result;
    }
}
