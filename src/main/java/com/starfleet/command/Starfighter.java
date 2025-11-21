package com.starfleet.command;

public class Starfighter extends SpaceShip {
    private int maneuverabilityRating;

    public Starfighter(String name, String captain, int maneuverabilityRating) {
        super(name, captain);
        this.maneuverabilityRating = maneuverabilityRating;
    }

    // Overridden Behaviors (Runtime Polymorphism)
    @Override
    public void fireWeapon() {
        System.out.println(name + " unleashes a burst of laser fire!");
    }

    @Override
    public void fly() {
        System.out.println(name + " zips and maneuvers through an asteroid field at high speed!");
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("  Type: Starfighter");
        System.out.println("  Maneuverability: " + maneuverabilityRating + "/10");
    }

    // Unique Behavior
    public void performEvasiveManeuver() {
        System.out.println(name + " executes a barrel roll!");
    }
}