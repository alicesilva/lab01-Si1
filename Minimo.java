package minimo;

public class Minimo {
	
	public int minimo(int[] valores){
		int minimo = valores[0];
		for(int i = 1; i < valores.length; i++){
			if(valores[i]<minimo){
				minimo = valores[i];
			}
		}
		
		return minimo;
	}

}
