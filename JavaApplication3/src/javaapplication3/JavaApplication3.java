package LISTA2;
//EXE 1
import java.util.ArrayList;

public class LISTA2 {

    private String nome;
    private String nomeCap;
    private Double dimensao;
    private ArrayList<Pais> paisesVizinhos;

    public Pais(String nome, String nomeCap, Double dimensao, ArrayList<Pais> paisesVizinhos) {
        this.nome = nome;
        this.nomeCap = nomeCap;
        this.dimensao = dimensao;
        this.paisesVizinhos = paisesVizinhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDimensao() {
        return dimensao;
    }

    public void setDimensao(Double dimensao) {
        this.dimensao = dimensao;
    }
    
    public String getNomeCap() {
        return nomeCap;
    }

    public void setNomeCap(String nomeCap) {
        this.nomeCap = nomeCap;
    }

    public ArrayList<Pais> getPaisesVizinhos() {
        return paisesVizinhos;
    }

    public void setPaisesVizinhos(ArrayList<Pais> paisesVizinhos) {
        this.paisesVizinhos = paisesVizinhos;
    }

    public boolean equals(final Pais outro) {
        return this.nome.equals(outro.getNome()) && this.nomeCap.equals(outro.getNomeCap());
    }
    
   public ArrayList<Pais> paisesVizinhosEmComum(Pais pais) {
    ArrayList<Pais> paisesEmComum = new ArrayList<Pais>();

    if (this.paisesVizinhos != null && pais.getPaisesVizinhos() != null) {

        this.paisesVizinhos.stream().filter((paisAtual) -> (pais.getPaisesVizinhos().contains(paisAtual))).forEachOrdered((paisAtual) -> {
            paisesEmComum.add(paisAtual);
        });
    }
    return paisesEmComum;
  }
    
}
//EXE2
package LISTA2;

import java.util.Scanner;

public class LISTA2 {
	

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Arrays arrays = new Arrays(); 

    System.out.println("Digite a quantidade de numeros que você deseja somar:");
    int qtd = sc.nextInt();
    arrays.setQuantidade(qtd);

    for (int i = 0; i < qtd; i++) {
       System.out.println("Digite o numero:");
       int valor = sc.nextInt();
       arrays.setValorEPosicao(i, valor);
    }

    int soma = arrays.somaInt();
    System.out.println("O total da soma dos numeros é: " + soma);
 
        }
        
        public class Arrays {

	private int[] arrayInt;
	public void setQuantidade(int quant) {
		arrayInt = new int[quant];
	}

	public void setValorEPosicao(int posicao, int valor) {
		if (arrayInt != null) {
			arrayInt[posicao] = valor;
		}
	}

	public int somaInt() {
		int total = 0;

		for (int i = 0; i < arrayInt.length; i++) {
			total += arrayInt[i];
		}
		return total;
	}
}
}
//EXE3
package lista2;

public class LISTA2 {

    public static void main(String[] args) {

        int[][] matrizA = new int[2][2];
        matrizA[0][0] = 4;
        matrizA[1][0] = 3;
        matrizA[0][1] = 2;
        matrizA[1][1] = 1;

        int[][] matrizB = new int[2][2];
        matrizB[0][0] = 8;
        matrizB[1][0] = 6;
        matrizB[0][1] = 4;
        matrizB[1][1] = 2;

        Matrizes matrizes = new Matrizes();
        System.out.println("Matriz A");
        matrizes.imprimirMatriz(matrizA);

        System.out.println("Matriz B");
        matrizes.imprimirMatriz(matrizB);

        int[][] matrizResultante = new int[2][2];
        matrizResultante = matrizes.multiplicaMatriz(matrizA, matrizB, 2, 2);

        System.out.println("Resultado das multiplicações de matriz: ");
        matrizes.imprimirMatriz(matrizResultante);
    }
    
    public static Matrizes {

    public void imprimirMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int coluna = 0; coluna < matriz1.length; coluna++) {
                System.out.print(matriz1[coluna] + " ");
            }
            System.out.println();
        }
    }

    public int[][] multiplicaMatriz(int[][] matrizA, int[][] matrizB, int quantLinhas, int quantColunas) {
        int[][] matrizC = new int[quantLinhas][quantColunas];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizC[i][j] = matrizA[i][j] * matrizB[i][j];
            }
        }
        return matrizC;
    }
}
}

//EXE4
package lista2;

import java.util.Scanner;

