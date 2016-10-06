
public class Mission {
	private String objetivo;
	private String localisacao;
	private String resumo;
	private Integer recompensa;
	public boolean validar(){		
		return this.getObjetivo() != null &&
				this.getLocalisacao() != null &&
				this.getResumo() != null &&
				this.getRecompensa() != null;
	}

	public String getLocalisacao() {
		return localisacao;
	}

	public void setLocalisacao(String localisacao) {
		this.localisacao = localisacao;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	
	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {  
		if (objetivo.length()>0){
			this.objetivo = objetivo;
		}
	}

	public Integer getRecompensa() {
		return recompensa;
	}

	public void setRecompensa(Integer recompensa) {
		if (recompensa >=0){
			this.recompensa = recompensa;
		}
		
	}
	
	
}
