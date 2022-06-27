import java.util.Scanner;

import entities.Calculadora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int opc;
		char rep = 's';
		do {
		System.out.println("@@@@@@@@@@@@@@@@@@ HORA DE CODAR @@@@@@@@@@@@@@@@@@");
		System.out.println("        @@@@@@@@@ A Hora do Java  @@@@@@@@@");
		
		System.out.println("Informe qual exercicio quer executar(de 1 a 8): ");
		opc = sc.nextInt();
		
		switch (opc) {
		case 1:
			System.out.println("######## Vari�vel ########");
			System.out.println(exUm());						
			break;
		case 2:
			System.out.println("######## Entrada e Sa�da de Dados ########");
			System.out.println("Informe seu nome");
			String nome = sc.next();
			exDois(nome);			
			break;
		case 3:
			System.out.println("######## Mais Entrada e Sa�da de Dados ########");
			System.out.println("Informe seu nome");
		    nome = sc.next();
		    System.out.println("Informe sua idade");
		    int idade = sc.nextInt();
			exTres(nome, idade);
			break;
		case 4:
			System.out.println("######## Calculadora ########");
			System.out.println("1. Ret�ngulo");
			System.out.println("2. Quadrado");
			System.out.println("3. Losango");
			System.out.println("4. Trap�zio");
			System.out.println("5. Paralelogramo");
			System.out.println("6. Tri�ngulo");
			System.out.println("7. Circulo");
			System.out.println("Escolha uma forma:");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.println("======= RET�NGULO =======");
				System.out.println("Informe a base do ret�ngulo: ");	
				double base = sc.nextDouble();
				System.out.println("Informe a altura do ret�ngulo: ");	
				double altura = sc.nextDouble();
				
				System.out.println("Area do ret�ngulo � " + Calculadora.retangulo(base, altura));
							
							
			}else {
				if (menu == 2) {
					System.out.println("======= QUADRADO =======");
					System.out.println("Informe o lado do quadrado ");	
					double lado = sc.nextDouble();			
					System.out.println("Area do quadrado � " + Calculadora.quadrado(lado));
				}else {
					if(menu == 3) {
						System.out.println("======= LOSANGO =======");
						System.out.println("Informe a diagonal maior: ");
						double dMaior = sc.nextDouble();
						System.out.println("Informe a diagonal menor: ");
						double dMenor = sc.nextDouble();
						System.out.println("Area do losango � " + Calculadora.losango(dMaior, dMenor) );
					}else {
						if(menu == 4) {
							System.out.println("======= TRAP�ZIO =======");
							System.out.println("Informe a base maior: ");
							double bMaior = sc.nextDouble();
							System.out.println("Informe a base menor: ");
							double bMenor = sc.nextDouble();
							System.out.println("Informe a altura: ");
							double altura = sc.nextDouble();
							System.out.println("Area do trap�zio � " + Calculadora.trapezio(bMaior, bMenor, altura));
						}else {
							if (menu == 5) {
								System.out.println("======= PARALELOGRAMO =======");
								System.out.println("Informe a base do paralelogramo: ");	
								double base = sc.nextDouble();
								System.out.println("Informe a altura do paralelogramo: ");	
								double altura = sc.nextDouble();								
								System.out.println("Area do ret�ngulo � " + Calculadora.paralelogramo(base, altura));
							}else {
								if (menu == 6) {
									System.out.println("======= TRI�NGULO =======");
									System.out.println("Informe a base: ");
									double base = sc.nextDouble();
									System.out.println("Informe a altura: ");
									double altura = sc.nextDouble();
									System.out.println("Area do tri�ngulo � " + Calculadora.triangulo(base, altura));								
								}else {
									if (menu == 7) {
										System.out.println("======= C�RCULO =======");
										System.out.println("Informe o raio: ");
										double raio = sc.nextDouble();
										System.out.println("Area do c�rculo � " + Calculadora.circulo(raio));
									}else {
										System.out.println("OPS! Algo deu errado, tente uma op��o v�lida.");
									}
								}
							}
						}
					}
				}
			}
						
			
			break;
		case 5:
			System.out.println("######## Decis�o ########");
			System.out.println("Informe um n�mero: ");
			int numero = sc.nextInt();
			exCinco(numero);
			break;
		case 6:
			System.out.println("######## Maior ########");
			System.out.println("Informe tr�s n�meros");
			
			int[] numeros = new int[3];
			for (int i = 0; i < 3; i++) {
				System.out.println("Informe o " + (i+1) + "� n�mero");
				numeros[i] = sc.nextInt();
			}
			exSeis(numeros);
			break;
		case 7:
			System.out.println("######## Soma dos Maiores ########");

			int[] numerosM = new int[3];
			for (int i = 0; i < 3; i++) {
				System.out.println("Informe o " + (i+1) + "� n�mero");
				numerosM[i] = sc.nextInt();
			}
			exSete(numerosM);
			break;
		case 8:
			System.out.println("######## Divis�o ########");
			System.out.println("Informe um n�mero: ");
			double n1 = sc.nextDouble();
			System.out.println("Informe o segundo n�mero: ");
			double n2 = sc.nextDouble();
			while(n2 <= 0) {
				System.out.println("Informe o segundo n�mero: ");
				n2 = sc.nextDouble();
			}
			exOito(n1, n2);			
			
			break;

		default:
			System.out.println("Op��o inv�lida");
			break;
		}
		System.out.println("Deseja acessar outro exercicio?(s/n)");
		String read = sc.next();
		rep = read.charAt(0);
		}while(rep != 'n');
		
	sc.close();	

	}
	
	public static String exUm(){
		String planeta = "Terra";
		return planeta;
	}
	
	public static void exDois(String nome) {
		
		System.out.println("Ol� " + nome);
		
	}
	public static void exTres(String nome, int idade) {
		
		System.out.println("Ol�, " + nome + " sua idade � " + idade);		
	}
	
	public static void exCinco(int numero) {
		if(numero == 0) {
			System.out.println("N�mero � zero");
		}else {
			if(numero < 0) {
				System.out.println("N�mero � negativo");
			}else {
				System.out.println("N�mero � positivo");
			}
		}
	}
	
	public static void exSeis(int[] numeros) {
		int maior = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		
		System.out.println("O maior n�mero � " + maior);
	}
	
	public static void exSete(int[] numerosM) {
		
		int soma = 0;
		
		if(numerosM[0] < numerosM[1] && numerosM[0] < numerosM[2]) {
			soma = numerosM[1] + numerosM[2];
		}else {
			if(numerosM[1] < numerosM[0] && numerosM[1] < numerosM[2]) {
				soma = numerosM[0] + numerosM[2];
			}else {
				soma = numerosM[0] + numerosM[1];
			}
		}
		
		System.out.println("A soma dos maiores n�meros �: " + soma);
	}
	
	public static void exOito(double n1, double n2) {		
		System.out.println("A divis�o dos dois n�meros �: " + (n1/n2));
		
	}


}
