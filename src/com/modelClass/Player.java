package com.modelClass;

import java.util.ArrayList;

public class Player {
    private String name;
    private String position;

    //Constructor
    public Player(String name, String position){
        this.name = name;
        this.position = position;
    }
    // Getters
    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
}

public class Team{
    private String teamName;
    private List<Player> players;

    // Constructor
    public Team(String teamName){
        this.teamName = teamName;
        this.Players = new ArrayList<>();
    }
}
