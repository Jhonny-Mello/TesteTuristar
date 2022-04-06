package com.br.Turistar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rotas")
public class Rotas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "inicioLa")
	private String inicioL;
	
	@Column(name = "inicioLo")
	private String inicioLo;
	
	@Column(name = "way_point1La")
	private String wayPoint1La;
	
	@Column(name = "way_point1Lo")
	private String wayPoint1Lo;

	@Column(name = "way_point2La")
	private String wayPoint2La;
	
	@Column(name = "way_point2Lo")
	private String wayPoint2Lo;

	@Column(name = "way_point3La")
	private String wayPoint3La;
	
	@Column(name = "way_point3Lo")
	private String wayPoint3Lo;

	@Column(name = "way_point4La")
	private String wayPoint4La;
	
	@Column(name = "way_point4Lo")
	private String wayPoint4Lo;

	@Column(name = "way_point5La")
	private String wayPoint5La;
	
	@Column(name = "way_point5Lo")
	private String wayPoint5Lo;

	@Column(name = "fimLa")
	private String fimLa;
	
	@Column(name = "fimLo")
	private String fimLo;
	
	@Column(name = "fim")
	private String fim;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInicioL() {
		return inicioL;
	}

	public void setInicioL(String inicioL) {
		this.inicioL = inicioL;
	}

	public String getInicioLo() {
		return inicioLo;
	}

	public void setInicioLo(String inicioLo) {
		this.inicioLo = inicioLo;
	}

	public String getWayPoint1La() {
		return wayPoint1La;
	}

	public void setWayPoint1La(String wayPoint1La) {
		this.wayPoint1La = wayPoint1La;
	}

	public String getWayPoint1Lo() {
		return wayPoint1Lo;
	}

	public void setWayPoint1Lo(String wayPoint1Lo) {
		this.wayPoint1Lo = wayPoint1Lo;
	}

	public String getWayPoint2La() {
		return wayPoint2La;
	}

	public void setWayPoint2La(String wayPoint2La) {
		this.wayPoint2La = wayPoint2La;
	}

	public String getWayPoint2Lo() {
		return wayPoint2Lo;
	}

	public void setWayPoint2Lo(String wayPoint2Lo) {
		this.wayPoint2Lo = wayPoint2Lo;
	}

	public String getWayPoint3La() {
		return wayPoint3La;
	}

	public void setWayPoint3La(String wayPoint3La) {
		this.wayPoint3La = wayPoint3La;
	}

	public String getWayPoint3Lo() {
		return wayPoint3Lo;
	}

	public void setWayPoint3Lo(String wayPoint3Lo) {
		this.wayPoint3Lo = wayPoint3Lo;
	}

	public String getWayPoint4La() {
		return wayPoint4La;
	}

	public void setWayPoint4La(String wayPoint4La) {
		this.wayPoint4La = wayPoint4La;
	}

	public String getWayPoint4Lo() {
		return wayPoint4Lo;
	}

	public void setWayPoint4Lo(String wayPoint4Lo) {
		this.wayPoint4Lo = wayPoint4Lo;
	}

	public String getWayPoint5La() {
		return wayPoint5La;
	}

	public void setWayPoint5La(String wayPoint5La) {
		this.wayPoint5La = wayPoint5La;
	}

	public String getWayPoint5Lo() {
		return wayPoint5Lo;
	}

	public void setWayPoint5Lo(String wayPoint5Lo) {
		this.wayPoint5Lo = wayPoint5Lo;
	}

	public String getFimLa() {
		return fimLa;
	}

	public void setFimLa(String fimLa) {
		this.fimLa = fimLa;
	}

	public String getFimLo() {
		return fimLo;
	}

	public void setFimLo(String fimLo) {
		this.fimLo = fimLo;
	}

	public String getFim() {
		return fim;
	}

	public void setFim(String fim) {
		this.fim = fim;
	}

	@Override
	public String toString() {
		return "Rotas [id=" + id + ", inicioL=" + inicioL + ", inicioLo=" + inicioLo + ", wayPoint1La=" + wayPoint1La
				+ ", wayPoint1Lo=" + wayPoint1Lo + ", wayPoint2La=" + wayPoint2La + ", wayPoint2Lo=" + wayPoint2Lo
				+ ", wayPoint3La=" + wayPoint3La + ", wayPoint3Lo=" + wayPoint3Lo + ", wayPoint4La=" + wayPoint4La
				+ ", wayPoint4Lo=" + wayPoint4Lo + ", wayPoint5La=" + wayPoint5La + ", wayPoint5Lo=" + wayPoint5Lo
				+ ", fimLa=" + fimLa + ", fimLo=" + fimLo + ", fim=" + fim + "]";
	}
}
