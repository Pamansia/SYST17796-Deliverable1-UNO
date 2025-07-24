/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author mansi
 * Date : July 24,2025
 */
import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<UnoCard> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(UnoCard card) {
        cards.add(card);
    }

    public void removeCard(UnoCard card) {
        cards.remove(card);
    }

    public List<UnoCard> getCards() {
        return cards;
    }
}
