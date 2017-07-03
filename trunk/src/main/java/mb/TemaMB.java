package mb;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "TemaMB")
public class TemaMB {
	
	private String tema;
	
	public void init(){
		this.tema = "vader";
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	

}
