package com.softserve.edu11;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Shkimba Yurii Yaroslavovych : " + Task.checkWithRegExp("Shkimba Yurii Yaroslavovych"));
        System.out.println("Shkimba Yurii : " + Task.checkWithRegExp("Shkimba Yurii"));
        System.out.println("Shkimba Yurii_88 : " + Task.checkWithRegExp("Shkimba Yurii_88"));
        System.out.println("Shkimba Yurii.Guru : " + Task.checkWithRegExp("Shkimba Yurii.Guru"));
        System.out.println("Shkimba Yurii1111 : " + Task.checkWithRegExp("Shkimba Yurii1111"));
    }
}
