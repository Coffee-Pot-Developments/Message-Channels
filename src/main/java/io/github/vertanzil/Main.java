package io.github.vertanzil;

public class Main {
    public static void main(String[] args) {
        //Gets the error code only.
        System.out.print(Messages.Message_001.getCode() + System.lineSeparator());
        //gets the formatted description and reason.
        System.out.print(Messages.Message_001.getFormattedDescription() + System.lineSeparator());
        //Gets the formatted description with code and reason.
        System.out.print(Messages.Message_001.getFormattedDescriptionWithCode() + System.lineSeparator());
    }
}
