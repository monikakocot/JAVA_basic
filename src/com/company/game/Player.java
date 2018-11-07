package com.company.game;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public String name, username;
    public Game game;
    public int points;

    public Player(String name, String username, int points) {
        this.name = name;
        this.username = username;
        this.points = points;
    }

    //List<Game> games = new ArrayList<>(); - player can be only in 1 game so we dont need a list

    public void addGame(Game game){
        this.game=game;
        game.addPlayer(this);

    }

    public String toString(){
        return name + " " + username + " " + points;
    }

    public String fullName() {
        return name +  " " + username;
    }
}


