package edu.lucas.tema.poo.interfaces.exercicios.figuraGeometrica;

public record Square(double side) implements GeometricForm {

	@Override
	public double getArea() {		
		return side * side;
	}

}
