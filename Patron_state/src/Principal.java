
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaforo objSemaforo = new Semaforo();
		int numero = (int)(Math.random()*3+1);
		
		if (numero==1) {
		
			objSemaforo.setEstado(new EstadoVerde());
        objSemaforo.mostrar();
		}
		else if (numero==2){
			objSemaforo.setEstado(new EstadoNaranja());
	        objSemaforo.mostrar();
		}
		else if (numero==3){
			objSemaforo.setEstado(new EstadoRojo());
	        objSemaforo.mostrar();
        
		}
        

	}

}
