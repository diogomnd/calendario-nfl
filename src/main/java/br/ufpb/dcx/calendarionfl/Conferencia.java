package br.ufpb.dcx.calendarionfl;

public enum Conferencia {
    AFC, NFC;

    public static Conferencia parseConferencia(String conferencia) {
        if (conferencia.equals("AFC")) return AFC;
        return NFC;
    }

    @Override
    public String toString() {
        if (this.equals(AFC)) return "AFC";
        return "NFC";
    }

}