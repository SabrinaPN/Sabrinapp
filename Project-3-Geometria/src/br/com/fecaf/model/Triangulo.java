package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado2, lado3, area, perimetro, altura;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/************************/");
        System.out.println("/*   Cadastro Triângulo */");
        System.out.println("/************************/");
        System.out.print("/* Informe o Base:     */");
        base = scanner.nextDouble();
        System.out.print("/* Informe o lado 2:     */");
        lado2 = scanner.nextDouble();
        System.out.print("/* Informe o lado 3:   */");
        lado3 = scanner.nextDouble();
        System.out.print("Informe a Altura: ");
        altura = scanner.nextDouble();
        System.out.println("/* Triângulo Cadastrado com Sucesso !");
        System.out.println("/***********************************/");

        return true;
    }

    public void calcularArea() {
        System.out.println("/*********************************/");
        System.out.println("/*        Calculando Area        */");
        System.out.println("/*********************************/");

        area = (base * altura) / 2;
        System.out.println("A área é: " + area);
        System.out.println("/*********************************/");
    }

    public void calcularPerimetro() {
        System.out.println("/*********************************/");
        System.out.println("/*      Calculando Perimetro     */");
        System.out.println("/*********************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/*********************************/");
    }

    // Isosceles / Escaleno / Equilatero
    public void definirTipo() {
        System.out.println("/*********************************/");
        System.out.println("/*        Definindo Tipo         */");
        System.out.println("/*********************************/");

        if (base == lado2 && base == lado3) {

            System.out.println("O Triângulo é Equilátero ...");

        } else if (base != lado2 && base != lado3 && lado2 != lado3) {

            System.out.println("O Triângulo é Escaleno ...");

        } else {
            System.out.println("O Triângulo é Isosceles ...");
        }
        System.out.println("/***************************************/");
    }

    public void TrianguloRetangulo() {
        System.out.println("/*********************************/");
        System.out.println("/*  ...Definindo Triangulo Retangulo...   */");
        System.out.println("/*********************************/");

        double hipotenusa = Math.max(base, Math.max(lado2, lado3));
        double cateto1, cateto2;

        if (hipotenusa == base) {
            cateto1 = lado2;
            cateto2 = lado3;

        } else if (hipotenusa == lado2) {
            cateto1 = base;
            cateto2 = lado3;

        } else {
            cateto1 = base;
            cateto2 = lado2;
        }

        if ((cateto1 * cateto1 + cateto2 * cateto2) == hipotenusa * hipotenusa) {
            System.out.println("É um Triângulo Retângulo.");
        } else {
            System.out.println("Não é um triângulo Retângulo.");
        }
    }

    public void TrianguloPitagorico() {
        System.out.println("/*********************************/");
        System.out.println("/* ...Verificando Triângulo é Pitagórico...  */");
        System.out.println("/*********************************/");

        double hipotenusa = Math.max(base, Math.max(lado2, lado3));
        double cateto1, cateto2;

        if (hipotenusa == base) {
            cateto1 = lado2;
            cateto2 = lado3;
        } else if (hipotenusa == lado2) {
            cateto1 = base;
            cateto2 = lado3;
        } else {
            cateto1 = base;
            cateto2 = lado2;
        }


        if ((cateto1 / 3 == cateto2 / 4) && (cateto1 / 3 == hipotenusa / 5)) {
            System.out.println("Este triângulo é Pitagórico.");
        } else {
            System.out.println("Este triângulo não é Pitagórico.");
        }
    }

}
