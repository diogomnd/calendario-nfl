package br.ufpb.dcx.calendarionfl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalendario {

    Calendario calendario;
    Map<String, Franquia> franquias;

    @BeforeEach
    void setUp() throws IOException {
        calendario = new Calendario();
        franquias = calendario.criarFranquias();
        calendario.definirAdversarios(franquias);
    }

    @Test
    void testTimesAFC() {
        Franquia ravens = franquias.get("Ravens");
        assertEquals("Baltimore", ravens.getCidade());
        assertEquals(Conferencia.AFC, ravens.getConferencia());
        assertEquals(Divisao.NORTE, ravens.getDivisao());

        Franquia patriots = franquias.get("Patriots");
        assertEquals("New England", patriots.getCidade());
        assertEquals(Conferencia.AFC, patriots.getConferencia());
        assertEquals(Divisao.LESTE, patriots.getDivisao());

        Franquia chiefs = franquias.get("Chiefs");
        assertEquals("Kansas City", chiefs.getCidade());
        assertEquals(Conferencia.AFC, chiefs.getConferencia());
        assertEquals(Divisao.OESTE, chiefs.getDivisao());

        Franquia colts = franquias.get("Colts");
        assertEquals("Indianapolis", colts.getCidade());
        assertEquals(Conferencia.AFC, colts.getConferencia());
        assertEquals(Divisao.SUL, colts.getDivisao());

    }

    @Test
    void testTimesNFC() {
        Franquia vikings = franquias.get("Vikings");
        assertEquals("Minnesota", vikings.getCidade());
        assertEquals(Conferencia.NFC, vikings.getConferencia());
        assertEquals(Divisao.NORTE, vikings.getDivisao());

        Franquia giants = franquias.get("Giants");
        assertEquals("New York", giants.getCidade());
        assertEquals(Conferencia.NFC, giants.getConferencia());
        assertEquals(Divisao.LESTE, giants.getDivisao());

        Franquia niners = franquias.get("49ers");
        assertEquals("San Francisco", niners.getCidade());
        assertEquals(Conferencia.NFC, niners.getConferencia());
        assertEquals(Divisao.OESTE, niners.getDivisao());

        Franquia buccaneers = franquias.get("Buccaneers");
        assertEquals("Tampa Bay", buccaneers.getCidade());
        assertEquals(Conferencia.NFC, buccaneers.getConferencia());
        assertEquals(Divisao.SUL, buccaneers.getDivisao());


    }

    @Test
    void testAdversariosAFC() {
       List<Jogo> adversariosRavens = franquias.get("Ravens").getAdversarios();
       assertEquals("Seahawks @ Ravens - M&T Bank Stadium - 05/11/2023 15:00",
               adversariosRavens.get(8).toString());

       List<Jogo> adversariosPats = franquias.get("Patriots").getAdversarios();
       assertEquals("Colts @ Patriots - Frankfurt Stadium - 12/11/2023 11:30",
               adversariosPats.get(9).toString());

       List<Jogo> adversariosChiefs = franquias.get("Chiefs").getAdversarios();
       assertEquals("Chiefs @ Chargers - SoFi Stadium - 07/01/2024 TBD",
               adversariosChiefs.get(16).toString());

       List<Jogo> adversariosColts = franquias.get("Colts").getAdversarios();
       assertEquals("Jaguars @ Colts - Lucas Oil Stadium - 10/09/2023 14:00",
               adversariosColts.get(0).toString());
    }

    @Test
    void testAdversariosNFC() {
        List<Jogo> adversariosVikings = franquias.get("Vikings").getAdversarios();
        assertEquals("Chargers @ Vikings - U.S. Bank Stadium - 24/09/2023 14:00",
                adversariosVikings.get(2).toString());

        List<Jogo> adversariosGiants = franquias.get("Giants").getAdversarios();
        assertEquals("Giants @ Eagles - Lincoln Financial Field - 25/12/2023 18:30",
                adversariosGiants.get(14).toString());

        List<Jogo> adversarios49ers = franquias.get("49ers").getAdversarios();
        assertEquals("49ers @ Vikings - U.S. Bank Stadium - 23/10/2023 21:15",
                adversarios49ers.get(6).toString());

        List<Jogo> adversariosBucs = franquias.get("Buccaneers").getAdversarios();
        assertEquals("Eagles @ Buccaneers - Raymond James Stadium - 25/09/2023 20:15",
                adversariosBucs.get(2).toString());
    }

}