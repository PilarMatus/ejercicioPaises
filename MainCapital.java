package ArregloJava;
import java.util.Scanner;
import java.util.ArrayList;
public class MainCapital {


	public static void main(String[] args) {
		ArrayList<ClasePaisCapital> capitalCity = new ArrayList<ClasePaisCapital>();
		Scanner teclado = new Scanner(System.in);
		
		String pais;
		String capital;
		int paises;
		String paisBuscado;
	   
		 
		 System.out.println("ingrese cantidad de paises");
		 paises=teclado.nextInt();
		 
		 int i=0;
		 ClasePaisCapital pc= null;
		 
		for (int j = 0; j < paises; j++) {
			
		
			  pc= new ClasePaisCapital();
			
			 System.out.println("Digite pais "+(i+1)+" :");
			 pais=teclado.next();
			 System.out.println("Ingrese capital:");
			 capital=teclado.next();
			 
			 
			
			 pc.setCapital(capital);
			 pc.setPais(pais);
			 
				 System.out.println("Pais: "+pc.getPais());
				 System.out.println("Capital: "+pc.getCapital());
				 
				 capitalCity.add(pc);
	             i++;
	}	
		
		System.out.println("El tamaño total del arreglo: " +capitalCity.size());
		for (int i1=0;i1<capitalCity.size();i1++) {
		
			System.out.println("["+i1+"]" +capitalCity.get(i1).getPais()+", "+capitalCity.get(i1).getCapital());
			
	     }	
			
		 
}
}
