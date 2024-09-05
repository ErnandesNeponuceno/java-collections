package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer>agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato (String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato (String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome (String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Douglas", 95713388);
        agendaContatos.adicionarContato("Amanda", 94374726);
        System.out.println("------------------------");
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Amanda");
        agendaContatos.exibirContatos();
        System.out.println("------------------------");
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Douglas"));

    }
}
