package algorithmstransformation.family;

/*
Gyakorlati feladat - Családtagok
        Legyen egy family.FamilyMember nevű osztály név és életkor attribútumokkal, konstruktorral és getterekkel! Majd legyen egy Family osztály, amelynek van egy családtagokat tartalmazó listája! Ezt a konstruktorban példányosítsd le! Legyen hozzá getter és addFamilyMember(FamilyMember) metódus is! Majd készíts egy olyan metódust (a nevét megtalálod a tesztben), amelynek megadhatunk egy keresztnevet, és visszaad egy listát azon családtagok életkori adatairól, akiknek ez a(z egyik) keresztnevük!
*/

public record FamilyMember(String name, int age) {
}
