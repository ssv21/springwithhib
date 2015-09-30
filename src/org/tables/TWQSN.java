package org.tables;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Type;


@Entity
@Table(name="FAQ_TAG_QUES_RT")
public class TWQSN {
	
	@Id
	@Column(name="FAQ_QUES_ID",nullable=false)
	private int qid1;
	
	@ManyToOne
	private Questions qid;
	
	
	@Id
	@GeneratedValue
	@Column(name="FAQ_TAG_ID",nullable=false)
	private int tid1;
	
	@ManyToOne
	private TagList tid;
	
	@Column(name="FAQ_QUES_SEQID",nullable=false)
	private int seqid;
	
	@Column(name="FAQ_QUES_EFF_DTE",columnDefinition="date default sysdate")
	@Type(type="date")
	private Date eff_date;
	
	
	@Column(name="FAQ_QUES_EXP_DTE",columnDefinition="DATE DEFAULT '31-DEC-9999'",nullable=false)
	@ Temporal (TemporalType.DATE)
	private Date exp_date;
	
	@Column(name="ROW_EFF_DTM",nullable=false)
	@ Temporal (TemporalType.TIMESTAMP)
	private Timestamp tdate;
	
	@Column(name="ROW_EXP_DTM")
	@ Temporal (TemporalType.TIMESTAMP)
	private Timestamp tedate;
	
	@Column(name="ROW_UPDT_RFRN_NUM",columnDefinition="DEFAULT 'USER'",nullable=false)
	private char refnum;

	public int getQid1() {
		return qid1;
	}

	public void setQid1(int qid1) {
		this.qid1 = qid1;
	}

	public Questions getQid() {
		return qid;
	}

	public void setQid(Questions qid) {
		this.qid = qid;
	}

	public int getTid1() {
		return tid1;
	}

	public void setTid1(int tid1) {
		this.tid1 = tid1;
	}

	public TagList getTid() {
		return tid;
	}

	public void setTid(TagList tid) {
		this.tid = tid;
	}

	public int getSeqid() {
		return seqid;
	}

	public void setSeqid(int seqid) {
		this.seqid = seqid;
	}

	public Date getEff_date() {
		return eff_date;
	}

	public void setEff_date(Date eff_date) {
		this.eff_date = eff_date;
	}

	public Date getExp_date() {
		return exp_date;
	}

	public void setExp_date(Date exp_date) {
		this.exp_date = exp_date;
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

}
