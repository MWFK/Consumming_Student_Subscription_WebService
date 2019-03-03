package tn.client;

import tn.esprit.ejb.ScolaritePorType;
import tn.esprit.ejb.ScolariteService;

public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScolariteService service = new ScolariteService();
		ScolaritePorType porType = service.getScolaritePort();
		float a = porType.calculerFraisInscription(12345);
		System.out.println(a);
		
	}

}
