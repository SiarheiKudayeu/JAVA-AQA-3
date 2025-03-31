package lesson6.ex4;

public class ExampleFour {
    /*
     * Create a class with four methods, checkString().
     *
     * Method 1 accepts a string as a parameter and throws an exception if the number of characters in
     * the string is odd.
     * Method 2 accepts a string as a parameter and throws an exception if the string contains the
     * substring "exception".
     * Method 3 accepts a string as a parameter and throws an exception if the string consists of fewer
     * than 3 words.
     * Method 4 calls the previous three methods inside itself.
     *
     * Create separate custom exception classes for each of the exceptions.
     */

    public class OddCountOfCharactersException extends Exception {
        public OddCountOfCharactersException(String message) {
            super(message);
        }
    }

    public class StringConatinsException extends Exception {
        public StringConatinsException(String message) {
            super(message);
        }
    }

    public class AmountOfWordsIsLessThatThreeException extends Exception {
        public AmountOfWordsIsLessThatThreeException(String message) {
            super(message);
        }
    }

    private void checkString1(String message) throws OddCountOfCharactersException {
        if (message.length() % 2 != 0) {
            throw new OddCountOfCharactersException("The count of characters is odd");
        }
    }

    private void checkString2(String message) throws StringConatinsException {
        if (message.contains("exception")) {
            throw new StringConatinsException("Our message contains \"exception\" word");
        }
    }


    private void checkString3(String message) throws AmountOfWordsIsLessThatThreeException {
        if (message.split("\\s").length < 3) {
            throw new AmountOfWordsIsLessThatThreeException("The count of words is less than three");
        }
    }

    public void checkString4(String message) throws OddCountOfCharactersException, StringConatinsException, AmountOfWordsIsLessThatThreeException {
        checkString1(message);
        checkString2(message);
        checkString3(message);
    }

/*    public static void main(String[] args) {
        String text = "sasad sadsadaAsadsadsa sadsas";
        String[] words = text.split("A");
        System.out.println(words[0]);
    }*/

}
