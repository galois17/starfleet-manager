package com.starfleet.command;

public class MaintenanceBay {

    /**
     * This method demonstrates polymorphism.
     * It accepts the parent class, SpaceShip, as an argument.
     * At runtime, the JVM calls the correct overridden method
     * based on the actual object (Cruiser or Fighter).
     */
    public void runDiagnostics(SpaceShip ship) {
        System.out.println("Diagnostics initiated for: " + ship.getName());

        // Polymorphic call: The ship's specific displayStatus() is called.
        ship.displayStatus();

        // Polymorphic call: The ship's specific fly() method is called.
        ship.fly();

        System.out.println("Diagnosis Complete. Report generated.");
        System.out.println("=========================================");
    }

    /**
     * Overloaded method to demonstrate compile-time polymorphism (Optional).
     * This method signature is unique due to the argument type.
     */
    public void runDiagnostics(Starfighter fighter) {
        System.out.println("RUSH DIAGNOSTICS: Fighter detected!");
        fighter.performEvasiveManeuver(); // Can call unique methods directly
        runDiagnostics((SpaceShip) fighter); // Call the generic diagnostic method
        System.out.println("Fighter cleared for combat.");
    }
}