package introjunit;


//Gyakorlati feladat - Első teszt implementálása
//        A pom.xml állományba vedd fel függőségként a JUnit keretrendszert test scope-pal!
//<dependencies>
//<dependency>
//<groupId>junit</groupId>
//<artifactId>junit</artifactId>
//<version>4.12</version>
//<scope>test</scope>
//</dependency>
//</dependencies
//        Hozz létre egy introjunit.Gentleman osztályt, melyben van egy public String sayHello(String name) metódus, mely visszaad egy Stringet, mely egy üdvözlő szöveg (Hello), hozzáfűzve a paraméterként átadott név!
//        Majd hozz létre egy introjunit.GentlemanTest osztályt a teszt ágon, mely azt ellenőrzi, hogy John Doe nevet átadva a visszaadott szöveg valóban Hello John Doe!

public class Gentleman {

    public String sayHello(String name) {
        if (name == null) {
            return "Hello Anonymus";
        }
        return "Hello " + name;
    }

}
