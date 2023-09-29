package br.ufpb.dcx.calendarionfl;

public enum Divisao {
    NORTE, SUL, LESTE, OESTE;

    public static Divisao parseDivisao(String divisao) {
        if (divisao.equals("Norte"))
            return NORTE;
        if (divisao.equals("Sul"))
            return SUL;
        if (divisao.equals("Leste"))
            return LESTE;
        return OESTE;
    }

    @Override
    public String toString() {
        if (this.equals(NORTE))
            return "Norte";
        else if (this.equals(SUL))
            return "Sul";
        else if (this.equals(LESTE))
            return "Leste";
        return "Oeste";
    }

}