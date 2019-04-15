package br.com.digitalhouse;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa danilo = new Pessoa("Danilo", "Percivalli", 35);
        Pessoa lohraine = new Pessoa("Lohraine", "Maia", 23);
        Pessoa luna = new Pessoa("Luna", "Maia", 4);

        pessoas.add(danilo);
        pessoas.add(lohraine);
        pessoas.add(luna);

        /*for (Pessoa pessoa:pessoas){
            System.out.println("Nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobrenome() + "\nIdade: " + pessoa.getIdade());
        }
*/
        Set<Pessoa> pessoaSet = new HashSet<>();
        pessoaSet.add(danilo);
        pessoaSet.add(lohraine);
        pessoaSet.add(danilo);
        pessoaSet.add(danilo);
        pessoaSet.add(lohraine);
        pessoaSet.add(luna);

    /*    for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobrenome() + "\nIdade: " + pessoa.getIdade() + "\n");
        }*/

        Map<String, Pessoa> pessoaMap = new HashMap<>();
        pessoaMap.put("danilo", danilo);
        pessoaMap.put("lohraine", lohraine);
        pessoaMap.put("luna", luna);

        for (String chave : pessoaMap.keySet()) {
            System.out.println("Nome: " + pessoaMap.get(chave).getNome() +
                    "\nSobrenome: " + pessoaMap.get(chave).getSobrenome() + "\nIdade: " + pessoaMap.get(chave).getIdade() + "\n");
        }


    }
}
