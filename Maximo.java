package maximo;

public class Maximo {
	
	public int maximo(int[] valores){
		int maximo = valores[0];
		for(int i = 1; i <valores.length; i++){
			if(valores[i]>maximo){
				maximo = valores[i];
			}
		}
		
		return maximo;
	}

}
