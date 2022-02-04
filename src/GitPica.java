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
	}

}
