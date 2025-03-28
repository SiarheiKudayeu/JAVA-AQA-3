package lesson5.enums.ex3;

import java.util.Random;

public class CardGenerator {
    public static void main(String[] args) {
        printRandomCard();
    }

// Write a program that generates a random card, which will have
// a static method printRandomCard() that outputs a randomly generated card to the console.
// Create two separate enums: CardsTypes and CardValues.
// CardsTypes can have four types: ♦, ♠, ♣, ♥.
// CardValues: SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
// Create a class Card that will take arguments of type CardsTypes and CardValues in the constructor.

    public static void printRandomCard(){
        System.out.println(new Card(getRandomCardType(),getRandomCardValue()));
    }

    public enum CardValues {
        SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }

    public static CardValues getRandomCardValue() {
        CardValues[] cardValues = CardValues.values();
        int amountOfCards = cardValues.length;
        int randomIndex = new Random().nextInt(amountOfCards);
        return cardValues[randomIndex];
    }

    public enum CardTypes {
        DIAMOND("♦"), SPADE("♠"), CLUB("♣"), HEART("♥");
        private final String value;

        public String getValue() {
            return value;
        }

        CardTypes(String value) {
            this.value = value;
        }
    }

    public static CardTypes getRandomCardType() {
        CardTypes[] cardTypes = CardTypes.values();
        int amountOfCards = cardTypes.length;
        int randomIndex = new Random().nextInt(amountOfCards);
        return cardTypes[randomIndex];
    }

    public static class Card{
        private CardTypes cardType;
        private CardValues cardValue;

        public Card(CardTypes cardType, CardValues cardValue) {
            this.cardType = cardType;
            this.cardValue = cardValue;
        }

        @Override
        public String toString() {
            return cardValue + cardType.getValue() ;
        }
    }
}
