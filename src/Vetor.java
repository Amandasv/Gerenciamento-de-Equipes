
public class Vetor <V> {
	@SuppressWarnings("unchecked")
	private V[] dados = (V[]) new Object[5];
	private int numeroElementos = 0;
	
	public void append(V valor){
		aumentaEspaco();
		dados[numeroElementos] = valor;
		numeroElementos++;
	}

	private void aumentaEspaco() {
		if(numeroElementos >= dados.length){
			@SuppressWarnings("unchecked")
			V[] novo = (V[]) new Object[dados.length*2];
			for (int i = 0; i < dados.length; i++) {
				novo[i] = dados[i];
			}
			dados = novo;
		}
		
	}
	
	public V get(int index){
		validaIndex(index);
		return dados[index];
	}
	
	public int size() {
		return numeroElementos;
	}

	public void insert(int index, V valor) {
		validaIndex(index);
		aumentaEspaco();
		for(int i = numeroElementos; i > index; i--){
			dados[i] = dados[i-1];			
		}
		dados[index] = valor;
		numeroElementos++;
	}

	private void validaIndex(int index) {
		if(index < 0 || index >= dados.length){
			throw new ArrayIndexOutOfBoundsException(index);
		} 
	}
	
	public void remove(int index) {
		validaIndex(index);
		for (int i = index; i < numeroElementos-1; i++) {
			dados[i] = dados[i+1];
		}
		numeroElementos--;
	}
	
	
}
