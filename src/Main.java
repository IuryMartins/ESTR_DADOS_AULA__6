import java.io.File;

public class Main {
    public static void main(String[] args){
//        Q: Quais são as duas partes constituintes necessárias para a definição de um TAD?
//        R: Tipo de Dados + Funções relacionadas

//        Q: Escreva um programa que faça uso do TAD "Ponto"
//        Q: Acrescente novas operações ao TAD "Ponto", tais como soma e subtração de pontos
//        Q: Crie um programa que leia um arquivo contendo dois pontos (um por linha) e execute uma operação a partir desses pontos

        ManipuladorDeArquivos mpa = new ManipuladorDeArquivos();
        File arquivo = mpa.inicializa();
        Ponto[] pontos =  mpa.leiaPonto(arquivo);
        TadPonto tadPonto = new TadPonto(pontos[0].getX(),pontos[0].getY());
        System.out.println("A soma dos pontos é: " + tadPonto.soma(pontos[1]));
        System.out.println("A subtração dos pontos é: " + tadPonto.subtracao(pontos[1]));
        System.out.println("A distância dos pontos é: " + tadPonto.distancia(pontos[1]));
    }
}
