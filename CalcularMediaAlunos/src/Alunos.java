
public class Alunos {

    private int[] medias;

    public Alunos(int[] medias) {
        this.medias = medias;
    }

    public int[] getMedias() {
        return medias;
    }

    public void setMedias(int[] medias) {
        this.medias = medias;
    }

    public int alunosAprovados() {
        int aprovados = 0;
        for (int i = 0; i < medias.length; i++) {
            if (medias[i] > 6) {
                aprovados++;
            }
        }
        return aprovados;
    }

    public int calcMediaSala() {
        int media = 0;
        int qtd = medias.length;
        for (int i = 0; i < medias.length; i++) {
            media += medias[i];
        }
        return media / qtd;
    }

    public String dados() {
        StringBuilder dados = new StringBuilder("As médias são: \n");
        for (int i = 0; i < medias.length; i++) {
            int num = i + 1;
            dados.append(num + ": " + medias[i]  + "\n");
        }
        return dados.toString();
    }
}
