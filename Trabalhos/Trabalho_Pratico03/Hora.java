/*
Nome: Kaik Persike Maiorquino
Prontuário: CB3029689

Nome: Matheus Penteado de Barros
Prontuário: CB3031501
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopratico03;
import java.util.Scanner;

/**
 *
 * @author Kaik
 */
public class Hora {
     private int hora;
    private int min;
    private int seg;
    
    Scanner sc = new Scanner(System.in);
    
    public Hora(){
        // Construtor sem parâmetros
        
        // Digite a hora corretamente
        do{
            System.out.println("Digite a hora");
            hora = sc.nextInt();
            
            if (hora < 0 || hora > 23) {
                System.out.println("Hora invalida! Tente novamente.");
            }
        }while(hora > 23 || hora < 0);
        
        // Digite o minuto corretamente
        do {
            System.out.println("Digite o minuto");
            min = sc.nextInt();
            
            if (min < 0 || min > 59) {
                System.out.println("Minuto invalido! Tente novamente.");
            }
            
        } while (min > 59 || min < 0);
        
        // Digite o segundo corretamente
        do {
            System.out.println("Digite o segundo");
            seg = sc.nextInt();
            
            if (seg < 0 || seg > 59) {
                System.out.println("Segundo invalido! Tente novamente.");
            }
            
        } while (seg > 59 || seg < 0);
    }
    
    public Hora(int h, int m, int s){
        // Construtor com parâmetros
        
        // Caso o valor seja invalido
        while(h < 0 || h > 23){
            System.out.println("Hora invalida! Tente novamente.");
            System.out.println("Digite a hora");
            h = sc.nextInt();
        }

        // Caso o valor seja invalido
        while(m < 0 || m > 59){
            System.out.println("Minuto invalido! Tente novamente.");
            System.out.println("Digite o minuto");
            m = sc.nextInt();
        }

        // Caso o valor seja invalido
        while(s < 0 || s > 59){
            System.out.println("Segundo invalido! Tente novamente.");
            System.out.println("Digite o segundo");
            s = sc.nextInt();
        }
        
        hora = h;
        min = m;
        seg = s;

    }
    
    public void setHor(int h){
        
        // Caso o valor seja invalido
        while(h < 0 || h > 23){
            System.out.println("Hora invalida! Tente novamente.");
            System.out.println("Digite a hora");
            h = sc.nextInt();
        }
        
        hora = h;
        
    }
    
    public void setMin(int m){
        
        // Caso o valor seja invalido
        while(m < 0 || m > 59){
            System.out.println("Minuto invalido! Tente novamente.");
            System.out.println("Digite o minuto");
            m = sc.nextInt();
        }
        
        min = m;

    }
    
    public void setSeg(int s){

        // Caso o valor seja invalido
        while(s < 0 || s > 59){
            System.out.println("Segundo invalido! Tente novamente.");
            System.out.println("Digite o segundo");
            s = sc.nextInt();
        }
        
        seg = s;

    }
    
    public void setHor(){
        do {
            System.out.println("Digite a hora");
            hora = sc.nextInt();

            if (hora < 0 || hora > 23) {
                System.out.println("Hora invalida! Tente novamente.");
            }
        } while (hora > 23 || hora < 0);
    }
    
    public void setMin() {
        do {
            System.out.println("Digite o minuto");
            min = sc.nextInt();

            if (min < 0 || min > 59) {
                System.out.println("Minuto invalido! Tente novamente.");
            }

        } while (min > 59 || min < 0);
    }
    
    public void setSeg() {
        do {
            System.out.println("Digite o segundo");
            seg = sc.nextInt();

            if (seg < 0 || seg > 59) {
                System.out.println("Segundo invalido! Tente novamente.");
            }

        } while (seg > 59 || seg < 0);
    }
    
    public int getHor(){
        return hora;
    }
    
    public int getMin(){
        return min;
    }
    
    public int getSeg(){
        return seg;
    }
    
    public String getHora1(){
        return hora+":"+min+":"+seg;
    }
    
    public String getHora2(){
        String am_pm = "";
                    
        if (hora >= 12) {
            am_pm = "PM";
        } else if (hora < 12) {
            am_pm = "AM";
        }

        if (hora == 0) {
            hora = 12;
        } else if (hora > 12) {
            hora -= 12;
        }

        return hora+":"+min+":"+seg+am_pm;
    }
    
    public int getSegundos(){
        return (hora * 3600) + (min * 60) + (seg);
    }
}
