package main.java.set.Pesquisa;

import main.java.set.OperacoesBasicas.Convidado;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato>pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Ernandes", 995713388);
        agendaContatos.adicionarContato("Maria Eduarda", 992147763);

        agendaContatos.exibirContatos();

        agendaContatos.atualizarNumeroContato("Ernandes", 61921458);

        agendaContatos.exibirContatos();
    }
}
