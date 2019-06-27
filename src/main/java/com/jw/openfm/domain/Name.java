package com.jw.openfm.domain;

import static com.jw.openfm.util.StringUtils.trimToEmpty;

public class Name {

    private final String firstname;
    private final String lastname;

    public Name(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFullname() {
        return trimToEmpty(trimToEmpty(firstname) + " " + trimToEmpty(lastname));
    }

}
