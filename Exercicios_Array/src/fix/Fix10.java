package fix;

public class Fix10 {
	private int n;
	private String[] alunos;
	private String[] aprov;
	private double[] notas1;
	private double[] notas2;
	
	public Fix10() {
		
	}
	
	public Fix10(int n, String[] alunos, double[] notas1, double[] notas2, String[] aprov) {
		this.n = n;
		this.alunos = alunos;
		this.aprov = aprov;
		this.notas1 = notas1;
		this.notas2 = notas2;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String[] getAlunos() {
		return alunos;
	}

	public void setAlunos(String[] alunos) {
		this.alunos = alunos;
	}

	public double[] getNotas1() {
		return notas1;
	}

	public void setNotas1(double[] notas1) {
		this.notas1 = notas1;
	}
	
	public String[] getAprov() {
		return aprov;
	}

	public void setAprov(String[] aprov) {
		this.aprov = aprov;
	}

	public double[] getNotas2() {
		return notas2;
	}

	public void setNotas2(double[] notas2) {
		this.notas2 = notas2;
	}

	public String nomesAprov(int n, double[] notas1, double[] notas2, String[] aprov) {
		String ret = null;
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < n; i++) {
			if(((notas1[i] + notas2[i]) / 2) >= 6) {
				aprov[i] = alunos[i];
				System.out.println(aprov[i]);
			}
			
		}
	return ret;
	}
}
