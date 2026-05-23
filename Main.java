/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nct_system;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // 1. Objek Constructor Default
        NCTMember m1 = new NCTMember();
        
        // 2. Objek Constructor Partial
        NCTMember m2 = new NCTMember("Mark Lee");
        
        // 3. Objek Constructor Full
        NCTMember m3 = new NCTMember("NCT-01", "Taeyong", "Korea", 2016, "127");
        
        // 4. Objek Turunan (NeoUnit)
        NeoUnit m4 = new NeoUnit("NCT-02", "Jaemin", "Korea", 2016, "Dream", "Smoothie", "Active");

        // Jalankan semua method sesuai instruksi
        m4.create(); 
        m4.read(); 
        m4.update(); 
        m4.delete();
        m4.showStatus(); 
        m4.showProject();
    }
}