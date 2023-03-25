package TaxPayer;

import LandOwner.LandOwner;

public class TaxPayer implements TaxPayers{
	 LandOwner landowner = new LandOwner();
	 public double computeTotalAria() {		
		 return landowner.computeTotalAria();
		 
	 	
	 }
	 public TaxPayer(LandOwner landowner) {
		 this.landowner = landowner;
		
	}
	 
	@Override
	 public double Payment() {
		double totalArea = landowner.computeTotalAria();
		return totalArea * taxPerSquareMetre;
		 
		 
	 }

}
