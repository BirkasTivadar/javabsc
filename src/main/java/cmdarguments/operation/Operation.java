package cmdarguments.operation;

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
