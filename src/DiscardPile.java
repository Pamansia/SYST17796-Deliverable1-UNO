/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author mansi
 */
import java.util.Stack;

public class DiscardPile {
    private Stack<UnoCard> cards;

    public DiscardPile() {
        cards = new Stack<>();
    }

    public void addCard(UnoCard card) {
        cards.push(card);
    }

    public UnoCard getTopCard() {
        if (!cards.isEmpty()) {
            return cards.peek();
        }
        return null;
    }
}
