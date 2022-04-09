package controlselection.accents;

//Gyakorlati feladat - Ékezetek
//        Írj egy metódust, mely magyar ékezetes karakter esetén annak ékezet nélküli párját adja vissza! Ha a karakter nem ékezetes, akkor magát a karaktert adja vissza!
//        A controlselection.accents.WithoutAccents osztályba dolgozz!

public class WithoutAccents {

    public char convertToCharWithoutAccents(char c) {
        String withAccent = "aáeéiíoóöőuúüűAÁEÉIÍOÓÖŐUÚÜŰ";
        String withoutAccent = "aaeeiioooouuuuAAEEIIOOOOUUUU";
        int index = withAccent.indexOf(c);
        return index > -1 ? withoutAccent.charAt(index) : c;
    }
}
