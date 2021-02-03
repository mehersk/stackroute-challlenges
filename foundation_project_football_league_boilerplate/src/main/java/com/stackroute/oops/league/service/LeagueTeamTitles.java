package com.stackroute.oops.league.service;

/**
 * Enum to store the four team titles
 * Contains one field description and a parameterized constructor to initialize it
 * Modify this code by adding description to each enum constants
 */
public enum LeagueTeamTitles {
    HIPHOP("Hiphop"), WIN2WIN("Win2Win"),
    HAPPYFEET("Happy Feet"), LUCKYSTRIKE("Lucky Strike");
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

	LeagueTeamTitles(String teamName) {
        this.teamName = teamName;
	}

}
