/*
 * Paulo Vinícius Santos Costa
 * IFRS - TADS - OO - 2019/1
 * Trabalho Final da Cadeira
 */
package trabalhofinal;
import java.util.ArrayList;

/**
 * Classe contendo os itens da Party e os seus participantes (4 no total).
 * É possível adicionar ou remover personagens e itens a partir dos métodos apresentados.
 * @author Paulo Vinícius
 */
public class Party {
    ArrayList<Personagem> personagens = new ArrayList<Personagem>(); // ArrayList contendo os 4 personagens
    ArrayList<Item> itens = new ArrayList<Item>();                   // ArrayList contendo os 100 itens possíveis
    
    /**
     * Construtor de Party
     */
    public void Party() {}
    
    /**
     * Adiciona Personagem à Party de apenas 4 membros.
     * @param p Personagem a ser adicionado
     */
    public void adicionaPersonagem(Personagem p) {
        if(personagens.size() < 4) {
            personagens.add(p);
        } else {
            System.out.println("Party cheia!!");
        }
    }
    
    /**
     * Remove o Personagem da Party a partir do nome digitado.
     * @param nome Nome do personagem a ser removido. Grafia deve estar correta.
     */
    public void removePersonagem(String nome) {
        for (Personagem p : personagens) {                  // "for each" do Java; irá passar por todos os itens guardados em personagens
            if(p.getNome().equals(nome)) {                  // Se o nome do personagem enviado para o método for igual ao nome do item...
                personagens.remove(personagens.indexOf(p)); // ...remove o personagem
            } else {
                System.out.println("Personagem não encontrado.");
            }
        }
    }
    
    /**
     * Adiciona um Item ao inventário, que pode ter até 100 itens
     * @param i Item a ser adicionado ao inventário
     */
    public void adicionaItem(Item i) {
        if(itens.size() < 100) {
            itens.add(i);
        } else {
            System.out.println("Inventário cheio!!");
        }
    }
    
    public void removeItem(String nome) {
        for(Item i : itens) {
            if(i.)
        }
    }
}
