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
	}

}
