package io.github.vertanzil;

class Main {

    public static void main(String[] args) {
        //Gets the description and code
        System.out.print(Messages.FILE_NOT_FOUND.getFormattedDescriptionWithCode() + System.lineSeparator());
        //gets the formatted description and reason.
        System.out.print(Messages.FILE_NOT_FOUND.getFormattedDescription() + System.lineSeparator());
        //gets the code only.
        System.out.print(Messages.NO_DB_CONNECTION.getCode());
        //gets the description only.
        System.out.print(Messages.NO_DB_CONNECTION.getDescription());
    }
}
