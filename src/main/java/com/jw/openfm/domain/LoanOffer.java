package com.jw.openfm.domain;

import java.util.Date;

//TODO: add interface "Offer"?
public class LoanOffer {

    private final Date loanDate;

    public LoanOffer(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getLoanDate() {
        return loanDate;
    }
}
