import javax.swing.JTextField;


public class ModeleKobold extends java.lang.Object {
	
	private int Alignement;
	private int Bonus;
	private int Malus;
	private int Sexe;
	private int[] Stats;
	private int[] Equipement;
	
	public ModeleKobold () {
		genKobold();
	}
	
	public void genKobold() {
		
		this.Alignement = 0;
		this.Bonus = 0;
		this.Malus = 0;
		this.Stats = new int[] {0,0,0,0,0,0,0};
		this.Equipement = new int[] {0,0,0,0,0,0};
		
		genererAlignement();
		genererEquipement();
		genererBonus();
		genererMalus();
		genererStats();
		genererSexe();
	}
	
	public void genererAlignement () {
		
		int min = 1;
		int max = 10;
		
		this.Alignement = min + (int)(Math.random()*max);
		
		switch (this.Alignement) {
			case 1 : 
				Stats[1] += 2;
				break;
			case 2 : 
				Stats[4] += 2;
				break;
			case 5 : 
				Stats[0] += 2;
				Stats[1] -= 2;
			case 6 : 
				Stats[1] -= 1;
				break;
			case 7 : 
				Stats[1] += (1 + (int)(Math.random()*6));
				break;
			case 9 : 
				Stats[0] += 4;
				break;
			case 10 : 
				Stats[1] -= 3;
				break;
		}
	}
	
	public void genererBonus () {
		
		int min = 2;
		int max = 11;
		
		this.Bonus = min + (int)(Math.random()*max);
		
		switch (this.Bonus) {
		case 4 : 
			Stats[4] += 1 + (int)(Math.random()*6);
			break;
		case 10 : 
			Stats[0] += 2;
			Stats[4] += 2;
			break;
		}
	}
	
	public void genererMalus () {
		
		int min = 2;
		int max = 11;
		
		this.Malus = min + (int)(Math.random()*max);	
		
	}
	
	public void genererStats () {
		
		for(int i=0; i<5; i++) {
			
			int min = 2;
			int max = 12;
			
			this.Stats[i] += min + (int)(Math.random()*max);
		}
		
		// Calcul ds de combats avec Rflexes //
		
		if (Stats[3] <= 5)
			Stats[5] = 1;
		else if (Stats[3] <= 9)
			Stats[5] = 2;
		else if (Stats[3] <= 14)
			Stats[5] = 3;
		else if (Stats[3] <= 18)
			Stats[5] = 4;
		else if (Stats[3] <= 22)
			Stats[5] = 5;
		else { Stats[5] = 6;}
		
		// Calcul move avec Extraneous //
		
		if (Stats[2] <= 5)
			Stats[6] = 1;
		else if (Stats[2] <= 9)
			Stats[6] = 2;
		else if (Stats[2] <= 14)
			Stats[6] = 3;
		else if (Stats[2] <= 18)
			Stats[6] = 4;
		else if (Stats[2] <= 22)
			Stats[6] = 5;
		else { Stats[6] = 6;}
		
	}
	
	public void genererEquipement () {
		
		for(int i=0; i<5; i++) {
			
			int min = 2;
			int max = 11;
			
			this.Equipement[i] += min + (int)(Math.random()*max);
		}
		
		this.Equipement[5] += 1 + (int)(Math.random()*6);
	}
	
	public int[] getTabStats () {
		return(this.Stats);
		
	}
	
	public int getAlignement () {
		return(this.Alignement);
	}
	
	public int getBonus () {
		return(this.Bonus);
	}
	
	public int getMalus () {
		return(this.Malus);
	}
	
	public int[] getTabEquipement () {
		return(this.Equipement);
	}
	
	public int getSexe () {
		return(this.Sexe);
	}
	
	public void genererSexe () {

		this.Sexe = 1 + (int)(Math.random()*2);	
		
	}
}
