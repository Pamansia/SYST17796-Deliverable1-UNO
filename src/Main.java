/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author mansi
 * Date : July 24,2025
 */
public class Main {
    public static void main(String[] args) {
        UnoGame game = new UnoGame();

        // Add players
        game.addPlayer(new Player("Alice"));
        game.addPlayer(new Player("Bob"));

        // Start game and deal cards
        game.startGame();

        // Show each player's hand
        game.showAllHands();

        // Simulate one turn
        game.playTurn();
    }
}
