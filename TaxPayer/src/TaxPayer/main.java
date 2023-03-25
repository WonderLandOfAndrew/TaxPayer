package TaxPayer;

import LandOwner.Circle;
import LandOwner.Land;
import LandOwner.LandOwner;
import LandOwner.Rectangle;
import LandOwner.Square;
import LandOwner.Triangle;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LandOwner owner = new LandOwner();
		LandOwner owner2 = new LandOwner();
		TaxPayer Stiv = new TaxPayer(owner);
		TaxPayer Mike = new TaxPayer(owner2);
		Land rectangle = new Rectangle(2, 4);
		Land circle = new Circle(3.14,2);
		Land square = new Square(2);
		Land triangle = new Triangle(6, 4, 2, 1);
		Mayor mayor = new Mayor();
		owner.add(rectangle);
		owner.add(circle);
		mayor.add(Stiv);
		owner2.add(circle);
		owner2.add(triangle);
		mayor.add(Mike);
		System.out.println(Stiv.Payment()+" Bani");
		System.out.println(Mike.Payment()+" Bani");
		
		

	}

}
