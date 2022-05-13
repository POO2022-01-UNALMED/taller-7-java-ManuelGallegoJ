package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public String[] getLetras() {
		return this.letras;
	}
	
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public String interpretacion(){
		return this.interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return this.letras.length;
	}
	
	public String toString() {
		String alfabeto = new String();
		for(String letra : this.letras) {
			if(letra != this.letras[this.letras.length - 1]) {
				alfabeto += letra + ", ";
			} else {
				alfabeto += letra;
			}
		}
		return alfabeto;
	}
}
