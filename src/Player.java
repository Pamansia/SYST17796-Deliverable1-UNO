/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author mansi
 */
public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public void playCard(UnoCard card) {
        hand.removeCard(card);
        System.out.println(name + " played: " + card);
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }
}
