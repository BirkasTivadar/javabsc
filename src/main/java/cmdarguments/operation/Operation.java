package cmdarguments.operation;

//Gyakorlati feladat - Feltételes kiírás
//        A cmdarguments.operation.Operation osztály main metódusa parancssori paraméterként bármilyen szavakat kaphat, a számuk sincsen meghatározva. Írd meg úgy a metódust, hogy menjen végig az átadott szavakon, és ha:
//        a szó /list, írja ki azt a konzolra, hogy Listázás
//        a szó /add, írja ki azt a konzolra, hogy Hozzáadás
//        a szó /delete, írja ki azt a konzolra, hogy Törlés
//        egyéb szavak esetén írja ki azt a konzolra, hogy Ismeretlen művelet
//        A konzolra történő kiírások szavanként külön sorokba történjenek!

public class Operation {

    public static void main(String[] args) {

        for (String word : args) {
            if ("list".equals(word)) {
                System.out.println("Listázás");
            } else if ("add".equals(word)) {
                System.out.println("Hozzáadás");
            } else if ("delete".equals(word)) {
                System.out.println("Törlés");
            } else {
                System.out.println("Ismeretlen művelet");
            }
        }
    }
}
