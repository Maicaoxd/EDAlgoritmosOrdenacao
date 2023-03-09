package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.ordenacao.Ordenacao;

public class Main {

	public static void main(String[] args) {
		Ordenacao ordem = new Ordenacao();
		int[] vet = { 69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1 };
		int opc = 0;
		while (opc != 1 && opc != 2) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(" Insira 1 para bubble sort\n Insira 2 para merge sort"));
		}
		switch (opc) {
		case 1:
			vet = ordem.bubbleSort(vet);
			for (int valor : vet) {
				System.out.print(valor + " ");
			}
			break;
		case 2:
			vet = ordem.mergeSort(vet, 0, vet.length - 1);
			for (int valor : vet) {
				System.out.print(valor + " ");
			}
			break;
		}
	}

}
