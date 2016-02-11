import java.awt.*;

import javax.swing.*;

public class VueKobold extends JPanel {
	
		private JTextField[] Stats;
		private JTextField Bonus;
		private JTextField Malus;
		private JTextField Sexe;
		private JTextField Alignement;
		private JTextField[] Equipement;

		public VueKobold() {
			
			this.Stats = new JTextField[7];
			this.Bonus = new JTextField();
			this.Malus = new JTextField();
			this.Equipement = new JTextField[6];
			ControleurKobold c = new ControleurKobold(this);
			
			this.setLayout(new BorderLayout());
			
			JPanel top = new JPanel();
			JPanel mid = new JPanel();
			JPanel bot = new JPanel();
			
			top.setLayout(new FlowLayout());
			mid.setLayout(new GridLayout(1,3));
			bot.setLayout(new FlowLayout());
			
			this.add(top, BorderLayout.NORTH);
			this.add(mid, BorderLayout.CENTER);
			this.add(bot, BorderLayout.SOUTH);
			
			//--- mise en place du top ---//
			
			JLabel TxtAlign = new JLabel ("Alignement : ");
			this.Alignement = new JTextField ();
			this.Alignement.setEnabled(false);
			this.Alignement.setDisabledTextColor(new Color(0,0,0));
			this.Alignement.setPreferredSize(new Dimension(120, 25));
			
			JLabel TxtSexe = new JLabel ("Sexe : ");
			this.Sexe = new JTextField ();
			this.Sexe.setEnabled(false);
			this.Sexe.setDisabledTextColor(new Color(0,0,0));
			this.Sexe.setPreferredSize(new Dimension(120, 25));
			
			top.add(TxtAlign);
			top.add(this.Alignement);
			
			top.add(TxtSexe);
			top.add(this.Sexe);
			
			//--- mise en place du mid ---//

			JPanel gauche = new JPanel();
			JPanel milieu = new JPanel();
			JPanel droite = new JPanel();
			
				//--- mise en place de Gauche ---//
				gauche.setLayout(new GridLayout(9,1));
				mid.add(gauche);
				
				JPanel stats = new JPanel();
					stats.setLayout(new FlowLayout(FlowLayout.LEFT));
					stats.add(new JLabel ("Stats :"));
				gauche.add(stats);
				
				JPanel brawn = new JPanel();
					brawn.setLayout(new FlowLayout(FlowLayout.LEFT));
					brawn.add(new JLabel("Muscles :"));
					this.Stats[0] = new JTextField("          ");
					brawn.add(this.Stats[0]);
				gauche.add(brawn);
				
				JPanel ego = new JPanel();
					ego.setLayout(new FlowLayout(FlowLayout.LEFT));
					ego.add(new JLabel("Ego :"));
					this.Stats[1] = new JTextField("          ");
					ego.add(this.Stats[1]);
				gauche.add(ego);
				
				JPanel extraneous = new JPanel();
					extraneous.setLayout(new FlowLayout(FlowLayout.LEFT));
					extraneous.add(new JLabel("Superflu :"));
					this.Stats[2] = new JTextField("          ");
					extraneous.add(this.Stats[2]);
				gauche.add(extraneous);
				
				JPanel reflexes = new JPanel();
					reflexes.setLayout(new FlowLayout(FlowLayout.LEFT));
					reflexes.add(new JLabel("Reflexes :"));
					this.Stats[3] = new JTextField("          ");
					reflexes.add(this.Stats[3]);
				gauche.add(reflexes);
				
				JPanel life = new JPanel();
					life.setLayout(new FlowLayout(FlowLayout.LEFT));
					life.add(new JLabel("Points de vie :"));
					this.Stats[4] = new JTextField("          ");
					life.add(this.Stats[4]);
				gauche.add(life);
				
				//--- Stats Calculables ---//
				
				JPanel cd = new JPanel();
					cd.setLayout(new FlowLayout(FlowLayout.LEFT));
					cd.add(new JLabel("Dés de Combat :"));
					this.Stats[5] = new JTextField("          ");
					cd.add(this.Stats[5]);
				gauche.add(cd);
				
				JPanel move = new JPanel();
					move.setLayout(new FlowLayout(FlowLayout.LEFT));
					move.add(new JLabel("Déplacement :"));
					this.Stats[6] = new JTextField("          ");
					move.add(this.Stats[6]);
				gauche.add(move);
				
				//--- Cases non modifiables ---//
				
				for (int i=0; i<=6; i++) {
					this.Stats[i].setEnabled(false);
					this.Stats[i].setDisabledTextColor(new Color(0,0,0));
				}
				
				//--- mise en place de milieu ---//
				
				milieu.setLayout(new GridLayout(8,1));
				mid.add(milieu);
				
				//--- mise en place des Bonus ---//
				
					JPanel bonus = new JPanel();
						bonus.setLayout(new FlowLayout(FlowLayout.LEFT));
						bonus.add(new JLabel ("Bonus :"));
					milieu.add(bonus);
					
					JPanel b1 = new JPanel();
						b1.setLayout(new FlowLayout(FlowLayout.LEFT));
						b1.add(new JLabel(" + "));
						JTextField t1 = new JTextField("Aboiement du Kobold  ");
						b1.add(t1);
						t1.setEnabled(false);
						t1.setDisabledTextColor(new Color(0,0,0));
					milieu.add(b1);
					
					JPanel b2 = new JPanel();
						b2.setLayout(new FlowLayout(FlowLayout.LEFT));
						b2.add(new JLabel(" + "));
						JTextField t2 = new JTextField("Sens aiguisés  ");
						b2.add(t2);
						t2.setEnabled(false);
						t2.setDisabledTextColor(new Color(0,0,0));
					milieu.add(b2);
					
					JPanel b3 = new JPanel();
						b3.setLayout(new FlowLayout(FlowLayout.LEFT));
						b3.add(new JLabel(" + "));
						this.Bonus = new JTextField("                                               ");
						b3.add(this.Bonus);
						this.Bonus.setEnabled(false);
						this.Bonus.setDisabledTextColor(new Color(0,0,0));
					milieu.add(b3);
					
				//--- mise en place des Malus ---//

					JPanel malus = new JPanel();
						malus.setLayout(new FlowLayout(FlowLayout.LEFT));
						malus.add(new JLabel ("Malus :"));
					milieu.add(malus);
					
					JPanel m1 = new JPanel();
						m1.setLayout(new FlowLayout(FlowLayout.LEFT));
						m1.add(new JLabel(" - "));
						JTextField tm1 = new JTextField("Gout de poulet  ");
						m1.add(tm1);
						tm1.setEnabled(false);
						tm1.setDisabledTextColor(new Color(0,0,0));
					milieu.add(m1);
					
					JPanel m2 = new JPanel();
						m2.setLayout(new FlowLayout(FlowLayout.LEFT));
						m2.add(new JLabel(" - "));
						JTextField tm2 = new JTextField("Sans peurs  ");
						m2.add(tm2);
						tm2.setEnabled(false);
						tm2.setDisabledTextColor(new Color(0,0,0));
					milieu.add(m2);
					
					JPanel m3 = new JPanel();
						m3.setLayout(new FlowLayout(FlowLayout.LEFT));
						m3.add(new JLabel(" - "));
						this.Malus = new JTextField("                                               ");
						m3.add(this.Malus);
						this.Malus.setEnabled(false);
						this.Malus.setDisabledTextColor(new Color(0,0,0));
					milieu.add(m3);
					
				//--- mise en place de droite ---//
					
					droite.setLayout(new GridLayout(7,1));
					mid.add(droite);
					
					JPanel equ = new JPanel();
						equ.setLayout(new FlowLayout(FlowLayout.LEFT));
						equ.add(new JLabel ("Equipement et savoirs :"));
					droite.add(equ);
					
					JPanel wep = new JPanel();
						wep.setLayout(new FlowLayout(FlowLayout.LEFT));
						wep.add(new JLabel("Arme :"));
						this.Equipement[0] = new JTextField();
						this.Equipement[0].setPreferredSize(new Dimension(330, 20));
						wep.add(this.Equipement[0]);
						this.Equipement[0].setEnabled(false);
						this.Equipement[0].setDisabledTextColor(new Color(0,0,0));
					droite.add(wep);
					
					JPanel wep2 = new JPanel();
						wep2.setLayout(new FlowLayout(FlowLayout.LEFT));
						wep2.add(new JLabel("Arme extra :"));
						this.Equipement[4] = new JTextField();
						this.Equipement[4].setPreferredSize(new Dimension(330, 20));
						wep2.add(this.Equipement[4]);
						this.Equipement[4].setEnabled(false);
						this.Equipement[4].setDisabledTextColor(new Color(0,0,0));
					droite.add(wep2);                                                                                                
					
					JPanel wep3 = new JPanel();
						wep3.setLayout(new FlowLayout(FlowLayout.LEFT));
						wep3.add(new JLabel("Arme tir :"));
						this.Equipement[5] = new JTextField();
						this.Equipement[5].setPreferredSize(new Dimension(450, 20));
						wep3.add(this.Equipement[5]);
						this.Equipement[5].setEnabled(false);
						this.Equipement[5].setDisabledTextColor(new Color(0,0,0));
					droite.add(wep3);
					
					JPanel def = new JPanel();
						def.setLayout(new FlowLayout(FlowLayout.LEFT));
						def.add(new JLabel("Armure :"));
						this.Equipement[1] = new JTextField();
						this.Equipement[1].setPreferredSize(new Dimension(400, 20));
						def.add(this.Equipement[1]);
						this.Equipement[1].setEnabled(false);
						this.Equipement[1].setDisabledTextColor(new Color(0,0,0));
					droite.add(def);
					
					JPanel obj = new JPanel();
						obj.setLayout(new FlowLayout(FlowLayout.LEFT));
						obj.add(new JLabel("Objet :"));
						this.Equipement[2] = new JTextField();
						this.Equipement[2].setPreferredSize(new Dimension(210, 20));
						obj.add(this.Equipement[2]);
						this.Equipement[2].setEnabled(false);
						this.Equipement[2].setDisabledTextColor(new Color(0,0,0));
					droite.add(obj);
					
					JPanel srt = new JPanel();
						srt.setLayout(new FlowLayout(FlowLayout.LEFT));
						srt.add(new JLabel("Sort :"));
						this.Equipement[3] = new JTextField();
						this.Equipement[3].setPreferredSize(new Dimension(300, 20));
						srt.add(this.Equipement[3]);
						this.Equipement[3].setEnabled(false);
						this.Equipement[3].setDisabledTextColor(new Color(0,0,0));
					droite.add(srt);
					
			//--- mise en place du bot ---//
			
			JButton generer = new JButton ("Générer un nouveau Kobold !");
			generer.addMouseListener(c);
			bot.add(generer);
			
		}
		
