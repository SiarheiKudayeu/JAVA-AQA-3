package lesson6.ex4;

public class ExceptionFourExampleClass {
    public static void main(String[] args) throws ExampleFour.AmountOfWordsIsLessThatThreeException {
        String message = "123excesption asddsa";
        ExampleFour exampleFour = new ExampleFour();
        try {
            exampleFour.checkString4(message);
        } catch (ExampleFour.StringConatinsException
                 | ExampleFour.OddCountOfCharactersException e) {
            System.out.println(e.getMessage());
        }

    }
}
