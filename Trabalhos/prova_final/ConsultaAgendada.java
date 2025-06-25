package com.mycompany.prova_final;

import java.util.Scanner;

public class ConsultaAgendada {
    //Propriedades
    private Data data;
    private Hora hora;
    private String nomePaciente;
    static int quantidade;
    private String nomeMedico;
    
    public ConsultaAgendada()
    {        
        this.data = new Data();
        this.hora = new Hora();
        this.SetNomePaciente();
        this.SetNomeMedico();
        quantidade++;
    }
    
    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String paciente, String medico)
    {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = paciente;
        this.nomeMedico = medico;
        quantidade++;
    }
    
    public ConsultaAgendada(Data d, Hora h, String p, String m)
    {
        
    }
    
    private void SetNomePaciente()
    {
        Scanner sc = new Scanner(System.in);
        String nomeaux;
        
        do {
            System.out.println("Digite o nome do Paciente: ");
            nomeaux = sc.nextLine();
            
            if(nomeaux.length() < 2 || nomeaux.length() > 50) {
            System.out.println("Nome Inválido. Digite um nome entre 2 e 50 caracteres.");
            }
        } while(nomeaux.length() < 2 || nomeaux.length() > 50);  
        
        this.nomePaciente = nomeaux;        
    }
    
    private void SetNomeMedico()
    {
        Scanner sc = new Scanner(System.in);
        String nomeaux;
        
        do {
            System.out.println("Digite o nome do Medico: ");
            nomeaux = sc.nextLine();
            
            if(nomeaux.length() < 2 || nomeaux.length() > 50) {
            System.out.println("Nome Inválido. Digite um nome entre 2 e 50 caracteres.");
            }
        } while(nomeaux.length() < 2 || nomeaux.length() > 50);  
        
        this.nomeMedico = nomeaux;        
    }
}