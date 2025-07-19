package Entities;

import java.util.Date;

public class Dados {
        private String nome;
        private int idade;
        private int salario;

        public Dados(String nome, int idade, int salario) {
            this.nome = nome;
            this.idade = idade;
            this.salario = salario;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
        return idade;
        }

        public void setIdade(int idade) {
        this.idade = idade;
        }

        public int getSalario() {
            return salario;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }
}
