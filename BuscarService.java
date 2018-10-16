package service;
import java.util.ArrayList;

import model.Pais;
import dao.PaisDAO;

public class BuscarService {
	PaisDAO dao;
	
	public BuscarService(){
		dao = new PaisDAO();
	}
	public ArrayList<Pais> listarPais(){
		return dao.listarPais();
	}
	public ArrayList<Pais> listarPais(String chave){
		return dao.listarPais(chave);
	}

}


