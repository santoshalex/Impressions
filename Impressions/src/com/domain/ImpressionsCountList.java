package com.domain;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Impressions")
@XmlAccessorType(XmlAccessType.NONE)
public class ImpressionsCountList  {
	
		@XmlElement(name = "Impression")
		private List<ImpressionCount> Impressions = new ArrayList<>();
		
		public void setImpressions(List<ImpressionCount> Imp) {
			this.Impressions = Imp;
		}
		
		public List<ImpressionCount> getImpressions() {
			return Impressions;
}

		/*@Override
		public Iterator iterator() {
			return Impressions.iterator();
		}*/
}
