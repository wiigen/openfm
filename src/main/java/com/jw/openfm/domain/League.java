package com.jw.openfm.domain;

import java.util.List;

import lombok.Data;

@Data
public class League {
    private final String name;
    private final List<Team> teams;
}

