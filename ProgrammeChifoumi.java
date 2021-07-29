package fr.isika.cda.chifoumi;

import java.util.Scanner;

public class ProgrammeChifoumi {
V4
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String reponseJ1;
		String reponseJ2;
		String nomJ1;
		String nomJ2;
		String choix;
		String f="f";
		String c="c";
		String p="p";
		int scoreJ1 = 0, scoreJ2 = 0;
		boolean again = true;
		
		System.out.println("J1 quel est votre nom ?");
		nomJ1 = scanner.nextLine();
		System.out.println("J2 quel est votre nom ?");
		nomJ2 = scanner.nextLine();
		
		while (again) {
			System.out.println(nomJ1 + " quel est votre choix : p,f ou c?");
			reponseJ1 = scanner.nextLine();
			System.out.println(nomJ2 + " quel est votre choix : p,f ou c?");
			reponseJ2 = scanner.nextLine();

			if (reponseJ1.equals(reponseJ2)) 
				System.out.println(nomJ1+" et "+ nomJ2 + " sont à égalité");

			else if (reponseJ1.equals(c) & reponseJ2.equals(f) | reponseJ1.equals(f) & reponseJ2.equals(p)| reponseJ1.equals(p) & reponseJ2.equals(c))
				{System.out.println(nomJ1 + " gagne");
				scoreJ1=scoreJ1+1;}
				
			else
				{System.out.println(nomJ2 + " gagne");
				scoreJ2=scoreJ2+1;}
				
			System.out.println("Le score de " + nomJ1 + " est : " + scoreJ1 + " et celui de " + nomJ2 + " est : " + scoreJ2);
			System.out.println("Voulez vous rejouer 'oui ou non'");
			choix=scanner.nextLine();
			if(choix.toLowerCase().equals("non")) {
				again = false;
				break;
			}
			
		}
		
		System.out.println("Le score final est -> " + nomJ1 + " : " + scoreJ1 + " et " + nomJ2 + " : " + scoreJ2 );
			
		scanner.close();
	
	}
}

