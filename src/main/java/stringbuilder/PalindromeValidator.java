package stringbuilder;

//Gyakorlati feladat - Palindróma
//        Készítsünk egy PalindromeValidator osztályt, amelynek metódusa egy szóról, szövegrészletről el tudja dönteni, hogy az palindróm (visszafelé is ugyanaz).
//        Publikus metódus:
//public boolean isPalindrome(String word)
//        Tipp:
//        Eltérő case-t (kisbetű, nagybetű) ne vegye figyelembe!

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        word = word.trim();
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();

        System.out.println(palindromeValidator.isPalindrome("Racecar"));
        System.out.println(palindromeValidator.isPalindrome("start"));
        System.out.println(palindromeValidator.isPalindrome(""));
        System.out.println(palindromeValidator.isPalindrome("\n\t"));
    }
}
