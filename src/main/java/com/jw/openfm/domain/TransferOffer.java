package com.jw.openfm.domain;

import org.joda.money.Money;

import java.util.Date;

//TODO: add interface "Offer"
public class TransferOffer {

    private final Money fee;

    private Date transferDate;

    public TransferOffer(Money fee, Date transfereDate) {
        if (fee.isNegative()) {
            throw new IllegalArgumentException("Transfer fee can not be negative");
        }

        this.fee = fee;
        this.transferDate = transfereDate;
    }

    public Money getFee() {
        return fee;
    }

    public Date getTransferDate() {
        return transferDate;
    }
}
