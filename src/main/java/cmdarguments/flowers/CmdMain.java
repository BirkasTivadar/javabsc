package cmdarguments.flowers;

//Gyakorlati feladat - Virágok
//        A cmdarguments.flowers.CmdMain osztály main() metódusának adj át parancssori paraméterként néhány virágnevet! A metódusban először írd ki a konzolra a parancssorban megadott paraméterek tömbjének hosszát, majd írd ki a tömb elemeit egymás után, külön sorokban a konzolra a következő formában:
//
//        1. elem: napraforgó
//        2. elem: ibolya
//        3. elem: rózsa
//        4. elem: harangvirág

public class CmdMain {

    public static void main(String[] args) {

        System.out.println(args.length);

        int i = 1;
        for (String flower : args) {
            System.out.println(i + ". elem: " + args[i - 1]);
            i++;
        }
    }
}
