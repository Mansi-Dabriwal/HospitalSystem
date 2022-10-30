/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encounter;

import Vital.VitalInfo;
import java.util.Date;

/**
 *
 * @author mansidabriwal
 */
public class Encounter {
//    int encounterId;
    VitalInfo vital;
    Date dateOfAppointement;

//    public int getEncounterId() {
//        return encounterId;
//    }
//
//    public void setEncounterId(int encounterId) {
//        this.encounterId = encounterId;
//    }
    

    public VitalInfo getVital() {
        return vital;
    }

    public void setVital(VitalInfo vital) {
        this.vital = vital;
    }

    public Date getDateOfAppointement() {
        return dateOfAppointement;
    }

    public void setDateOfAppointement(Date dateOfAppointement) {
        this.dateOfAppointement = dateOfAppointement;
    }
}
