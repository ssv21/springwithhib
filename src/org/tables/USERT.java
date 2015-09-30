package org.tables;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Type;


@Entity
@Table(name="USER_T")
public class USERT {
	
	@Id
	@Column(name="USER_ID",nullable=false)
	private int uid;
	
	@Column(name="USER_NAME",nullable=false)
	private String text;
	
	@Column(name="USER_MAIL_ID",nullable=false)
	private String mail;
	
	

	@Column(name="USER_EFF_DTE",columnDefinition="date default sysdate")
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
	
	@OneToMany(mappedBy = "USER_T",cascade=CascadeType.ALL)
	private List QuesT;
	
	@Column(name="USER_ACT_I",columnDefinition="DEFAULT 'Y'",nullable=false)
	@Check(constraints = "USER_ACT_I IN ('Y','N')")
	private char usact;
	
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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

	public List getQuesT() {
		return QuesT;
	}

	public void setQuesT(List quesT) {
		QuesT = quesT;
	}

	public char getUsact() {
		return usact;
	}

	public void setUsact(char usact) {
		this.usact = usact;
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
}
