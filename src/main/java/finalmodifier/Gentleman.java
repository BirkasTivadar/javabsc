package finalmodifier;

//Gyakorlati feladat - Köszönj!
//        Definiálj egy finalmodifier.Gentleman osztályt, melyben definiáld kvázi konstansként a MESSAGE_PREFIX változót, mely a köszönés elejét tartalmazza! Írj egy String sayHello(String name) metódust, mely a MESSAGE_PREFIX értékét összefűzi a name paraméter értékével és az eredményt visszaadja!

public class Gentleman {

    public static final String MESSAGE_PREFIX = "Hello ";

    public String sayHello(String name) {
        return MESSAGE_PREFIX + name + " ";
    }

    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman();

        System.out.println(gentleman.sayHello("Mr. Brown"));
    }
}
