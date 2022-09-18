package controller;

import br.com.leandrocolevati.pilhalong.Pilha;

public class FatController {

	public FatController() {
		super();
	}

	public long fatorial(int num) {
		Pilha p = new Pilha();

		long fat = 1;
		p.push(num);

		while (num > 1) {

			try {
				fat = p.top();
				fat = fat * (num - 1);
			} catch (Exception e) {
				e.printStackTrace();
			}
			p.push(fat);
			num--;
		}

		return fat;
	}
}
