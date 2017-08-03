package br.com.relatorio.mb;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.relatorio.bean.Pessoa;
import br.com.relatorio.controle.esp.PessoaBCI;
import br.com.relatorio.controle.impl.PessoaBC;
import br.com.relatorio.util.ReportUtil;
import net.sf.jasperreports.engine.JRException;

@ManagedBean(name = "PessoaMB")
@ViewScoped
public class PessoaMB {

	private Pessoa bean;
	private List<Pessoa> lista;
	private PessoaBCI controle = new PessoaBC();

	public Pessoa getBean() {
		return bean;
	}

	public void setBean(Pessoa bean) {
		this.bean = bean;
	}

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	@PostConstruct
	public void init() {
		this.bean = new Pessoa();
		this.lista = this.controle.select();
	}
	
	public void gravar() {
		this.controle.insert(this.bean);
		this.init();

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Ok", "Pessoa cadastrada com sucesso! "));
	}
	
	public void gerarRelatorio() {
		
		Map<String, Object> parametros = new LinkedHashMap<String, Object>();
		
		parametros.put("nome_usuario", bean.getNome());
		parametros.put("cpf_usuario", bean.getCpf().toString());
		parametros.put("n_contrato", bean.getRg().toString());
		
		try {
			ReportUtil.exportarPDF(parametros, null, "relatorio_1.jasper");
		} catch (JRException | IOException e) {
			e.printStackTrace();
		}
		this.bean = new Pessoa();
	}
}
