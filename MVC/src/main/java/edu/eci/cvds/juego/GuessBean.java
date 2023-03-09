package edu.eci.cvds.juego;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name = "guessBean")
@SessionScoped
public class GuessBean implements Serializable {

    private int numberToGuess;
    private int attempts;
    private int prize;
    private String gameState;
    private int attempNumber;

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

    public void guess() {
        attempts++;
        if (attempNumber == numberToGuess) {
            gameState = "¡Felicidades, ganaste " + prize + "!";
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
    }
}
