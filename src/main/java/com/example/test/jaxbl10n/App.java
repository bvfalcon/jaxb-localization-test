package com.example.test.jaxbl10n;

import java.util.Locale;
import java.util.Scanner;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.util.JAXBSource;

public class App {

    public static void main(String[] args) throws JAXBException {
        try {
            new JAXBSource((JAXBContext)null, null);
        } catch (JAXBException e) {
            System.out.println(String.format("""
MarshalException is catched.
Localized message (using system default locale %s):""", Locale.getDefault()));
            System.out.println(e.getLocalizedMessage());
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Input locale name to set it as system default and view localized message. Press 'Ctrl+C' for exit: ");
                String input = scanner.nextLine();
                Locale.setDefault(Locale.forLanguageTag(input));
                System.out.println("Using " + Locale.getDefault() + ": " + e.getLocalizedMessage());
            }
        }
    }
}
