public class Sala {
    int bloco;
    int sala;
    int capacidade;
    boolean acessivel;

    Sala () {
        this(6, 101, 50, true);
    }

    Sala(int bloco, int sala, int capacidade, boolean acessivel) {
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    public String getDescricao() {
        if (acessivel == true)
        return "Bloco " + bloco + ", Sala " + sala + " (" + capacidade + " lugares, acessível)";
        else
        return "Bloco " + bloco + ", Sala " + sala + " (" + capacidade + " lugares, não acessível)";
    }

    @Override
    public boolean equals(Object obj) {
        Sala sala = (Sala) obj;
        if (this.bloco == sala.bloco &&
        this.sala == sala.sala &&
        this.capacidade == sala.capacidade &&
        this.acessivel == sala.acessivel
        ) return true;
        return false;
    }
}
