package StringsHandling;

public class RemoveDuplicate {
    public static String removeDuplicates(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1) result += ch;
        }
        return result;
    }

}

