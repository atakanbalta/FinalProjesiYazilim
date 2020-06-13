package tr.edu.medipol.yazarac.RestWebServisOrnek;

 

import java.util.*;
import org.springframework.web.bind.annotation.*;

 

@RestController
@RequestMapping(path="/ogrenci")
public class RestWebServis {

 

    private static List<Student> ogrenciListesi = new ArrayList<>();
    static {
        ogrenciListesi.add(new Student("Ali", 25));
        ogrenciListesi.add(new Student("Ayse", 21));
        ogrenciListesi.add(new Student("Mehmet", 23));
    }
    
    @GetMapping("/tumbilgiler")
    public List<Student> listele(){
        return ogrenciListesi;
    }
    @PostMapping("/ekle")
    public  Student Ekle(@RequestBody Student ogrenci){
    	ogrenciListesi.add(ogrenci);
		return ogrenci;
    }
    
    @PostMapping("/sil")
    public  Student sil(@RequestBody Student ogrenci){
    	ogrenciListesi.add(ogrenci);
		return ogrenci;
    }
    
}
