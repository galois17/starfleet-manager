package com.starfleet.command;

public class StarfleetCommand {

    public static void main(String[] args) {

        // Setup the Service
        MaintenanceBay bay = new MaintenanceBay();

        SpaceShip enterprise = new StarshipCruiser("USS Enterprise", "Jean-Luc Picard", 95);
        Starfighter rogueOne = new Starfighter("Rogue One", "Cassian Andor", 9);

        System.out.println("=== Service Queue Begins ===");

        //

        System.out.println("\n[A] Servicing Starship Cruiser (USS Enterprise)");
        bay.runDiagnostics(enterprise);

        System.out.println("\n[B] Servicing Starfighter (Rogue One)");
        bay.runDiagnostics(rogueOne);

        System.out.println("\n[C] Servicing Starfighter (Rogue One) using specific method");
        bay.runDiagnostics(rogueOne);

        System.out.println("=== Service Queue Ends ===");
    }

}