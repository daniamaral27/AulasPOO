package br.org.senai.model;




public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Amil", "Checkup", "234569852");
		Medico medico = new Medico("Golden Cross", 1233, "Antonio");
		Anestesista anestesista = new Anestesista("Amil", 124, "Silvana", "Geral");

		clinica.calcularPagamento();
		//cp.calcularTotalPago(clinica);

		medico.calcularPagamento();
		//cp.calcularTotalPago(medico);

		anestesista.calcularPagamento();
		//cp.calcularTotalPago(anestesista);

		System.out.println(clinica + " Valor a receber do Plano: " + clinica.getValorPago() +"\n");
		System.out.println(medico + " Valor a receber do Plano: " + medico.getValorPago()+"\n");
		System.out.println(anestesista + " Valor a receber do Plano: " + anestesista.getValorPago());

	}

}
