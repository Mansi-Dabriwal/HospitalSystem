/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunitySystem;

import CityDirectory.City;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansidabriwal
 */
public class CommunityDirectory {
    List<Community> community; 
    
    public CommunityDirectory(){
        community = new ArrayList<>();
    }

    public List<Community> getCommunity() {
        return community;
    }

    public void setCommunity(List<Community> community) {
        this.community = community;
    }
}
