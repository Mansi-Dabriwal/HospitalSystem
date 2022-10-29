/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatientSystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansidabriwal
 */
public class PatientDirectory {
    
    List<Patient> patient; 

    public PatientDirectory(){
        patient = new ArrayList<>();
    }
    public List<Patient> getPatient() {
        return patient;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }

    
}
