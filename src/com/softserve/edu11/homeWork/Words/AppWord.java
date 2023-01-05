package com.softserve.edu11.homeWork.Words;

public class AppWord {
    public static void main(String[] args) {
        Words newSentence = new Words();
        newSentence.createSentence();
        newSentence.findTheLongestWord();
        newSentence.reversWord();

        Words sentenceWithSpace = new Words("I   love   Java     !!!");
        System.out.println("____________________\n" + sentenceWithSpace);
        sentenceWithSpace.sentencesWithoutSpaces();
    }
}
