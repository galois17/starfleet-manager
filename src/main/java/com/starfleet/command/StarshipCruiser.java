package com.starfleet.command;

public class StarshipCruiser extends SpaceShip {
    private int shieldStrength;

    public StarshipCruiser(String name, String captain, int shieldStrength) {
        super(name, captain); // Call the superclass constructor
        this.shieldStrength = shieldStrength;
    }

    @Override
    public void fireWeapon() {
        System.out.println(name + " launches a powerful photon torpedo!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is cruising at warp speed through Sector Alpha.");
    }

    @Override
    public void displayStatus() {
        super.displayStatus(); // Call superclass method first
        System.out.println("  Type: Starship Cruiser");
        System.out.println("  Shield Strength: " + shieldStrength + "%");
    }

    // Some unique behavior added for variety
    public void raiseShields() {
        System.out.println(name + " raising shields to " + shieldStrength + "%.");
    }
}