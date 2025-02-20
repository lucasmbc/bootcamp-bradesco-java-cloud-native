package edu.lucas.tema.poo.exercicios.relogio;

public class Main {

	public static void main(String[] args) {
		Clock brlclock = new BRLClock();
		brlclock.setSecond(0);
		brlclock.setMinute(0);
		brlclock.setHour(13);
		
		System.out.println(brlclock.getTime());
		System.out.println(new USClock().convert(brlclock).getTime());

	}

}
