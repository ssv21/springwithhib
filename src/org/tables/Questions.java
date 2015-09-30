package org.tables;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Type;


@Entity
@Table(name="FAQ_QUES_RT11")
public class Questions {
	
	@Id
	@GeneratedValue
	@Column(name="FAQ_QUES_ID",nullable=false)
	private int qid;
	
	@Column(name="FAQ_QUES_EFF_DTE",columnDefinition="date default sysdate")
	@Type(type="date")
	private Date eff_date;
	
	
	@Column(name="FAQ_QUES_EXP_DTE",columnDefinition="DATE DEFAULT '31-DEC-9999'",nullable=false)
	@ Temporal (TemporalType.DATE)
	private Date exp_date;
	
	@Column(name="FAQ_QUES_USD_I",columnDefinition="DEFAULT 'Y'",nullable=false)
	@Check(constraints = "FAQ_QUES_USD_I IN ('Y','N')")
	private char usd;
	
	@Column(name="ROW_EFF_DTM",nullable=false)
	@ Temporal (TemporalType.TIMESTAMP)
	private Timestamp tdate;
	
	@Column(name="ROW_EXP_DTM")
	@ Temporal (TemporalType.TIMESTAMP)
	private Timestamp tedate;
	
	@Column(name="ROW_UPDT_RFRN_NUM",columnDefinition="DEFAULT 'USER'",nullable=false)
	private char refnum;
	
	@Column(name="FAQ_QUES_TXT",nullable=false)
	private String text;
	
	@OneToMany(mappedBy = "FAQ_QUES_RT",cascade=CascadeType.ALL)
	private List Answers;
	
	@OneToMany(mappedBy = "FAQ_QUES_RT",cascade=CascadeType.ALL)
	private List TagWQS;
	
	@OneToMany(mappedBy = "FAQ_QUES_RT",cascade=CascadeType.ALL)
	private List QuesT;

	public List getQuesT() {
		return QuesT;
	}

	public void setQuesT(List quesT) {
		QuesT = quesT;
	}

	public List getTagWQS() {
		return TagWQS;
	}

	public void setTagWQS(List tagWQS) {
		TagWQS = tagWQS;
	}

	public List getAnswers() {
		return Answers;
	}

	public void setAnswers(List answers) {
		Answers = answers;
	}

	public int getId() {
		return qid;
	}

	public void setId(int id) {
		this.qid = id;
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

	public char getUsd() {
		return usd;
	}

	public void setUsd(char usd) {
		this.usd = usd;
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