		public void afficherStats (int[] s) {
			for(int i=0; i<=6; i++) {
				this.Stats[i].setText(""+s[i]);
			}
		}
		
		public static String chiffreEnAlignement (int i) {
			switch (i)
			{
				case 1 : return ("Méchant et affamé");
				case 2 : return ("Trop affamé");
				case 3 : return ("Chaotique méchant");
				case 4 : return ("Chaotique fou");
				case 5 : return ("Trop Enervé");
				case 6 : return ("Méchament taré");
				case 7 : return ("Sage");
				case 8 : return ("Ferailleur affamé");
				case 9 : return ("Rage de VOR");
				case 10 : return ("Blonde");
			}
			return null;
		}
		
		public void afficherAlignement (int i) {
			this.Alignement.setText(chiffreEnAlignement(i));
		}
		
		public static String chiffreEnBonus (int i) {
			switch (i)
			{
				case 2 : return ("Inutile");
				case 3 : return ("Ami des annimaux");
				case 4 : return ("Obèse");
				case 5 : return ("Elu");
				case 6 : return ("Sang de troll");
				case 7 : return ("Chanceux petit fils de ...");
				case 8 : return ("Devin");
				case 9 : return ("Poulet-Garrou");
				case 10 : return ("Front de fer");
				case 11 : return ("Sourire gagnant");
				case 12 : return ("Sang de géant");
			}
			return null;
		}
		
