/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastdelivery;

/**
 *
 * @author Thiago
 */
public class cliente {
    
        private String cpf; // O CPF vai identificar o cliente [Não iremos utilizar senha e email]
        private String telefone;
        private String nome;
        
        public cliente(String cpf,String telefone,String nome){ // Contrutor ele serve para quando cria o objeto criea automaticamente esses atriburos e tem que passar esses atributos por parametro
            this.cpf = cpf;
            this.telefone = telefone;
            this.nome = nome;
        }
        
        //Aqui nos get e setters tem alguns que nao precisamos mas eu nao sei qual que precisa agente fala com TJ para tirar a dúvida

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }


        
        
}
