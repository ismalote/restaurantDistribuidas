package org.servidor.util;

import java.util.Calendar;
import java.util.Date;

/**
 */
public class DateUtil {

	public static Date agregarDias(Date resultado, Integer cantidad) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(resultado);
		calendar.add(Calendar.DATE, cantidad);
		return calendar.getTime();
	}
}
