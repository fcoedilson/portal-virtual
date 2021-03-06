package br.ueg.portalVirtual.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.ueg.portalVirtual.annotation.RequiredField;

@SuppressWarnings("serial")
@javax.persistence.Entity
@Table(name = "filo")
public class Filo extends Entity {

	@Id
	@GeneratedValue
	@Column(name = "id_filo")
	private long id;

	@Column(name = "nome")
	@RequiredField
	private String filo;

	@ManyToOne(optional = false, targetEntity = Reino.class)
	@JoinColumn(name = "id_reino", referencedColumnName = "id_reino")
	@RequiredField
	private Reino reino;

	public Filo() {
	}

	public Filo(long id, String filo, Reino reino) {
		this.id = id;
		this.filo = filo;
		this.reino = reino;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}

	public Reino getReino() {
		return reino;
	}

	public void setReino(Reino reino) {
		this.reino = reino;
	}

	@Override
	public String getSearchColumnTable() {
		return "nome";
	}

	@Override
	public String getSearchColumnEntity() {
		return "filo";
	}

}
