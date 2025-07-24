/* @author mansi
*Date : July 24,2025
*/
import java.util.ArrayList;
import java.util.List;

public class UnoGame {
    private Deck deck;
    private DiscardPile discardPile;
    private List<Player> players;
    private int direction;
    private int currentPlayerIndex;

    public UnoGame() {
        deck = new Deck();
        discardPile = new DiscardPile();
        players = new ArrayList<>();
        direction = 1;
        currentPlayerIndex = 0;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void startGame() {
        System.out.println("Starting the game...");
        deck.shuffle();
        dealInitialCards(7);
        System.out.println("Cards have been dealt.");
    }

    private void dealInitialCards(int numCards) {
        for (Player player : players) {
            for (int i = 0; i < numCards; i++) {
                UnoCard drawnCard = deck.drawCard();
                if (drawnCard != null) {
                    player.getHand().addCard(drawnCard);
                }
            }
        }
    }

    public void showAllHands() {
        for (Player player : players) {
            System.out.println(player.getName() + "'s hand:");
            for (UnoCard card : player.getHand().getCards()) {
                System.out.println("  " + card);
            }
        }
    }

    public void playTurn() {
        if (!players.isEmpty()) {
            Player current = players.get(currentPlayerIndex);
            System.out.println("Playing turn for player: " + current.getName());
            if (!current.getHand().getCards().isEmpty()) {
                UnoCard cardToPlay = current.getHand().getCards().get(0);
                current.playCard(cardToPlay);
                discardPile.addCard(cardToPlay);
                System.out.println("Top of discard pile: " + discardPile.getTopCard());
            } else {
                System.out.println(current.getName() + " has no cards to play.");
            }

            // Advance to next player
            currentPlayerIndex = (currentPlayerIndex + direction + players.size()) % players.size();
        } else {
            System.out.println("No players available!");
        }
    }

    public List<Player> getPlayers() {
        return players;
    }
}
