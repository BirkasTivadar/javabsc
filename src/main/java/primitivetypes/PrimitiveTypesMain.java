package primitivetypes;


import objects.Book;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

//        Gyakorlati feladat - Egész számok
//        Egész szám típusú változók létrehozása lesz a feladat, próbáld meg követni közben, hogy hol történik a típusnak megfelelő értékadás, hol történik autoboxing és hol autounboxing!
//        Minden létrehozott változó értékét írasd is ki a konzolra!

//      a változó: a típusa legyen int, az értéke 2!
        int a = 2;
        System.out.println(a);

//      b változó: a típusa legyen Integer, az értéke 2!
        Integer b = 2;
        System.out.println(b);

//      c változó: a típusa legyen Integer, az értéke legyen az a változó értéke!
        Integer c = a;  //Autoboxing
        System.out.println(c);

//      d változó: a típusa legyen Integer, az értéke legyen a b változó értéke!
        Integer d = b;
        System.out.println(d);

//      e változó: a típusa legyen Integer, az értékét úgy add meg, hogy az Integer osztály megfelelő metódusával hozz létre egy új Integer objektumot a 2-es számból!
        Integer e = Integer.valueOf(2);
        System.out.println(e);

//      f változó: a típusa legyen int, az értékét úgy add meg, hogy az Integer osztály megfelelő metódusával hozz létre egy új Integer objektumot a 2-es számból!
        int f = Integer.valueOf(2); //Autounboxing
        System.out.println(f);

//      g változó: a típusa legyen int, az értékét úgy add meg, hogy az Integer osztály megfelelő metódusával hozz létre egy új Integer objektumot az a változó értékéből!
        int g = Integer.valueOf(a); //Autounboxing
        System.out.println(g);

//      h változó: a típusa legyen int, az értékét úgy add meg, hogy az Integer osztály megfelelő metódusával hozz létre egy új Integer objektumot a c változó értékéből!
        int h = Integer.valueOf(c); //Autounboxing
        System.out.println(h);

//      i változó: a típusa legyen int, az értékét úgy add meg, hogy az Integer osztály megfelelő metódusával hozz létre egy új int típusú értéket a "2" szövegből!
        int i = Integer.parseInt("2");
        System.out.println(i);

//                j változó: a típusa legyen Integer, az értékét úgy add meg, hogy az Integer osztály megfelelő metódusával hozz létre egy új int típusú értéket a "2" szövegből!
        Integer j = Integer.parseInt("2"); //Autoboxing
        System.out.println(j);

//        Gyakorlati feladat - Logikai értékek
//        Logikai típusú változók létrehozása lesz a feladat, próbáld meg követni közben, hogy hol történik a típusnak megfelelő értékadás, hol történik autoboxing és hol autounboxing!
//        Minden létrehozott változó értékét írasd is ki a konzolra!

//      k változó: a típusa legyen boolean, az értéke true!
        boolean k = true;
        System.out.println(k);

//      l változó: a típusa legyen Boolean, az értéke true!
        Boolean l = true;
        System.out.println(l);

//      m változó: a típusa legyen boolean, az értékét úgy add meg, hogy a Boolean osztály megfelelő metódusával hozz létre egy új Boolean objektumot a true logikai literálból!
        boolean m = Boolean.valueOf(true); //Autounboxing
        System.out.println(m);

//      n változó: a típusa legyen Boolean, az értékét úgy add meg, hogy a Boolean osztály megfelelő metódusával hozz létre egy új Boolean objektumot a true logikai literálból!
        Boolean n = Boolean.valueOf(true);
        System.out.println(n);

//      o változó: a típusa legyen boolean, az értékét úgy add meg, hogy a Boolean osztály megfelelő metódusával hozz létre egy új boolean típusú értéket a "TrUe" szövegből!
        boolean o = Boolean.parseBoolean("TrUe");
        System.out.println(o);

//      p változó: a típusa legyen Boolean, az értékét úgy add meg, hogy a Boolean osztály megfelelő metódusával hozz létre egy új boolean típusú értéket a "TrUe" szövegből!
        Boolean p = Boolean.parseBoolean("TrUe"); //Autoboxing
        System.out.println(p);

//      q változó: a típusa legyen boolean, az értékét úgy add meg, hogy a Boolean osztály megfelelő metódusával hozz létre egy új boolean típusú értéket a "TreU" szövegből!
        boolean q = Boolean.parseBoolean("TreU");
        System.out.println(q);

//      r változó: a típusa legyen Boolean, az értékét úgy add meg, hogy a Boolean osztály megfelelő metódusával hozz létre egy új boolean típusú értéket a "TreU" szövegből!
        Boolean r = Boolean.parseBoolean("TreU"); //Autoboxing
        System.out.println(r);
    }
}
