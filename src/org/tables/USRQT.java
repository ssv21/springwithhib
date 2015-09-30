package org.tables;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class USRQT {
	
	@Id
	@Column(name="FAQ_QUES_ID",nullable=false)
	private int qid2;
	
	@Id
	@GeneratedValue
	@Column(name="FAQ_QUES_VAL_ID",nullable=false)
	private int aid1;
	
	@Id
	@Column(name="USER_ID",nullable=false)
	private int uid1;
	
	@ManyToOne
	private Answers qid1;
	
	@ManyToOne
	private Answers aid;
	
	@ManyToOne
	private USERT uid;
	
	@Column(name="ROW_EFF_DTM",nullable=false)
	@ Temporal (TemporalType.TIMESTAMP)
	private Timestamp tdate;
	
	@Column(name="ROW_EXP_DTM")
	@ Temporal (TemporalType.TIMESTAMP)
	private Timestamp tedate;
	
	@Column(name="ROW_UPDT_RFRN_NUM",columnDefinition="DEFAULT 'USER'",nullable=false)
	private char refnum;
	
	@Column(name="VRSN_ID",columnDefinition="DEFAULT '1'",nullable=false)
	private int vers;
	
	@Column(name="ORDN_QUES_ANSWR_TXT")
	private String text;

	public int getQid2() {
		return qid2;
	}

	public void setQid2(int qid2) {
		this.qid2 = qid2;
	}

	public int getAid1() {
		return aid1;
	}

	public void setAid1(int aid1) {
		this.aid1 = aid1;
	}

	public int getUid1() {
		return uid1;
	}

	public void setUid1(int uid1) {
		this.uid1 = uid1;
	}

	public Answers getQid1() {
		return qid1;
	}

	public void setQid1(Answers qid1) {
		this.qid1 = qid1;
	}

	public Answers getAid() {
		return aid;
	}

	public void setAid(Answers aid) {
		this.aid = aid;
	}

	public USERT getUid() {
		return uid;
	}

	public void setUid(USERT uid) {
		this.uid = uid;
	}

	public Timestamp getTdate() {
		return tdate;
	}

	public void setTdate(Timestamp tdate) {
		this.tdate = tdate;
	}

	public Timestamp getTedate() {
		return tedate;
	}

	public void setTedate(Timestamp tedate) {
		this.tedate = tedate;
	}

	public char getRefnum() {
		return refnum;
	}

	public void setRefnum(char refnum) {
		this.refnum = refnum;
	}

	public int getVers() {
		return vers;
	}

	public void setVers(int vers) {
		this.vers = vers;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
