package com.dto;

public class Bed {
	private int id;//��λ��
	private int patientid;//���˺�
	private String room;//����
	

	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
