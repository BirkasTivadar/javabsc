package methodparam.sums;

/*
Gyakorlati feladat - Pozitív-negatív
        A floatingnumbers.txt fájlba másold bele a következőket:

        12,8;25,7;-84,9;72,1;-52,8;-15,6

        Írj a sums.SeparatedSum osztályba egy sum(String floatingNumbers) metódust, mely kap egy String-et, melyben lebegőpontos számok szerepelnek pontosvesszővel elválasztva! A számoknál vessző a tizedeselválasztó. A metódus ezt szedje szét, cserélje ki megfelelő karakterre a tizedeselválasztót, és adja össze külön a pozitív és külön a negatív számokat! A metódus visszatérési értékének tartalmaznia kell egyszerre mind a pozitív, mind a negatív számok összegét!
*/

public record Sums(double sumPositives, double sumNegatives) {
}
