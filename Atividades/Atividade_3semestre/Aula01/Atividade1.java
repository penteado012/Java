/*
1 – Seja o compilador, Cada um dos arquivos Java
desse exercício representa um arquivo fonte
completo. Sua tarefa é personificar o compilador
e determinar se cada um deles pode ser
compilado. Se não puderem ser compilados, como
você os corrigiria?
A
public class Exercise1a{
public static void main(String [] args){
int x = 1;
while (x>10){
if(x > 3){
System.out.println(“big x”);
}
}
}
}
Compila, porem nao retorna nada, pois nâo contem incremento
B
public static void main(String [] args){
int x = 5;
while( x > 1 ){
x = x – 1;
if ( x < 3) {
System.out.println(“ small x “);
}
}
}
nâo irá compilar, pois nâo possui a class
C
public class Exercise1c{
int x = 5;
while ( x > 1){
x = x - 1;
if (x < 3){
System.out.println(“small x”);
}
}
Não irá rodar, pois não contém o main.(não que seja necessário rodar, porém nesse caso precisaria do main).
*/