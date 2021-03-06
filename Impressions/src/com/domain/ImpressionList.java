package com.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Impressions")
@XmlAccessorType(XmlAccessType.NONE)
public class ImpressionList {

		@XmlElement(name = "Impression")
		private List<Impression> impressions = new ArrayList<>();
		
		public void setImpressions(List<Impression> imps) {
			this.impressions = imps;
		}
		
		public List<Impression> getImpressions() {
			return impressions;
		}
}
