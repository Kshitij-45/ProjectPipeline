package com.example.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CricDTO {

    // private int id;
    // private String name;
    // private String country;
    // private int runs;

    @NotBlank(message = "Player name is required")
    private String playerName; 
    @NotBlank(message = "Country is required")
    private String playerCountry;
    @NotNull(message = "Runs is required")
    private Integer playerRuns; 

    public CricDTO() {
    }
    public CricDTO(String playerName, String playerCountry, Integer playerRuns) {
        this.playerName = playerName;
        this.playerCountry = playerCountry;
        this.playerRuns = playerRuns;
    }
    
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getPlayerCountry() {
        return playerCountry;
    }
    public void setPlayerCountry(String playerCountry) {
        this.playerCountry = playerCountry;
    }
    public Integer getPlayerRuns() {
        return playerRuns;
    }
    public void setPlayerRuns(Integer playerRuns) {
        this.playerRuns = playerRuns;
    }
}





