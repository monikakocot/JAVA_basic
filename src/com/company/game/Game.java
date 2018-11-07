package com.company.game;

import java.util.*;

public class Game {
    public String name;

    public Game(String name) {

        this.name = name;
    }

    List<Player> players = new ArrayList<>();

    // method (creating associations) that adds Player class objects to ONE Game class object
    // as a parameter, it accepts the object of the Player class
    public void addPlayer(Player p1){
        if(!players.contains(p1)){
            players.add(p1);

        }
    }

    public void winner(){
        int max = 0;
        Player winner = null;

        Map<String, Integer> counter = new TreeMap<>();

        for (int i = 0; i < players.size(); i++) {

            counter.put(players.get(i).name, players.get(i).points);
            if(players.get(i).points> max) {
                winner = players.get(i);
                max = players.get(i).points;
            }

        }

        System.out.println("And the winner is: "+ winner.fullName() + " with score:" + max);
    }


    /*
    public void winner(){
        int max = 0;
        Player winner = null;

        for(Player player : players){
            if(player.points> max)
                max =player.points;
                winner =player;
        }

        System.out.println("And the winner is: "+ winner.fullName() + " with score:" + max);
    }
*/
    public List<Player> showPlayers(){
        return players;
    }

    public String toString(){
        return name;
    }
}


