package algorithmscount.bankaccount;

/*
Gyakorlati feladat - Nagy összegű bankszámlák
        Hozz létre egy bankaccount.BankAccount osztályt a szükséges attribútumokkal:

        nameOfOwner, a számla tulajdonosának neve
        accountNumber, a számlaszám
        balance, egyenleg
        Feladat egy metódus megírása a BankAccountConditionCounter osztályban, ami megszámlálja, hány olyan számla van, amelynek az aktuális egyenlege meghaladja a paraméterként kapott alsó határt. A metódus nevét megtudhatod a tesztesetből.
*/

public record BankAccount(String nameOfOwner, String accountNumber, int balance) {
}
