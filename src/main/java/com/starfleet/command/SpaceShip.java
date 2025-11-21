package com.starfleet.command;

public class SpaceShip {
    protected String name;
    protected String captain;

    public SpaceShip(String name, String captain) {
        this.name = name;
        this.captain = captain;
    }

    // Common Behaviors to demonstrate Polymorphism

    public void fly() {
        System.out.println(name + " commanded by Captain " + captain + " is flying through space.");
    }

    public void fireWeapon() {
        System.out.println(name + " fires its standard phaser array!");
    }

    public void displayStatus() {
        System.out.println("!!! " + name + " !!!");
        System.out.println("  Captain: " + captain);
        System.out.println("  Type: Generic SpaceShip");
    }

    public String getName() {
        return name;
    }

    public String getCaptain() {
        return captain;
    }
}