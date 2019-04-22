/*
 * Paulo Vinícius Santos Costa
 * IFRS - TADS - OO - 2019/1
 * Trabalho Final da Cadeira
 */
package trabalhofinal;

/**
 * Classe Abstrata Item, contendo informações como o nome do item e sua descrição.
 * @author Paulo Vinícius
 */
public class Item {
    private String nome, descricao;

    /**
     * Construtor de Item
     */
    public void Item() {}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    /**
     * Converte os atributos do Item para uma String.
     * @return String contendo dados dos atributos do item.
     */
    public String toString() {
        return "===========/nNome do item: " + nome + "\nDescrição do item: " + descricao + "\n===========";
    }
    
}
