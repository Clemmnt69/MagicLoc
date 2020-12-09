package client.impl;

import java.util.ArrayList;

import client.classe.ClientParticulier;

public interface ClientParticulierInterface {
	
	public int pointDeRisque(int age);
	public ArrayList<ClientParticulier> RecupererListeParticulier();
}
