/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoctorSystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansidabriwal
 */
public class DoctorDirectory {
    List<Doctor> doctor; 

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
    }


    public DoctorDirectory(){
        doctor = new ArrayList<>();
    }
}
