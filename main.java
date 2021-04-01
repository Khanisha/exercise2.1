package exercise2_1;

public class main {

	public static void main(String[] args) {
		Laptop Acer = new Laptop();
		Acer.brand = "Acer"; 
		Acer.model = "Aspire5"; 
		Acer.price = 3000;
		 System.out.println("Brand :"+ Acer.brand);
		 System.out.println("Model :"+ Acer.model);
		 System.out.println("Price(RM) :"+ Acer.price);
		 Acer.gaming();
		 Acer.work();
		 Acer.production();
		 System.out.println();
		 
		 Laptop Asus = new Laptop();
			Asus.brand = "Asus"; 
			Asus.model = "ROG Strix"; 
			Asus.price = 3500;
			 System.out.println("Brand :"+ Asus.brand);
			 System.out.println("Model :"+ Asus.model);
			 System.out.println("Price(RM) :"+ Asus.price);
			 Asus.gaming();
			 Asus.work();
			 Asus.production();
			 System.out.println();
			 
		Watch Theodoras = new Watch();
		Theodoras.brand = "Theodora's";
		Theodoras.colour = "Bluish-Green";
		Theodoras.strap = "Black Milanese";
		System.out.println("Brand :"+ Theodoras.brand);
		System.out.println("Colour :"+ Theodoras.colour);
		System.out.println("Strap :"+ Theodoras.strap);
		Theodoras.Analogue();
		Theodoras.Digital();
		Theodoras.Smart();
		System.out.println();
		
		Watch Ferrari = new Watch();
		Ferrari.brand = "Ferrari";
		Ferrari.colour = "Black";
		Ferrari.strap = "Rubber";
		System.out.println("Brand :"+ Ferrari.brand);
		System.out.println("Colour :"+ Ferrari.colour);
		System.out.println("Strap :"+ Ferrari.strap);
		Ferrari.Analogue();
		Ferrari.Digital();
		Ferrari.Smart();
	}

}
