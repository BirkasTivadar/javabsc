/*
Ezután a TeaMain osztály main() metódusában példányosítsd először a Tea, majd a HerbalTea osztályt, és írd ki a konzolra az attribútumaik értékét!
*/

package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {
        Tea tea = new Tea("Green Tea", 156);
        System.out.println(tea);

        HerbalTea herbalTea = new HerbalTea("Herbal Tea", 250);
        System.out.println(herbalTea);
    }
}
