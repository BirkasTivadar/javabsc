package introexceptionthrow;

/*
Gyakorlati feladat - Felnőtt tartalom
        Az Adult osztályban legyen két attribútum, String name és int age! Legyenek hozzájuk getterek, valamint hozz létre egy olyan konstruktort, amely kivételt dob, ha az illető életkora 18 év alatti! Teszteld az AdultContent osztályban!
*/

public class Adult {

    private String name;
    private int age;

    public Adult(String name, int age) {
        if(age<18){
            throw new IllegalArgumentException("Túl fiatal");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
