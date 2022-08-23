package com.aman;

public class BusinessContact extends Contact {

    private final String jobTitle;
    private final String organization;

    public BusinessContact(String firstName, String lastName, String address,
                           String email, int phone1, String jobTitle, String organization) {
        super(firstName, lastName, address, email,  phone1);
        this.jobTitle = jobTitle;
        this.organization = organization;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getOrganization() {
        return organization;
    }

    void write() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

}