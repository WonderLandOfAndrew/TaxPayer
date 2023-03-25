package TaxPayer;

import java.util.ArrayList;

import LandOwner.Land;

public class Mayor {
	private ArrayList<TaxPayer> taxPayer = new ArrayList<TaxPayer>();

	public boolean add(TaxPayer e) {
		return taxPayer.add(e);
	}

	public TaxPayer remove(int index) {
		return taxPayer.remove(index);
	}
	

}
