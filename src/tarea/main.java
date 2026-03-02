package tarea;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("----------------------------------------------------");	
	String[] ep1= {"El inicio","El examen chunin","La batalla Final"};
	String[] ep2= {"Goku","El torneo de poder"};
	
	Anime a1= new Anime("Naruto","Masculino",12);
	Anime a2= new Anime("Son goku","Masculino",120);
	Televisor t1 = new Televisor("Samsung",55,"OLED");
	Televisor t2 = new Televisor("LG",60,"FULL HD");
	Instrumento i1= new Instrumento("Piano","Madera","teclado");
	Instrumento i2= new Instrumento("Guitarra","Madera","cuerda");
	System.out.println(a1);
	System.out.println(a2);
	System.out.println("----------------------------------------------------");
	System.out.println(t1);
	System.out.println(t2);
	System.out.println("----------------------------------------------------");
	System.out.println(i1);
	System.out.println(i2);
	System.out.println("----------------------------------------------------");
	
	
	
	
	
	}

}
