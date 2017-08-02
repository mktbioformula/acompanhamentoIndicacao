package mb;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

import net.sf.jasperreports.engine.JRException;
import util.ReportUtil;

@ManagedBean(name = "RelatorioMB")
public class RelatorioMB {


	
	
	
	public void gerarRelatorio(){
		
		
		Map<String, Object> parametros = new LinkedHashMap<String, Object>();
		
		parametros.put("nome_usuario", "João das Neves");
		parametros.put("cpf_usuario", "789456456-62");
		parametros.put("n_contrato", "665985-12");
		
		try {
			ReportUtil.exportarPDF(parametros, null, "relatorio_1.jasper");
		} catch (JRException | IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
