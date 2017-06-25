package br.com.full.mb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.full.bean.Cliente;
import br.com.full.bean.ClientePessoaFisica;
import br.com.full.bean.ClientePessoaJuridica;
import br.com.full.bean.Formato;
import br.com.full.bean.OS;
import br.com.full.bean.Papel;
import br.com.full.bean.Vendedor;
import br.com.full.controle.ClientePessoaFisicaBCI;
import br.com.full.controle.ClientePessoaJuridicaBCI;
import br.com.full.controle.FormatoBCI;
import br.com.full.controle.OSBCI;
import br.com.full.controle.PapelBCI;
import br.com.full.controle.VendedorBCI;
import br.com.full.util.ReportUtil;
import net.sf.jasperreports.engine.JRException;

@ManagedBean(name = "OsMB")
@Scope("view")
public class OsMB extends SpringBeanAutowiringSupport {

	private OS bean;
	@Autowired
	private OSBCI controle;
	@Autowired
	private VendedorBCI vendedorControle;
	@Autowired
	private ClientePessoaFisicaBCI clientePf;
	@Autowired
	private ClientePessoaJuridicaBCI clientePj;
	@Autowired
	private PapelBCI papelControle;
	@Autowired
	private FormatoBCI formatoControle;

	private List<Vendedor> vendedores;
	private List<ClientePessoaFisica> listClientesPf;
	private List<ClientePessoaJuridica> listClientesPj;
	private List<Cliente> clientes;
	private List<Papel> papeis;
	private List<Formato> formatos;
	private List<OS> oss;
	private Vendedor vendedor;

	@PostConstruct
	public void init() {

		oss = controle.select();
		vendedores = vendedorControle.select();
		papeis = papelControle.select();
		formatos = formatoControle.select();
		listClientesPf = clientePf.select();
		listClientesPj = clientePj.select();
		clientes = new ArrayList<Cliente>();

		for (Cliente cliente : listClientesPj) {
			clientes.add(cliente);
		}

		for (Cliente cliente : listClientesPf) {
			clientes.add(cliente);
		}
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public OS getBean() {
		return bean;
	}

	public void setBean(OS bean) {
		this.bean = bean;
	}

	public ClientePessoaFisicaBCI getClientePf() {
		return clientePf;
	}

	public void setClientePf(ClientePessoaFisicaBCI clientePf) {
		this.clientePf = clientePf;
	}

	public ClientePessoaJuridicaBCI getClientePj() {
		return clientePj;
	}

	public void setClientePj(ClientePessoaJuridicaBCI clientePj) {
		this.clientePj = clientePj;
	}

	public List<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public List<ClientePessoaFisica> getListClientesPf() {
		return listClientesPf;
	}

	public void setListClientesPf(List<ClientePessoaFisica> listClientesPf) {
		this.listClientesPf = listClientesPf;
	}

	public List<ClientePessoaJuridica> getListClientesPj() {
		return listClientesPj;
	}

	public void setListClientesPj(List<ClientePessoaJuridica> listClientesPj) {
		this.listClientesPj = listClientesPj;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Papel> getPapeis() {
		return papeis;
	}

	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}

	public List<Formato> getFormatos() {
		return formatos;
	}

	public void setFormatos(List<Formato> formatos) {
		this.formatos = formatos;
	}

	public List<OS> getOss() {
		return oss;
	}

	public void setOss(List<OS> oss) {
		this.oss = oss;
	}

	public void exportarPDF() throws JRException, IOException {
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("fichaCadastro", true);
		ReportUtil.exportarPDF(parametros, null, "ficha.jasper");
	}

}
