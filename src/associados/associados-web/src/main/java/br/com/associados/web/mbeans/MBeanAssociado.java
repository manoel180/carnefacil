package br.com.associados.web.mbeans;

import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.associados.web.dto.Associado;
import br.com.associados.web.dto.Usuario;
import br.com.associados.web.util.Connection;
import br.com.associados.web.util.Servicos;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@ManagedBean(name="mBeanAssociado")
@RequestScoped
public class MBeanAssociado extends mBeanGerneric{
	
	private Associado associado;
	
	public List<Usuario> getMessage() {
		Type listType = new TypeToken<List<Usuario>>() {}.getType();
		Gson gson = new Gson();
		List<Usuario> list = gson.fromJson(Connection.getConnection(Servicos.USUARIOS), listType);
		return list;
	}
	 
	@PostConstruct
	public void init() {
		associado = new Associado();
	}

	@Override
	public void salvar() {
		
	}

	@Override
	public void listar() {
		
	}

	@Override
	public void excluir() {
		
	}


	public Associado getAssociado() {
		return associado;
	}


	public void setAssociado(Associado associado) {
		this.associado = associado;
	}

}