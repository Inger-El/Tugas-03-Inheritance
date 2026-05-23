/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nct_system;

/**
 *
 * @author Asus
 */
public class NCTMember {
    // 5 Atribut
    public String memberID, fullName, nationality, originalUnit, position;
    public int debutYear;

    // 3 Constructor
    public NCTMember() {} // 1. Default
    public NCTMember(String name) { this.fullName = name; } // 2. Partial
    public NCTMember(String id, String name, String nat, int year, String unit) { // 3. Full
        this.memberID = id; 
        this.fullName = name; 
        this.nationality = nat;
        this.debutYear = year; 
        this.originalUnit = unit;
    }

    // CRUD SQL
    public void create() { System.out.println("SQL: INSERT INTO member VALUES ('"+fullName+"');"); }
    public void read() { System.out.println("SQL: SELECT * FROM member WHERE id='"+memberID+"';"); }
    public void update() { System.out.println("SQL: UPDATE member SET name='Update' WHERE id='"+memberID+"';"); }
    public void delete() { System.out.println("SQL: DELETE FROM member WHERE id='"+memberID+"';"); }
}
