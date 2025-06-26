/*
Nome: Kaik Persike Maiorquino
Prontuario: CB3029689

Nome: Matheus Penteado de Barros
Prontuario: CB3031501
*/

package com.mycompany.prova_final;

public class Prova_Final {

    public static void main(String[] args) {
        
    ConsultaAgendada p1 = new ConsultaAgendada(12, 34, 25, 12, 02, 2006, "Matheus Penteado", "Dr. Roberto");

        System.out.println("=========== Dados da Consulta P1 ===========");
        System.out.println("Hora        : " + p1.getHora());
        System.out.println("Minuto      : " + p1.getMinuto());
        System.out.println("Segundo     : " + p1.getSegundo());
        System.out.println("Dia         : " + p1.getDia());
        System.out.println("Mês         : " + p1.getMes());
        System.out.println("Ano         : " + p1.getAno());
        System.out.println("Paciente    : " + p1.getNomePaciente());
        System.out.println("Médico      : " + p1.getNomeMedico());
        System.out.println("============================================\n");
        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println("=========== Dados da Consulta P2 ===========");
        System.out.println("Hora        : " + p2.getHora());
        System.out.println("Minuto      : " + p2.getMinuto());
        System.out.println("Segundo     : " + p2.getSegundo());
        System.out.println("Dia         : " + p2.getDia());
        System.out.println("Mês         : " + p2.getMes());
        System.out.println("Ano         : " + p2.getAno());
        System.out.println("Paciente    : " + p2.getNomePaciente());
        System.out.println("Médico      : " + p2.getNomeMedico());
        System.out.println("============================================\n");

        // Alterando propriedades de p1
        p1.SetData(25, 12, 2005);
        p1.SetHora(15, 13, 4);
        p1.setNomePaciente("Isabelle");
        p1.setNomeMedico("Dr. Arnaldo");

        System.out.println("====== Dados Atualizados da Consulta P1 ======");
        System.out.println("Hora        : " + p1.getHora());
        System.out.println("Minuto      : " + p1.getMinuto());
        System.out.println("Segundo     : " + p1.getSegundo());
        System.out.println("Dia         : " + p1.getDia());
        System.out.println("Mês         : " + p1.getMes());
        System.out.println("Ano         : " + p1.getAno());
        System.out.println("Paciente    : " + p1.getNomePaciente());
        System.out.println("Médico      : " + p1.getNomeMedico());
        System.out.println("============================================\n");

        System.out.println("Quantidade final de consultas: " + p1.getAmostra());
    }
}
