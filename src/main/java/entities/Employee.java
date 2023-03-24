package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "admission_date")	
	private Date admissionDate;
	
	@Column(name = "type_contract")
	private String typeContract;
	
	@Column(length = 100)
	private String sector;
	
	@Column(length = 100)
	private String place;
	
	@Column(name = "avaluation_note")
	private Integer avaluationNote;
	
	private String function;
	
	public String toString() {
		return id + " - " + name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getTypeContract() {
		return typeContract;
	}

	public void setTypeContract(String typeContract) {
		this.typeContract = typeContract;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Integer getAvaluationNote() {
		return avaluationNote;
	}

	public void setAvaluationNote(Integer avaluationNote) {
		this.avaluationNote = avaluationNote;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}
}
