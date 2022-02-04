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
	}

}
