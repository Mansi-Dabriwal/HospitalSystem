/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatientSystem;

import Encounter.Encounter;
import Encounter.EncounterDirectory;
import PersonSystem.Person;

/**
 *
 * @author mansidabriwal
 */
public class Patient {
    
    String illness;
    Person person;
    EncounterDirectory encounterHistory;
    
    public Patient(){
        encounterHistory = new EncounterDirectory();
    }

    public EncounterDirectory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterDirectory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }


    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
