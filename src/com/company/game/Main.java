package com.company.game;

/*
Define two classes responsible for storing information about the Game and Player.
The Game class should contain:
- name,
- players.
The Player class should contain:
- name,
- username,
- points.
The Game class should also include the 'winner' method, which prints the first and last name of the winner on the screen. The player with more than 100 points wins. If two players have more than 100 points, the one with the most wins.
The Player class should contain the 'fullName' method that returns, which should list the player's first and last name.
 */

public class Main {

    public static void main(String[] args) throws Exception {

        Game g1 = new Game("Warcraft 3");

        Player p1 = new Player("Jas", "Janek555", 200);
        Player p2 = new Player("Tomek", "Tomix", 250);
        Player p3 = new Player("Krzys", "Przemo", 99);

        g1.addPlayer(p1);
        g1.addPlayer(p2);
        g1.addPlayer(p3);

        //p1.addGame(g1);
        //p2.addGame(g1);
        //p3.addGame(g1);

        System.out.println(g1.showPlayers());
        g1.winner();
    }
}

