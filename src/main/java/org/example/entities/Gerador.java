package org.example.entities;

import java.security.SecureRandom;

public class Gerador {

    private static final String CHARACTERS_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHARACTERS_UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CHARACTERS_NUMBERS = "0123456789";
    private static final String CHARACTERS_SPECIAL = "!@#$%&*<>?";

    public static String passwordGenerator(
            int lenght, boolean uppercaseInclusion, boolean specialInclusion) {
        String characters = CHARACTERS_LOWERCASE + CHARACTERS_NUMBERS;
        if (uppercaseInclusion) {
            characters += CHARACTERS_UPPERCASE;
        } if (specialInclusion) {
            characters += CHARACTERS_SPECIAL;
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < lenght; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }
}
