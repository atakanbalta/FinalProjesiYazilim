package tr.edu.medipol.yazarac.RestWebServisOrnek;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ogrenci")
public class TestBolumu {
	// Kişileri Kontrol Testi
	@Test
	public void ListeKontrol() {
		//Given  - Koşullar - Ön Şartlar
	List<String> ogrenciler = new ArrayList<>();
		 {
			 String ogrenci1 ="Atakan";
			 String ogrenci2 ="Eren";
			 String ogrenci3 ="Ayşe";
			 int Not =25;
			int Not2 = 21;
			int Not3 =23;
	   //When 	
		
		ogrenciler.add(ogrenci1+Not);
		ogrenciler.add(ogrenci2+Not2);
		ogrenciler.add(ogrenci3+Not3);
			
	  //Then - Kontrol	
			assertEquals("Atakan",ogrenci1);
			assertEquals("Ali",ogrenci2);
			assertEquals("Ayşe",ogrenci3);
			
			
		}
		 
		
		
	}
private void assertEquals(String string, String ogrenci1) {
		// TODO Auto-generated method stub
		
	}
@GetMapping("/ogrenciEkle/{ogrenciAdi}")
@Test
//OgrenciEkleTesti
//Given
public void   OgrenciEkle() {
	List<String> ogrenciler = new ArrayList<>();
	 {
		 String std1 ="Murat";
		 String std2 ="Ali";
		 String std3 ="Ahmet";
	 }
	 //When
	 String yeniogrenci="Ahmet";
	 ogrenciler.add(yeniogrenci);
	 //Then
	 assertEquals(yeniogrenci,"Ahmet");
   
}
@GetMapping("/ogrenciSil/{ogrenciAdi}")
@Test	
public void OgrenciSil() {
//OgrenciSil Testi
	//Given
		List<String> ogrenciler = new ArrayList<>();
		 {
			 String std1 ="Murat";
			 String std2 ="Ali";
			 String std3 ="Mehmet";
			 
		//When	 
			 
			 ogrenciler.remove(std3);
	    
		//Then	 
			 assertEquals(std3,"Mehmet");
		 }	
	
	
}

}
