/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansidabriwal
 */
public class VitalDirectory {
    List<VitalInfo> vitalInfo; 

    public List<VitalInfo> getVitalInfo() {
        return vitalInfo;
    }

    public void setVitalInfo(List<VitalInfo> vitalInfo) {
        this.vitalInfo = vitalInfo;
    }
    
    public VitalDirectory(){
        vitalInfo = new ArrayList<>();
    }
}
