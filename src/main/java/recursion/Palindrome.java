package recursion;

/*
Gyakorlati feladat - Palindroma
        A Palindrome osztályban írj egy isPalindrome(String word) metódust, amely eldönti egy szóról, hogy palindrom szó-e! Írd meg a feladatot rekurzióval! (A megoldás menete: Meg kell vizsgálni, hogy a szó első és utolsó betűje megegyezik-e, majd utána az ezen betűk közötti, “középső” szóra kell újra megvizsgálni ugyanazt. Ha már csak nulla vagy egy betű marad a szóból, akkor az már logikailag egyértelmű, hogy palindrom szó.)
*/

public class Palindrome {
    public boolean isPalindrome(String word) {
        if (word.length() <= 1) return true;
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            String newWord = word.substring(1, word.length() - 1);
            return isPalindrome(newWord);
        }
        return false;
    }
}
