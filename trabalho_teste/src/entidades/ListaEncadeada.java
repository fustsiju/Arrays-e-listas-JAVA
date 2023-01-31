package entidades;

public class ListaEncadeada {
	private No primeiro;
	private No ultimo;
	private int quantidade;
	
	public ListaEncadeada(No primeiro, No ultimo, int quantidade) {
		this.primeiro = primeiro;
		this.ultimo = ultimo;
		this.quantidade = quantidade;
	}

	public No getPrimeiro(){
		return primeiro;
	}
	
	public void setPrimeiro(No primeiro){
		this.primeiro = primeiro;
	}
	
	public No getUltimo(){
		return ultimo;
	}
	
	public void setUltimo(No ultimo){
		this.ultimo = ultimo;
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	public void listaVazia() {
		
	}
	public void inserirPrimeiro(Produto p){
		No novoNo = new No(p); //Instancia um novo no
		if(this.listaVazia()){
			this.ultimo = novoNo;
		}
		novoNo.setProximo(this.primeiro);
		this.primeiro = novoNo;
		this.quantidade++;
	}
}