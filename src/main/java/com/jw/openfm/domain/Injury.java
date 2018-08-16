package com.jw.openfm.domain;

import org.joda.time.LocalDate;

import lombok.Getter;

@Getter
public class Injury {
    private InjuryType type;
    private LocalDate expectedBack;
}
