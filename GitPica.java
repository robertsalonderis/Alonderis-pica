import java.text.DecimalFormat;
import java.util.Scanner;

public class GitPica {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
	    Scanner scan = new Scanner(System.in);
	    
	  //Mainîgie
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
	    
	    System.out.println("Vârds un uzvârds: ");
	    vards = scan.nextLine();

	  //Piegâde
	    String adrese;
	    double atalums = 0;
	    double piegadesMaksa = 0;
	    System.out.println("Lûdzu ievadiet adresi:");
	    adrese = scan.nextLine();
	    System.out.println("Lûdzu ievadiet attâlumu kilometros no picçrijas(0 ja saòem uz vietas):");
	    atalums = scan.nextDouble();
	    if (atalums == 0) {
	    	piegadesMaksa = 0;
	        System.out.println("Nav jâmaksâ par piegâdi.");
	    } else if (atalums > 1) {
	    	piegadesMaksa = ((atalums * 0.5) + 2);
	        System.out.println("Jûsu piegâdes maksa: $" + df.format(piegadesMaksa));
	    } else if (atalums > 0) {
	    	piegadesMaksa = 2.00;
	        System.out.println("Jûsu piegâdes maksa: $" + df.format(piegadesMaksa));
	    }
	    
	  //Pica(lielums)
	    System.out.print("Cik lielu picu vçlaties(lielums cm)? (24, 30, 40, or 50) ");
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
	        System.out.println("Mums nav ðada lieluma picas, automâtiski izvçlçta 30cm.");
	        maksa = 8.35;
	    }
	    scan.nextLine();

	    
	    //Pica(mîkla)
	    System.out.print("Kâda veida mîklu vçlaties? (B)Biezâ, (C)Klasiskâ, vai (K)Kraukðíîgâ (Ievadi B, C, vai K,): ");
	    miklasVeids = scan.nextLine().charAt(0);

	    if (miklasVeids == 'B' || miklasVeids == 'b') {
	    	mikla = "Biezâ";}
	     else if (miklasVeids == 'C' || miklasVeids == 'c') {
	    	mikla = "Klasiskâ";}
	     else if (miklasVeids == 'K' || miklasVeids == 'k') {
	    	mikla = "Kraukðíîgâ";}
	     else if (miklasVeids != 'B' && miklasVeids != 'b' && miklasVeids != 'C' && miklasVeids != 'c' && miklasVeids != 'K' && miklasVeids != 'k') {
	        System.out.println("Mums nav pieejama ðâda veida mîkla, jûsu mîkla bûs izvçlçta, kâ Klasiskâ. ");}
	        mikla = "Klasiskâ";
	    
	    mikla = "Klasiskâ";
	    
	  //Pica
	    System.out.println("Visas picas ir ar sieru.");
	    System.out.print("Kâda veida picu vçlaties? (S)Studentu, (M)Margarita, (P)Pepperoni, (H)Havaju, (Q)BBQ lielopa vai (G)Grieíu (Ievadi S, M, P, H, Q vai G): ");
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
	    	pica = "Grieíu";
	    } else if (picasVeids != 'S' && picasVeids != 's' || picasVeids != 'M' && picasVeids != 'm' || picasVeids != 'P' && picasVeids != 'p' || picasVeids != 'H' && picasVeids != 'h' || picasVeids != 'Q' && picasVeids != 'q' || picasVeids != 'G' && picasVeids != 'g') {
	    	System.out.println("Mums nav pieejama ðâda veida pica, jûsu pica bûs izvçlçta, kâ Studentu. ");
	    	pica = "Studentu";
	    }
	    pica = "Studentu";
	    
	    System.out.println("Papildu piedevas maksâ 1,25 eiro katrs, izvçlieties kâdu no pepperoni vai cîsiòus." );

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
	 System.out.println("Vai gribi cîsiòus? (J/N)" );
	 picasSastavdalas2 = scan.nextLine().charAt(0);
	 if (picasSastavdalas2 == 'J' || picasSastavdalas2 == 'j' ){
		 picasSastavdalas2 = 1;
		 sastavdalas = sastavdalas + " un cîsiòi";}
	 else{
		 picasSastavdalas2 = 0;} 


	 picasSastavdalas3 = (picasSastavdalas) + (picasSastavdalas2);
	    
	    
	 // Aprçíins
	    System.out.println("Picas cena: "+maksa);
	    System.out.println("Piegâdes maksa: "+piegadesMaksa);
	    System.out.println("Picas sastâvdaïas: "+picasSastavdalas3);
	    System.out.println("\n");
	    summa = (maksa) + (picasSastavdalas3 * 1.25) + (piegadesMaksa);
	    //summa = (maksa) + (piegadesMaksa);
	    pvn = summa * pvnLikme;
	    kopSumma = summa * (1 + pvnLikme);

	    // Izvade
	    System.out.println(vards + ", te ir jûsu pasûtijums:");
	    System.out.println(lielums + " cm pica");
	    System.out.println(mikla + ", " + pica);
	    System.out.println("Cena: $" + df.format(summa));
	    System.out.println("PVN: $" + df.format(pvn));
	    System.out.println("Kopsumma: $" + df.format(kopSumma));
	    System.out.print("\n");
	    System.out.println("Piegâdes vieta: "+adrese);
	    
	    scan.close();
	}
}
