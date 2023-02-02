package entidades;


public class Produto {
	private Integer codigo;
	private String nomeProduto;
	private Float valorProduto;
	private Integer quantidadeAtual;
	private Integer quantidadeMinima;

	public Produto() {

	}

	public Produto(Integer codigo, String nomeProduto, Float valorProduto, Integer quantidadeAtual,
			Integer quantidadeMinima) {
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.quantidadeAtual = quantidadeAtual;
		this.quantidadeMinima = quantidadeMinima;

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Float getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Float valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Integer getQuantidadeAtual() {
		return quantidadeAtual;
	}

	public void setQuantidadeAtual(Integer quantidadeAtual) {
		this.quantidadeAtual = quantidadeAtual;
	}

	public Integer getQuantidadeMinima() {
		return quantidadeMinima;
	}

	public void setQuantidadeMinima(Integer quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}

	@Override
	public String toString() {
		return nomeProduto;
	}
	
}
