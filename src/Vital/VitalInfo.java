/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vital;

import PatientSystem.Patient;


/**
 *
 * @author mansidabriwal
 */
public class VitalInfo {
    String bloodPressure;
    String heartRate;
    String respiratoryRate;
    Patient patient;

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public void setRespiratoryRate(String respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public String getRespiratoryRate() {
        return respiratoryRate;
    }
}
