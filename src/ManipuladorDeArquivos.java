import java.io.*;
public class ManipuladorDeArquivos {

    public ManipuladorDeArquivos() {
    }

    public File inicializa() {
        File arquivo = new File("C:\\Users\\iuryi\\IdeaProjects\\ESTR_DADOS_AULA_6\\src\\pontos.txt");
        //verifica se o arquivo ou diretório existe
        boolean existe = arquivo.exists();

        if (!existe) {
            //cria um arquivo (vazio)
            try {
                arquivo.createNewFile();
            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return arquivo;
    }

    public Ponto[] leiaPonto(File arquivo) {
        Ponto[] pontos = new Ponto[2];

        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            int index = 0;

            while (br.ready()) { //lê a proxima linha
                String linha = br.readLine();          //faz algo com a linha
                String[] pedacosDaLinha = linha.split(",");
                int x = Integer.parseInt(pedacosDaLinha[0]);
                int y = Integer.parseInt(pedacosDaLinha[1]);
                Ponto p = new Ponto(x,y);
                pontos[index] = p;
                index++;
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return pontos;
    }
}
