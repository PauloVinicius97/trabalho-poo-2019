/*
 * Paulo Vinícius Santos Costa
 * IFRS - TADS - OO - 2019/1
 * Trabalho Final da Cadeira
 */
package trabalhofinal;

/**
 * Classe Abstrata Personagem, contendo as informações básicas do Personagem, tais como:
 * - Nome
 * - HP
 * - Força
 * - Defesa
 * Além de métodos para trocar armadura, usar item, atacar, etc.
 * @author Paulo Vinícius
 */


public abstract class Personagem {
    private String nome;
    private int hp, strength, defense;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
