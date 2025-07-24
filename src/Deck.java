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
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<UnoCard> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        String[] values = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Skip", "Reverse", "Draw Two"};

        // Add 2 of each card (except 0) per color
        for (String color : colors) {
            cards.add(new UnoCard(color, "0")); // One 0 per color
            for (int i = 1; i < values.length; i++) {
                cards.add(new UnoCard(color, values[i]));
                cards.add(new UnoCard(color, values[i]));
            }
        }

        // Add Wild and Wild Draw Four cards (4 of each)
        for (int i = 0; i < 4; i++) {
            cards.add(new UnoCard("Wild", "Wild"));
            cards.add(new UnoCard("Wild", "Wild Draw Four"));
        }
    }

    public UnoCard drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
