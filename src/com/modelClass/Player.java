package com.modelClass;

import java.util.ArrayList;
import java.util.List;

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

 class Team{
    private String teamName;
    private List<Player> players;

    // Constructor
    public Team(String teamName){
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }
}