		public void afficherBonus (int i) {
			this.Bonus.setText(chiffreEnBonus(i));
		}
		
		public static String chiffreEnMalus (int i) {
			switch (i)
			{
				case 2 : return ("Sans défauts");
				case 3 : return ("Ennemi des annimaux");
				case 4 : return ("Affamé");
				case 5 : return ("Puant");
				case 6 : return ("Kobold en chaleur");
				case 7 : return ("Goût de bébé");
				case 8 : return ("Némesis");
				case 9 : return ("Poulet-Garrou");
				case 10 : return ("Aventurophobe");
				case 11 : return ("Kobold en chaleur");
				case 12 : return ("Maudit");
			}
			return null;
		}
		
		public void afficherMalus (int i) {
			this.Malus.setText(chiffreEnMalus(i));
		}
		
		public void afficherEquipement (int[] equipement) {
			this.Equipement[0].setText(chiffreEnArme(equipement[0]));
			this.Equipement[1].setText(chiffreEnArmure(equipement));
			this.Equipement[2].setText(chiffreEnObjet(equipement));
			this.Equipement[3].setText(chiffreEnSort(equipement));
			this.Equipement[4].setText(chiffreEnArme(equipement[4]));
			this.Equipement[5].setText(chiffreEnArmeDeTir(equipement));
			
		}
		
