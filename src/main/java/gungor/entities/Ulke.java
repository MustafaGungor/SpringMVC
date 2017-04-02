package gungor.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ulke")
public class Ulke {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ulke_id")
	private Integer ulke_id;
	@Column(name = "ulke_adi")
	private String ulke_adi;
	@Column(name = "ulke_kodu")
	private String ulke_kodu;
	
	
	public Integer getUlke_id() {
		return ulke_id;
	}
	public void setUlke_id(Integer ulke_id) {
		this.ulke_id = ulke_id;
	}
	public String getUlke_adi() {
		return ulke_adi;
	}
	public void setUlke_adi(String ulke_adi) {
		this.ulke_adi = ulke_adi;
	}
	public String getUlke_kodu() {
		return ulke_kodu;
	}
	public void setUlke_kodu(String ulke_kodu) {
		this.ulke_kodu = ulke_kodu;
	}
	
}
