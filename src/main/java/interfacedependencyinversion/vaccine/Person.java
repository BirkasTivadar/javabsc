/*
Person osztály: String name, int age, ChronicDisease chronic és Pregnancy pregnant attribútumokkal. Az osztály konstruktora állítsa be ezek értékét.
*/

package interfacedependencyinversion.vaccine;

public record Person(String name, int age, ChronicDisease chronic, Pregnancy pregnant) {

}
