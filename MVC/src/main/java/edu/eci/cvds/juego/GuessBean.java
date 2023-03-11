package edu.eci.cvds.juego;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "guessBean")
@SessionScoped
public class GuessBean implements Serializable {

    private int numberToGuess;
    private int attempts;
    private int prize;
    private String gameState;
    private int attempNumber;
    private List<Integer> lista;

    public GuessBean() {
        restart();
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }
    
    public int getAttempNumber() {
        return attempNumber;
    }
    
    public void setAttempNumber(int attempNumber) {
    	 this.attempNumber = attempNumber;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public String getGameState() {
        return gameState;
    }

    //PUNTO 11

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista (List<Integer> lista) {
        this.lista = lista;
    }

    public void guess() {
        attempts++;
        lista.add(attempNumber);
        if (attempNumber == numberToGuess) {
            gameState = "¡Felicidades, ganaste " + prize + "!!!";
        }
        int newprize = getPrize() - 10000;
        setPrize(newprize);
        // No se cumple ninguna de las condiciones anteriores, sigue jugando
    }

    public void restart() {
        numberToGuess = (int) (Math.random() * 10) + 1;
        attempts = 0;
        prize = 100000;
        gameState = "Intenta con un numero";
        lista = new ArrayList<Integer>();
    }
}
