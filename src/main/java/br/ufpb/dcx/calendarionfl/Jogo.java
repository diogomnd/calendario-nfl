package br.ufpb.dcx.calendarionfl;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Jogo implements Serializable
{

    private String nomeTimeVisitante;
    private String nomeTimeDaCasa;
    private String localizacao;
    private LocalDateTime dataHora;

    public Jogo(String nomeTimeVisitante, String nomeTimeDaCasa,
                String localizacao, LocalDateTime dataHora)
    {
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.nomeTimeDaCasa = nomeTimeDaCasa;
        this.localizacao = localizacao;
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        if (dataHora.toString().contains("23:59"))
        {
            String dataFormatada = dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return nomeTimeVisitante + " @ " + nomeTimeDaCasa + " - "
                    + localizacao + " - " + dataFormatada + " TBD";
        }
        String dataFormatada = dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        return nomeTimeVisitante + " @ " + nomeTimeDaCasa + " - "
                + localizacao + " - " + dataFormatada;
    }
}