public class lista2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa();

        System.out.println("Informe a quantidade de funcionarios :");
        int qtd = sc.nextInt();
        empresa.setQtdFuncionarios(qtd);

        for (int i = 0; i < qtd; i++) {
            Funcionario funcionario = new Funcionario();

            System.out.println("Funcionario: " + (i + 1));
            System.out.println("Nome: ");
            String nome = sc.next();
            funcionario.setNome(nome);

            System.out.println("Cargo: ");
            String cargo = sc.next();
            funcionario.setCargo(cargo);

            empresa.adcFuncionario(i, funcionario);
        }

        empresa.listarFuncionarios();
    }
    
    public class Empresa {

    private Funcionario[] funcionarios;

    public void setQtdFuncionarios(int qtd) {
        funcionarios = new Funcionario[qtd];
    }

    public void adcFuncionario(int posicao, Funcionario funcionario) {
        funcionarios[posicao] = funcionario;
    }

    public void listarFuncionarios() {
        if (funcionarios != null) {
            for (Funcionario fun : this.funcionarios) {
                System.out.println(fun.toString());
            }
        }
    }
}
public class Funcionario {

    private String nome;
    private String cargo;
    private Funcionario superior;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario: " + this.nome + ", Cargo: " + this.cargo;
    }
}
}
//EXE5
package lista2;

public class LISTA2 {

    public static void main(String[] args) {

        Author author = new Author("Manoel de Barros", "Mn@live.com", 'M');
        Book book = new Book("Querida Menina", author, 20, 70);

        System.out.println(book.toString());
        System.out.println(book.getAuthor().toString());
    }
    
    public class Book {

    private String name;
    private Author author;
    private double price;
    private int qntInStock;

    public Book(String name, Author author, double price, int quantidadeStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qntInStock = quantidadeStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantidadeStock() {
        return qntInStock;
    }

    public void setQntInStock(int qntInStock) {
        this.qntInStock = qntInStock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public class Author {

    private String name;
    private String email;
    private char genero;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + "\nEmail: " + this.email + "\nSexo: " + this.genero;
    }
}
    
}
    
//EXE6
package LISTA2;

public class Funcionario extends Pessoa {
  
  protected int numCadastro;
  protected double salario;
}
public class ClienteEspecial extends Cliente {

	private double discontoFixo;
}
public class Gerente extends Funcionario {

  private Funcionario[] funcionariosGerenciados;
  private double bonusAnual;
}
public class Pessoa {

	protected String cpf;
	protected String nome;
	protected int idade;

}
public class Cliente extends Pessoa {

	protected String endereco;
	protected String telefone;
}
//EXE7
package LISTA2;

public class Rectangle extends Shape.ShapeMethods {

	private double length;
	private double width;

	@Override
	public double getArea() {
		return 0.0;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
public class Shape {

	private String color;

	public static abstract class ShapeMethods {
		abstract double getArea();
	}
}
public class Triangle extends Shape.ShapeMethods {

	private double base;
	private double height;

	@Override
	public double getArea() {
		return 0.0;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
//EXE8
package LISTA2;

public class LISTA2{

	public static void main(String[] args){ 

		Endereco endereco = new Endereco();
		endereco.setCep(79017000);
		System.out.println(endereco.getCep());
	}
        
public class Endereco {

	private String rua;
	private String cep;

	public void setCep(int cep) {
		String cepString = "" + cep;
		String primeiros5Digitos = cepString.substring(0, 5);
		String ultimos3Digitos = cepString.substring(5, 8);
		this.cep = primeiros5Digitos+"-"+ultimos3Digitos;
	}

	public String getCep() {
		return cep;
	}
}
}
//EXE9
package LISTA2;

public class lista2 {

	public static void main(String[] args){ 
		MaiorNumero numero = new MaiorNumero(1999, 1899);
		System.out.println(numero.getMaiorNumero());
	}
        
}
public class MaiorNumero {

	private int primeiroNumero;
	private int segundoNumero;

	public MaiorNumero(int primeiroNumero, int segundoNumero) {
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
	}

	public int getMaiorNumero() {
		if ( segundoNumero < primeiroNumero ) {
			return primeiroNumero;
		}
		return segundoNumero;
	}
}
//EXE10
package LISTA2;

public class LISTA2 {

	public static void main(String[] args){ 
		NumeroDecrescente numero = new NumeroDecrescente(10);
		numero.imprimirNumeroDecrescente();
	}
}
public class NumeroDecrescente {

	private int numero;

	public NumeroDecrescente(int numero) {
		this.numero = numero;
	}

	public void imprimirNumeroDecrescente() {
		int numeroDescrecido = numero+1;
		for (int i = numero; i >= 0; i--) {
			numeroDescrecido = numeroDescrecido-1;
			System.out.println(numeroDescrecido);
		}
	}
}
//EXE11
package LISTA2;

public class LISTA2 {

	public static void main(String[] args){ 
		
		int totalPar = 0;
		int totalImpar = 0;

		for (int i = 0; i <= 30; i++) {
			
			if (i % 2 == 0) {
						
				if (totalPar == 0) {
					totalPar = i;	
				} else {
					totalPar = totalPar*i;
				}

			} else {
				totalImpar += i;
			}
		}

		System.out.println(totalPar);
		System.out.println(totalImpar);
	}
}

