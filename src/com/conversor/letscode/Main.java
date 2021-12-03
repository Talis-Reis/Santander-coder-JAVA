package com.conversor.letscode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        /**
         *
         * Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra), Fahrenheit (F) seguindo as fórmulas:

         F = (C * 1.8) + 32
         K = C + 273.15
         Re = C * 0.8
         Ra = (C * 1.8) + 491

         Considere a conversão de 18 ºC e a precisão de duas casas decimais

         */

        System.out.println("  TABELA ESCALA DE TEMPERATURAS:");
        System.out.println("---------------------------");
        System.out.println("  Kelvin  -------- K");
        System.out.println("  Réaumur -------- Re");
        System.out.println("  Rankine -------- Ra");
        System.out.println("  Fahrenheit ----- F");
        System.out.println("---------------------------");
        System.out.println("Escolha a escala que deseja a conversão:");

        Scanner entradaEscalaTemperatura = new Scanner(System.in);
        String escalaTemperatura = entradaEscalaTemperatura.nextLine();

        Scanner entradaTemperatura = new Scanner(System.in);
        System.out.println("Entre com a temperatura em Celsius que deseja ser convertida: ");
        float temperaturaCelsius = 0;

        try {
            temperaturaCelsius = entradaTemperatura.nextFloat();
        }catch (Exception e){
            System.out.println("Impossível converter com temperatura informada, revise o dado inserido! ");
            return;
        }

        switch (escalaTemperatura){
            case "K":
                float conversaoKelvin = (temperaturaCelsius + 273.15f);
                System.out.println("Temperatura convertida em Kelvin: " + conversaoKelvin);
                break;
            case "Re":
                float conversaoReaumur = (temperaturaCelsius * 0.8f);
                System.out.println("Temperatura convertida em Réaumur: " + conversaoReaumur);
                break;
            case "Ra":
                float conversaoRankine = (temperaturaCelsius * 1.8f) + 491;
                System.out.println("Temperatura convertida em Rankine: " + conversaoRankine);
                break;
            case "F":
                float conversaoFahrenheit = (temperaturaCelsius * 1.8f) + 32;
                System.out.println("Temperatura convertida em Fahrenheit: " + conversaoFahrenheit);
                break;
            default:
                System.out.println("Não foi possível identificar a escala selecionada!");
                break;
        }
    }
}