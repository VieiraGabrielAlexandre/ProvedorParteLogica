/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desktop
 */
class Heranca {
    double mega1;
    double mega2;
    double mega4;
    
    void megas (){
        System.out.printf("1 Mega = %.2f\n",mega1);
        System.out.printf("2 Megas = %.2f\n",mega2);
        System.out.printf("4 Megas = %.2f\n", mega4);
    }
}

class Venda extends Heranca {
    String concluida = "Venda Concluida";
    
    double preco(){
        return mega1;
    }
    
    void Valores(){
        System.out.println("O Preco vendido é = "+mega2);
    }
}
