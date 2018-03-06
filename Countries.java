package bass;

public class Countries {
	  String country;
	  int population;
	int area;
	
	
	
	public Countries(String country2,int population2,int area2) {
		// TODO Auto-generated constructor stub

	country=country2;
	population=population2;
	area=area2;
	
	}
	public void comparePopulation(Countries p1, Countries p2) {

	if (p1.population>p2.population) {
	System.out.println(p1.country+ "has the larger population");
	
	
	
	
	}else {
	
	System.out.println(p2.country + "has the larger poulation");
	
	}

}
}