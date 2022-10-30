/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encounter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansidabriwal
 */
public class EncounterDirectory {
    List<Encounter> encounter; 

    public EncounterDirectory(){
        encounter = new ArrayList<>();
    }

    public List<Encounter> getEncounter() {
        return encounter;
    }

    public void setEncounter(List<Encounter> encounter) {
        this.encounter = encounter;
    }
}
