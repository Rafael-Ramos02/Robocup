package roboRepeticao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int carga, distancia = 0;
		String direcao;

		System.out.println("Digite a Bateria do Robô:");
		carga = ler.nextInt();

		if (carga > 0) {
			System.out.println("o Robo está funcionando!");

			System.out.println("Digite a direcão que o robô deve ir:");
			System.out.println("(Frente, Esquerda, Direita)");
			direcao = ler.next();

			while (direcao.equalsIgnoreCase("Frente")) {
				System.out.println("Digite a distância que o robô deve andar em cm:");
				distancia = ler.nextInt();


				while (distancia <= 270) {
					System.out.println("Você concluiu a primeira parte do percurso!");

					System.out.println("Digite a segunda direcão que o robô deve seguir:");
					direcao = ler.next();
					while (direcao.equalsIgnoreCase("Esquerda")) {
						System.out.println("Digite a distância que o robô deve andar em cm:");
						distancia = ler.nextInt();

						while (distancia <= 130) {
							System.out.println("Você concluiu a segunda parte do percurso!");

							System.out.println("Digite a terceira direcão que o robô deve seguir:");
							direcao = ler.next();
							while (direcao.equalsIgnoreCase("Esquerda")) {
								System.out.println("Digite a distância que o robô deve andar em cm:");
								distancia = ler.nextInt();
								while (distancia <= 100) {
									System.out.println("Você concluiu a terceira parte do percurso!");

									System.out.println("Digite a quarta direcão que o robô deve ir:");
									direcao = ler.next();
									while (direcao.equalsIgnoreCase("Direita")) {
										System.out.println("Digite a distância que o robô deve andar em cm:");
										distancia = ler.nextInt();
										while (distancia <= 90) {
											System.out.println("Você concluiu quarta parte do percurso!");

											System.out.println(
													"Digite a quinta e ultima direcão que o robô deve percorrer para atingir o troféu:");
											direcao = ler.next();
											while (direcao.equalsIgnoreCase("Esquerda")) {
												System.out.println(
														"Digite a distância final que o robô deve andar em cm:");
												distancia = ler.nextInt();
												if (distancia <= 160) {
													System.out.println(
															"Parabéns, você concluiu o percurso inteiro, levante seu troféu com orgulho!!!");
												} else {
													System.out.println("Ops, você ultrapassou o troféu!");
												}
											}

										}
									}
								}
							}

						}

					}

				}

			}
		} else
			System.out.println("O Robo está sem Bateria!");

	}

}
	

