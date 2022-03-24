package stringconcat.nameconcat;

import java.util.Locale;

public class Name {

    private final String SPACE = " ";
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public String concatNameWesternStyle() {
        String result = "";
        if (title != null) {
            result += title.getTitle();
            result += SPACE;
        }
        result += givenName;
        result += SPACE;
        if (!isEmpty(middleName)) {
            result += middleName;
            result += SPACE;
        }
        result += familyName;

        return result;
    }

    public String concatNameHungarianStyle() {
        String result = "";
        if (title != null) {
            result = result.concat(title.getTitle());
            result = result.concat(SPACE);
        }
        result = result.concat(familyName);
        result = result.concat(SPACE);
        if (!isEmpty(middleName)) {
            result = result.concat(middleName);
            result = result.concat(SPACE);
        }
        result = result.concat(givenName);

        return result;
    }
}
