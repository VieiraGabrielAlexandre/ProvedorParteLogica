/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desktop
 */
public class Redes {
    public static void main(String[] args) {
        Autenticando primeiro = new Autenticando();
        System.out.println("===============================");
        String nome = "Gabriel";
        double cpf = 1111111111;
        String senha = "0000";
        Capturando clt = new Capturando();
        clt.setNome(nome);
        clt.setCpf(cpf);
        clt.setSenha(senha);
        clt.mostrar();
        System.out.println("===============================");
        Concentrador a = new Concentrador();
        System.out.println("===============================");
        Venda um = new Venda();
        Venda dois = new Venda();
        Venda quatro = new Venda();
        um.mega1 = 29.90;
        dois.mega2 = 39.90;
        quatro.mega4 = 59.90;
        System.out.println("A venda foi = "+um.concluida);
        System.out.println("===============================");
    }
}
