/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author mansi
 * Date : July 24,2025
 */
public class UnoCard extends Card {
    public UnoCard(String color, String value) {
        super(color, value);
    }

    public boolean isPlayableOn(UnoCard other) {
        return this.getColor().equals(other.getColor()) ||
               this.getValue().equals(other.getValue()) ||
               this.getColor().equals("Wild");
    }
}
