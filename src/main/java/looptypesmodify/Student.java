package looptypesmodify;

//Gyakorlati feladat - Nyelviskola
//        Egy nyelviskola a mindenkori hallgatóit egy listában tárolja, amelyet időről időre felülvizsgálnak, és a már nem aktív hallgatókat törlik belőle.
//        Készíts egy Student osztályt, melynek két attribútuma van: String name és boolean active! Az osztályt úgy lehessen példányosítani, hogy a hallgatók aktív státusza alapértelmezetten true! Legyenek az osztálynak getter és setter metódusai!
//        Hozd létre a LanguageSchool osztályt, amelynek main() metódusában példányosíts egy List<Student> listát! Példányosíts néhány hallgatót is, és a listához add is hozzá az új hallgatókat! Ezután néhány hallgató esetében az aktív státuszt állítsd át false-ra, végül implementáld, hogy minden, nem aktív státuszú hallgatót törölsz a nyelviskola listájából! A lista méretét lekérve tudod ellenőrizni, hogy valóban a várt számú hallgató szerepel-e benne!

public class Student {

    private String name;

    private boolean active;

    public Student(String name) {
        this.name = name;
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