		public String chiffreEnArme (int equipement) {
			switch (equipement)
			{
				case 2 : return ("Rien pour toi ! ");
				case 3 : return ("Baton - 1 DAM - Distrait les canidés");
				case 4 : return ("Batte - 2 DAM - Facilite 1D jets briser");
				case 5 : return ("Piolet - 1 DAM - Facilite 1D jets accrobatie");
				case 6 : return ("Couteau de cuisine - 1 DAM");
				case 7 : return ("Petite dague dorée - 1 DAM - Augmente l'aggro");
				case 8 : return ("Epée courte abimée - 2 DAM - Réduit l'aggro");
				case 9 : return ("Couverts - 1 DAM - Facilite 1D jets cuisine");
				case 10 : return ("Poele & clous en argent - 3 DAM - Facilite 2D jets cuisine");
				case 11 : return ("Chaine cloutée - 2 DAM - Vous rends imposant");
				case 12 : return ("Rat mort - 0 DAM - Malus Puant");
			}
			return null;
		}

		public String chiffreEnArmure (int[] equipement) {
			switch (equipement[1])
			{
				case 2 : return ("Sac à  dos - Peut contenir un objet");
				case 3 : return ("Chausettes - 1 Armure");
				case 4 : return ("Tee-Shirt - 2 Armure");
				case 5 : return ("Baril de bierre - 9 Armure - Jets Athlétisme & Jaut 1D plus difficile");
				case 6 : return ("Veste en cuir - 5 Armure - Augmente l'aggro");
				case 7 : return ("A poil ! - Vous provoquez l'hilarité de vos ennemis");
				case 8 : return ("Vêtements pour enfant - 1 Armure");
				case 9 : return ("Grand Pavois - 12 Armure - considéré comme un objet");
				case 10 : return ("Pantalon khaki - 1 Armure - Facilite 1D jets camouflage");
				case 11 : return ("Tennue de maille - 6 Armure - Jets nage 1D plus difficile");
				case 12 : return ("Casque casserole - 10 Armure");
			}
			return null;
		}
		
		public String chiffreEnArmeDeTir (int[] equipement) {
			switch (equipement[5])
			{
				case 1 : return ("" + (1 + (int)(Math.random()*6)) + "x - Eponge pourrie - 0 DAM");
				case 2 : return ("" + (1 + (int)(Math.random()*3)) + "x - Os brisé - 2 DAM");
				case 3 : return ("Arbalète - 3 DAM - " + (2 + (int)(Math.random()*12)) + "x Carreaux - Brise si double / triple / etc... ");
				case 4 : return ("" + (1 + (int)(Math.random()*6)) + "x - Flèchettes - 1 DAM - Fourni avec cible");
				case 5 : return ("" + (3 + (int)(Math.random()*18)) + "x - Cailloux pointus - 1 DAM");
				case 6 : return ("Catapulte - 20D6 DAM - 200 Kobolds pour la déplacer + Test difficulté 6D Force");
			}
			return null;
		}

		public String chiffreEnObjet (int[] equipement) {
			switch (equipement[2])
			{
				case 2 : return ("Objet Custom du MJ");
				case 3 : return ("Sac de gravats");
				case 4 : return ("Peluche");
				case 5 : return ("25m de corde");
				case 6 : return ("10m de corde");
				case 7 : return ("Boisson alcoolisée");
				case 8 : return ("Sac d'épices");
				case 9 : return ("" + (2 + (int)(Math.random()*12)) + "x pages du Codex de Tarbiz");
				case 10 : return ("Anneau du parle-humain");
				case 11 : return ("Coupe d'El Emmental");
				case 12 : return ("Sac magique du chasse poulet.");
			}
			return null;
		}

		public String chiffreEnSort (int[] equipement) {
			switch (equipement[3])
			{
				case 2 : return ("Invocation du terrible monstre mangeur de kobolds");
				case 3 : return ("Mur de Bierre");
				case 4 : return ("Forme Vampirique");
				case 5 : return ("Sort de somnolence");
				case 6 : return ("Sort de la poèle magique");
				case 7 : return ("Controle mental");
				case 8 : return ("Boules engluées de Tarbiz");
				case 9 : return ("Colonne enflammée de Tarbiz");
				case 10 : return ("Invocation de poulet");
				case 11 : return ("le POOF !");
				case 12 : return ("Sort des horreurs inexplicables");
			}
			return null;
		}
		
		public void afficherSexe (int i) {
			this.Sexe.setText(chiffreEnSexe(i));
		}
		
		public String chiffreEnSexe (int s) {
			switch (s)
			{
				case 1 : return ("Femelle");
				case 2 : return ("Male");
			}
			return null;
		}
}
