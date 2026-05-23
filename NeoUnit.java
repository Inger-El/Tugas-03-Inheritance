/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nct_system;
// INHERITANCE: extends mengambil sifat dari NCTMember
/**
 *
 * @author Asus
 */
public class NeoUnit extends NCTMember {
    public String activeProject; // Atribut 1
    public String status;        // Atribut 2

    // Constructor ini harus sesuai dengan constructor Full di NCTMember
    public NeoUnit(String id, String name, String nat, int year, String unit, String proj, String stat) {
        super(id, name, nat, year, unit); // Harus ada 5 parameter sesuai parent
        this.activeProject = proj;
        this.status = stat;
    }

    public void showStatus() { System.out.println("Status: " + status); } // Method 1
    public void showProject() { System.out.println("Project: " + activeProject); } // Method 2
}
