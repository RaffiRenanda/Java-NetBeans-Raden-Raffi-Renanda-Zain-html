/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author TUF GAMING
 */
public class myService {
    
    public ArrayList<List<String>> myData(){
        
        ArrayList<List<String>> tabel = new ArrayList<>();
        tabel.add(Arrays.asList("Mesin Cuci","Sanyo","Rp. 1.500.000"));
        tabel.add(Arrays.asList("Laptop","Asus","Rp. 15.500.000"));
        tabel.add(Arrays.asList("Speaker","Soni","Rp. 500.000"));
        tabel.add(Arrays.asList("Tv","Samsung","Rp. 2.500.000"));
        
        return tabel;
    }
}
