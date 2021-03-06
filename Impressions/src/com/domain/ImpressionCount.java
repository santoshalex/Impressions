package com.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "impressionCount")
@XmlAccessorType(XmlAccessType.NONE)
public class ImpressionCount {
	
	@XmlElement(name = "Eid")
	private int Eid;
	@XmlElement(name = "Ename")
	private String Ename;
	@XmlElement(name = "iCount")
	private int iCount;
	@XmlElement(name = "impressions_list")
	private List<Impression> impressions_list;
	
	public List<Impression> getImpressionsList() {
	return impressions_list;
	}
	
	public void setImpressionsList(List<Impression> impressions_list) {
	this.impressions_list = impressions_list;
	}
	
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getCount() {
		return iCount;
	}
	public void setCount(int count) {
		this.iCount = count;
	}
	
	@Override
	public String toString() {
		return "impressionCount [Eid=" + Eid + ", Ename=" + Ename + ", iCount=" + iCount +"]";
	}
}
