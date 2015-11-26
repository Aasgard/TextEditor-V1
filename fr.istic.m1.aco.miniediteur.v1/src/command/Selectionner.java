package command;

import invoker.IHM;
import receiver.MoteurEdition;

public class Selectionner extends Command {

	public Selectionner(MoteurEdition moteure, IHM newihm){
		this.me = moteure;
		this.ihm = newihm;
	}
	
	public void execute() {
		int debut = ihm.getDebutSelection();
		int fin = ihm.getLongueurSelection();
		System.out.println("Ceci est la commande : " + debut);
		me.selectionner(debut, fin);
	}

}
