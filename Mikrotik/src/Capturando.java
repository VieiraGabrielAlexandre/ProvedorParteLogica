/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desktop
 */
public class Capturando {
    //Metodos acessores

        private String nome;
        private double cpf;
        private String senha;

        public void mostrar() {
            System.out.printf("O cliente %s, de CPF %.0f e senha %s, esta Autenticado no Concentrador \n", getNome(), getCpf(), getSenha());
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCpf(double cpf) {
            this.cpf = cpf;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public String getNome() {
            return this.nome;
        }

        public double getCpf() {
            return this.cpf;
        }

        public String getSenha() {
            return this.senha;
        }
    }

