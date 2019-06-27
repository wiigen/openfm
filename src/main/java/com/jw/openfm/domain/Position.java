package com.jw.openfm.domain;

public enum Position {
    GK("Goalkeeper"),
    DL("Left back"),
    DC("Center back"),
    DR("Right back"),
    DM("Defensive midfielder"),
    ML("Left wing"),
    MC("Central midfielder"),
    MR("Right wing"),
    AM("Attacking midfielder"),
    ST("Striker");

    private final String description;

    Position(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
