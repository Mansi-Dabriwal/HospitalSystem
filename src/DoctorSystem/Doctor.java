/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoctorSystem;

import PersonSystem.Person;

/**
 *
 * @author mansidabriwal
 */
public class Doctor {
    Person person;
    String NameofHospital;
    int doctorId;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNameofHospital() {
        return NameofHospital;
    }

    public void setNameofHospital(String NameofHospital) {
        this.NameofHospital = NameofHospital;
    }
}
