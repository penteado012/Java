/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioposaula10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExercicioPosAula10 {
    
    private static List<String> lerNumerosDoArquivo(String caminhoArquivo){
            Path path = Paths.get(caminhoArquivo);
            try{
                return Files.lines(path).collect(Collectors.toList());
            }catch (IOException e){
                e.printStackTrace();
                return null;
            }
        }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lerComando;
        List<String> meuArquivo = lerNumerosDoArquivo("C:\\Users\\aluno\\Documents\\NetBeansProjects\\ExercicioPosAula10\\src\\exercicioposaula10\\lista.txt");
        if(meuArquivo != null){
        meuArquivo.forEach(System.out::println);
        }

        System.out.println(meuArquivo);
        lerComando = scanner.nextInt();
        
        while(lerComando != 5){
            System.out.println(meuArquivo);
            lerComando = scanner.nextInt();
        }
        
    }
    
    public float soma(float x, float y){
        
    }
    
    
    
}


