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
	}

}
