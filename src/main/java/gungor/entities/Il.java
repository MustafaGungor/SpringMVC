package gungor.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Il")
public class Il {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "il_id")
    private Integer il_id;
	@Column(name = "il_adi")
	private String ilAdi;
	@Column(name="il_plaka_kodu")
	private String ilPlakaKodu;
	
	
	
	public Il(Integer il_id, String ilAdi, String ilPlakaKodu, Ulke ulke_id) {
		super();
		this.il_id = il_id;
		this.ilAdi = ilAdi;
		this.ilPlakaKodu = ilPlakaKodu;
	}
	public String getIlPlakaKodu() {
		return ilPlakaKodu;
	}
	public void setIlPlakaKodu(String ilPlakaKodu) {
		this.ilPlakaKodu = ilPlakaKodu;
	}
	public Integer getIl_id() {
		return il_id;
	}
	public void setIl_id(Integer il_id) {
		this.il_id = il_id;
	}
	public String getIlAdi() {
		return ilAdi;
	}
	public void setIlAdi(String ilAdi) {
		this.ilAdi = ilAdi;
	}
	
	
	
	
}
