/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UCP.java.Praktikum.java.kelas.a;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.myService;
/**
 *
 * @author TUF GAMING
 */
@Controller        
public class myController {

    
    @RequestMapping("/show")

    public String getView(){
        return "myprofile";
    }
    
    
    @RequestMapping("/showdata")

    public String getData(Model kurir){
        myService getservice = new myService();
        ArrayList<List<String>> isipaket = new ArrayList<>();
        isipaket = getservice.myData();
        
        kurir.addAttribute("namapaket",isipaket); //proses pengiriman
        return "viewProduk"; // halaman tujuan
    }
}

