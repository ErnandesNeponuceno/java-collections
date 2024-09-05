package main.java.list.Ordenacao;

import main.java.list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args){
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Marcia", 50, 1.72);
        ordenacaoPessoas.adicionarPessoa("Marcela", 54, 1.52);
        ordenacaoPessoas.adicionarPessoa("Camila", 34, 1.77);
        ordenacaoPessoas.adicionarPessoa("Santana", 44, 1.47);
        ordenacaoPessoas.adicionarPessoa("Barbara", 32, 1.69);
        
        System.out.println("Ordenando por idade: " + ordenacaoPessoas.ordenarPorIdade());
        System.out.println("Ordenando por altura: " + ordenacaoPessoas.ordenarPorAltura());
    }
}

