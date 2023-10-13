package com.uco.geometria.dominio;

public class Triangulo extends FiguraGeometrica {
    private int base;

    private int altura;

    private int lado1;

    private int lado2;

    public Triangulo(int base, int altura, int lado1, int lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea(){
        return (this.base * (double)this.altura) / 2;
    }

    @Override
    public double calcularPerimetro(){
        return (this.lado1 + this.lado2) + this.base;
    }

}
