package br.com.caelum.livraria.dominio;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.util.Arrays.asList;

import java.time.LocalDate;

public class DataUtils {
	
	public static boolean ehFimDeSemana(LocalDate data) {
		return asList(SATURDAY, SUNDAY).contains(data.getDayOfWeek());
	}
}
