/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

/**
 *
 * @author I DENIS I
 */

public class Gorila extends Animal{

    public Gorila(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public void setAlimsIngeridos(Alimento[] alimentos) {
        this.alimsIngeridos = alimentos;
    }

    public double getPesoAlims(){
        double suma= 0;
        for (int i=0; i<this.alimsIngeridos.length;i++){
            suma+=this.alimsIngeridos[i].getGramos();
        }
        int suma_int=(int)suma;
        return suma_int;
    }
    
    @Override
    public double getIMC(){
        return super.getIMC();
    }
}
