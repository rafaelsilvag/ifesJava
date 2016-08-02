public class Destrutores01 {
    public Destrutores01(){
        // Método construtor
	System.out.println("Metodo construtor...");
    }
    protected void finalize() {
        System.out.println("Uma instância de Destrutores01 esta morrendo. :(");
    }
}
