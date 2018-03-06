package bass;

public class Countrytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Countries country1=new Countries("Italy",3000,2500);
	System.out.println(country1.population);
	
	Countries country2=new Countries("Spain",4000,1000);
	
	System.out.println(country2.population);
	country1.comparePopulation(country1,country2);
	
}
}


