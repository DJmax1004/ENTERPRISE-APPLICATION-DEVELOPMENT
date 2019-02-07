package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.bean.Genero;
import br.com.fiap.bean.Pessoa;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setSexo(Genero.MASCULINO);
		Calendar data = Calendar.getInstance();//Data Atual
		Calendar data2 = new GregorianCalendar(2000, Calendar.JANUARY, 20);//Ano, Mes, Dia
		p.setDataNascimento(data);
		
		//Formatar a data para exibir
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(sdf.format(data.getTime()));
		
		System.out.println(sdf.format(data2.getTime()));
	}

}
