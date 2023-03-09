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

    public GuessBean() {
        restart();
    }

    public int getNumberToGuess() {
        return numberToGuess;
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

    public void guess(int guess) {
        attempts++;
        if (guess == numberToGuess) {
            gameState = "¡Felicidades, ganaste " + prize + "!";
        } else if (attempts == 3) {
            gameState = "Perdiste, el número era " + numberToGuess;
        }
        // No se cumple ninguna de las condiciones anteriores, sigue jugando
    }

    public void restart() {
        numberToGuess = (int) (Math.random() * 10) + 1;
        attempts = 0;
        prize = 100;
        gameState = "";
    }
}
