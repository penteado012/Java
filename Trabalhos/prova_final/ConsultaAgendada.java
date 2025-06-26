package com.mycompany.prova_final;

import java.util.Scanner;

public class ConsultaAgendada {
    // Atributos privados
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade;
    private String nomeMedico;
    
    // Construtor padrão (sem parâmetros)
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
        this.setNomePaciente(paciente);
        this.setNomeMedico(medico);
        quantidade++;
    }
    
    public ConsultaAgendada(Data d, Hora h, String p, String m)
    {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;        
        quantidade++;
    }
    
    public void SetData(int a, int b, int c)
    {
        this.data = new Data(a, b, c);
    }
    
    private void SetData()
    {
        this.data = new Data();
    }
    
    public void SetHora(int a, int b, int c)
    {
        this.hora = new Hora(a, b, c);
    }   
    
    private void SetHora()
    {
        this.hora = new Hora();
    }
    
    public void setNomePaciente(String p) {
    if (p.length() >= 2 && p.length() <= 50) 
    {
        this.nomePaciente = p;
    } else 
     {
        throw new IllegalArgumentException("Nome Inválido! Deve ter entre 2 e 50 caracteres.");
     }
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
    
    public void setNomeMedico(String m) {
    if (m.length() >= 2 && m.length() <= 50) 
    {
        this.nomeMedico = m;
    } else 
      {
        throw new IllegalArgumentException("Nome Inválido! Deve ter entre 2 e 50 caracteres.");
      }
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
    
    public int getAmostra() 
    {
        return quantidade;
    }
    
    public String getData()
    {
        return data.mostra1();
    }

    public String getHoraFormat()
    {
        return hora.getHora1();
    }
    
    public String getNomePaciente() 
    {
        return nomePaciente;
    }

    public String getNomeMedico() 
    {
        return nomeMedico;
    }
    
    public int getHora() {
        return hora.getHor();
    }

    public int getMinuto() {
        return hora.getMin();
    }

    public int getSegundo() {
        return hora.getSeg();
    }

    public int getDia() {
        return data.retDia();
    }

    public int getMes() {
        return data.retMes();
    }

    public int getAno() {
        return data.retAno();
    }

}