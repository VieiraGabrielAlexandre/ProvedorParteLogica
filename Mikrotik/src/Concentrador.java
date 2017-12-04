/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desktop
 */
public class Concentrador {
    String a = "CCR1100";
    private String modelo = a;
    private static int quantidade = 0;
    
    public Concentrador(){
        quantidade = 1000;
        System.out.println("Modelo do Concentrador = "+modelo+" Clientes que podem autenticar = "+quantidade);
    }
}
