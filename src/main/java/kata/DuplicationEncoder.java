package kata;

public class DuplicationEncoder {
    static String encode(String word){
        //more than 2 times -> ")" , only once -> "("
        String lowercaseInput = word.toLowerCase();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lowercaseInput.length(); i++) {
            char currentChar = lowercaseInput.charAt(i);

            if (lowercaseInput.indexOf(currentChar) == lowercaseInput.lastIndexOf(currentChar)) {
                result.append('(');
            } else {
                result.append(')');
            }
        }

        return String.valueOf(result);
    }
}
