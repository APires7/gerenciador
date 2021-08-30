/**
 * 
 */
package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author allan
 *
 */
public class Banco {

	private static List<Empresa> listaEmpresa = new ArrayList<>();
	
	/**
	 * Adiciona na lista o objeto empresa
	 * 
	 * @param empresa
	 */
	public void adiciona(Empresa empresa) {
		System.out.println("Adicionando a empresa " + empresa.getNome());
		listaEmpresa.add(empresa);
	}

	/**
	 * Recupera a lista de empresas
	 * 
	 * @return
	 */
	public List<Empresa> getEmpresas(){
		return listaEmpresa;
	}
}
