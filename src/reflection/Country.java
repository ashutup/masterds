package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Country {
	
	private String name;
	private String population;
	private String gdp;
	private String PM;
	private String president;
	
	public Country(String name,String gdp,String population,String pm,String president) {
		this.name = name;
		this.PM = pm;
		this.president = president;
		this.gdp = gdp;
		this.population = population;
	}
	
	public Country() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Class c = Country.class;
		
		try {
			Method method = c.getDeclaredMethod("printSomething", null);
			method.invoke(new Country(), null);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	private void printSomething(){
		System.out.println("Printing Something ...................................");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getGdp() {
		return gdp;
	}

	public void setGdp(String gdp) {
		this.gdp = gdp;
	}

	public String getPM() {
		return PM;
	}

	public void setPM(String pM) {
		PM = pM;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}



	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population
				+ ", gdp=" + gdp + ", PM=" + PM + ", president=" + president
				+ "]";
	}

}
