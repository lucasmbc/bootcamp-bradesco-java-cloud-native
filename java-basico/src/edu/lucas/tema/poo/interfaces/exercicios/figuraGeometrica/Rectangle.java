package edu.lucas.tema.poo.interfaces.exercicios.figuraGeometrica;

public record Rectangle(double height, double base) implements GeometricForm {

	@Override
	public double getArea() {		
		return height * base;
	}

}
