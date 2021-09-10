package kincseslada1;

public class adatok {
        private String[] ladak = {"aranylada","ezustlada","bronzlada"};
        private String[] tartalma={"bennem van a kincs","nem bennem van a kincs","az arany lada hazudik"};
        private int joLada=2;//elso van a kincs
        private int valasztas=0;

    public String[] getLadak() {
        return ladak;
    }

    public String[] getTartalma() {
        return tartalma;
    }

    public int getJoLada() {
        return joLada;
    }

    public int getValasztas() {
        return valasztas;
    }

    public void setValasztas(int valasztas) {
        this.valasztas = valasztas;
    }
        
}
