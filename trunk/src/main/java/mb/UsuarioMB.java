package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import bean.Usuario;
import controle.esp.UsuarioBCI;
import controle.impl.UsuarioBC;

@ManagedBean(name = "UsuarioMB")
@ViewScoped
public class UsuarioMB {

		private UsuarioBCI controle;
		private Usuario bean;
		private List<Usuario> list;
		
		public Usuario getBean() {
			return bean;
		}

		public void setBean(Usuario bean) {
			this.bean = bean;
		}

		public List<Usuario> getList() {
			return list;
		}

		public void setList(List<Usuario> list) {
			this.list = list;
		}

		@PostConstruct
		public void init() {
			this.controle = new UsuarioBC();
			this.bean = new Usuario();
			this.list = controle.select();

		}

		public void gravar() {
			
			this.controle.insert(this.bean);
			this.bean = new Usuario();
			this.list = controle.select();
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage("Ok", "Usuario inserido com sucesso! "));		
		}
}