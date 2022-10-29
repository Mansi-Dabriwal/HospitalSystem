/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CityDirectory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansidabriwal
 */
public class CityDirectory {
    
    List<City> city; 

    public CityDirectory(){
        city = new ArrayList<>();
    }
    public List<City> getCity() {
        return city;
    }

    public void setCity(List<City> city) {
        this.city = city;
    }

}
