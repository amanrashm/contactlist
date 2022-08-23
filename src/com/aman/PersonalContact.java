package com.aman;

public class PersonalContact extends Contact {

    private final String dateOfBirth;

    public PersonalContact(String firstName, String lastName, String address,
                           String email, int phone1, String dateOfBirth) {
        super(firstName, lastName, address, email, phone1);
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    void write() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
}