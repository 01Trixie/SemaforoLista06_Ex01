package view;

import java.util.concurrent.Semaphore;

import controller.Corrida;

public class Game {
    public static void main(String[] args) {
    	Semaphore tocha = new Semaphore(1);
    	Semaphore pedra = new Semaphore(1);
    	int portaCorreta = gerarPortaCorreta();
        
    	
    	System.out.println("A porta correta é a: " + portaCorreta + ", mas só vc sabe disso!!");
    	
        for (int i = 0; i < 4; i++) {
            Thread threadCavaleiros = new Corrida(i, tocha, pedra, portaCorreta); 
            threadCavaleiros.start(); 
        }
    }
    
    public static int gerarPortaCorreta() {
    	
        return (int) (Math.random() * 4);
    }
}