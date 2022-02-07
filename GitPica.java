import java.text.DecimalFormat;
import java.util.Scanner;

public class GitPica {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
	    Scanner scan = new Scanner(System.in);
	    
	  //Main�gie
	    String vards;
	    char miklasVeids;
	    String mikla;
	    int lielums;
	    char picasVeids;
	    String pica;
	    double maksa = 0.0;
	    final double pvnLikme = 0.08;
	    double pvn;
	    double summa;
	    double kopSumma;
	    int picasSastavdalas = 0;
	    int picasSastavdalas2 =0;
	    int picasSastavdalas3;
	    String sastavdalas = "Siers";
	    
	    System.out.println("V�rds un uzv�rds: ");
	    vards = scan.nextLine();

	  //Pieg�de
	    String adrese;
	    double atalums = 0;
	    double piegadesMaksa = 0;
	    System.out.println("L�dzu ievadiet adresi:");
	    adrese = scan.nextLine();
	    System.out.println("L�dzu ievadiet att�lumu kilometros no pic�rijas(0 ja sa�em uz vietas):");
	    atalums = scan.nextDouble();
	    if (atalums == 0) {
	    	piegadesMaksa = 0;
	        System.out.println("Nav j�maks� par pieg�di.");
	    } else if (atalums > 1) {
	    	piegadesMaksa = ((atalums * 0.5) + 2);
	        System.out.println("J�su pieg�des maksa: $" + df.format(piegadesMaksa));
	    } else if (atalums > 0) {
	    	piegadesMaksa = 2.00;
	        System.out.println("J�su pieg�des maksa: $" + df.format(piegadesMaksa));
	    }
	    
	  //Pica(lielums)
	    System.out.print("Cik lielu picu v�laties(lielums cm)? (24, 30, 40, or 50) ");
	    lielums = scan.nextInt();
	    if (lielums == 20) {
	        maksa = 7.10;
	    } else if (lielums == 30) {
	    	maksa = 8.35;
	    } else if (lielums == 40) {
	    	maksa = 12.00;
	    } else if (lielums == 50) {
	    	maksa = 17.10;
	    } else if (lielums != 24 && lielums != 30 && lielums != 40 && lielums != 50) {
	        System.out.println("Mums nav �ada lieluma picas, autom�tiski izv�l�ta 30cm.");
	        maksa = 8.35;
	    }
	    scan.nextLine();

	    
	    //Pica(m�kla)
	    System.out.print("K�da veida m�klu v�laties? (B)Biez�, (C)Klasisk�, vai (K)Krauk���g� (Ievadi B, C, vai K,): ");
	    miklasVeids = scan.nextLine().charAt(0);

	    if (miklasVeids == 'B' || miklasVeids == 'b') {
	    	mikla = "Biez�";}
	     else if (miklasVeids == 'C' || miklasVeids == 'c') {
	    	mikla = "Klasisk�";}
	     else if (miklasVeids == 'K' || miklasVeids == 'k') {
	    	mikla = "Krauk���g�";}
	     else if (miklasVeids != 'B' && miklasVeids != 'b' && miklasVeids != 'C' && miklasVeids != 'c' && miklasVeids != 'K' && miklasVeids != 'k') {
	        System.out.println("Mums nav pieejama ��da veida m�kla, j�su m�kla b�s izv�l�ta, k� Klasisk�. ");}
	        mikla = "Klasisk�";
	    
	    mikla = "Klasisk�";
	    
	  //Pica
	    System.out.println("Visas picas ir ar sieru.");
	    System.out.print("K�da veida picu v�laties? (S)Studentu, (M)Margarita, (P)Pepperoni, (H)Havaju, (Q)BBQ lielopa vai (G)Grie�u (Ievadi S, M, P, H, Q vai G): ");
	    picasVeids = scan.nextLine().charAt(0);

	    if (picasVeids == 'S' || picasVeids == 's') {
	    	pica = "Studentu";
	    } else if (picasVeids == 'M' || picasVeids == 'm') {
	    	pica = "Margarita";
	    } else if (picasVeids == 'P' || picasVeids == 'p') {
	    	pica = "Pepperoni";
	    } else if (picasVeids == 'H' || picasVeids == 'h') {
	    	pica = "Havaju";
	    }else if (picasVeids == 'Q' || picasVeids == 'q') {
	    	pica = "BBQ lielopa";
	    }else if (picasVeids == 'G' || picasVeids == 'g') {
	    	pica = "Grie�u";
	    } else if (picasVeids != 'S' && picasVeids != 's' || picasVeids != 'M' && picasVeids != 'm' || picasVeids != 'P' && picasVeids != 'p' || picasVeids != 'H' && picasVeids != 'h' || picasVeids != 'Q' && picasVeids != 'q' || picasVeids != 'G' && picasVeids != 'g') {
	    	System.out.println("Mums nav pieejama ��da veida pica, j�su pica b�s izv�l�ta, k� Studentu. ");
	    	pica = "Studentu";
	    }
	    pica = "Studentu";
	    
	    System.out.println("Papildu piedevas maks� 1,25 eiro katrs, izv�lieties k�du no pepperoni vai c�si�us." );

	 // Pepperoni
	 System.out.println("Vai gribi pepperoni? (J/N)" );
	 picasSastavdalas = scan.nextLine().charAt(0);
	 if (picasSastavdalas == 'J' || picasSastavdalas == 'j' ){
		 picasSastavdalas = 1;
		 sastavdalas = sastavdalas + " un Pepperoni";}
	 else{
		 picasSastavdalas = 0;
	 }

	 //Sausage
	 System.out.println("Vai gribi c�si�us? (J/N)" );
	 picasSastavdalas2 = scan.nextLine().charAt(0);
	 if (picasSastavdalas2 == 'J' || picasSastavdalas2 == 'j' ){
		 picasSastavdalas2 = 1;
		 sastavdalas = sastavdalas + " un c�si�i";}
	 else{
		 picasSastavdalas2 = 0;} 


	 picasSastavdalas3 = (picasSastavdalas) + (picasSastavdalas2);
	    
	    
	 // Apr��ins
	    System.out.println("Picas cena: "+maksa);
	    System.out.println("Pieg�des maksa: "+piegadesMaksa);
	    System.out.println("Picas sast�vda�as: "+picasSastavdalas3);
	    System.out.println("\n");
	    summa = (maksa) + (picasSastavdalas3 * 1.25) + (piegadesMaksa);
	    //summa = (maksa) + (piegadesMaksa);
	    pvn = summa * pvnLikme;
	    kopSumma = summa * (1 + pvnLikme);

	    // Izvade
	    System.out.println(vards + ", te ir j�su pas�tijums:");
	    System.out.println(lielums + " cm pica");
	    System.out.println(mikla + ", " + pica);
	    System.out.println("Cena: $" + df.format(summa));
	    System.out.println("PVN: $" + df.format(pvn));
	    System.out.println("Kopsumma: $" + df.format(kopSumma));
	    System.out.print("\n");
	    System.out.println("Pieg�des vieta: "+adrese);
	    
	    scan.close();
	}
}
