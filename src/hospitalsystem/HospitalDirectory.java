/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansidabriwal
 */
public class HospitalDirectory {
    List<Hospital> hospital; 

    public List<Hospital> getHospital() {
        return hospital;
    }

    public void setHospital(List<Hospital> hospital) {
        this.hospital = hospital;
    }
    

    public HospitalDirectory(){
        hospital = new ArrayList<>();
    }
    
}
