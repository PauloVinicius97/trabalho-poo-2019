/*
 * Paulo Vinícius Santos Costa
 * IFRS - TADS - OO - 2019/1
 * Trabalho Final da Cadeira
 */
package trabalhofinal.Itens;

/**
 * Classe Abstrata Item, contendo informações como o nome do item e sua descrição.
 * @author Paulo Vinícius
 */
public abstract class Item {
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
    @Override
    public String toString() {
        return "\nNome: " + nome + "\nDescrição: " + descricao;
    }
}
