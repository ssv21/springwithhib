package org.tables;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.Type;


@Entity
@Table(name="FAQ_TAG_ID")
public class TagList {
	
	@Id
	@GeneratedValue
	@Column(name="FAQ_TAG_ID",nullable=false)
	private int tid;
	
	@Column(name="TAG_EFF_DTE",columnDefinition="date default sysdate")
	@Type(type="date")
	private Date eff_date;
	
	
	@Column(name="TAG_EXP_DTE",columnDefinition="DATE DEFAULT '31-DEC-9999'",nullable=false)
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
	
	@Column(name="FAQ_QUES_TXT",nullable=false)
	private String text;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="REL_FAQ_TAG_ID")
	private TagList rid;
	
	@OneToMany(mappedBy="REL_FAQ_TAG_ID")
	private Set set  =new HashSet();
	
	@OneToMany(mappedBy="FAQ_TAG_ID")
	private List TagWQS;
	
	public List getTagWQS() {
		return TagWQS;
	}

	public void setTagWQS(List tagWQS) {
		TagWQS = tagWQS;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TagList getRid() {
		return rid;
	}

	public void setRid(TagList rid) {
		this.rid = rid;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}


	
}