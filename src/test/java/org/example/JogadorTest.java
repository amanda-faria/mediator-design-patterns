package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveDenunciarPorAbandono() {
        Jogador aluno = new Jogador();
        assertEquals("A Ouvidoria agradece seu contato.\nA Riot respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Riot agradece sua denúncia: Jogador ausente",
                aluno.elogiarSecretaria("Jogador ausente"));
    }

    @Test
    void deveDenunciaPorComportamentoDesrespeitoso() {
        Jogador aluno = new Jogador();
        assertEquals("A Ouvidoria agradece seu contato.\nA Riot respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Riot agradece sua denúncia: Jogador com atitude desrespeitosa",
                aluno.elogiarSecretaria("Jogador com atitude desrespeitosa"));
    }

    @Test
    void deveDenunciaPorTrapaca() {
        Jogador aluno = new Jogador();
        assertEquals("A Ouvidoria agradece seu contato.\nA Riot respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Riot agradece sua denúncia: O jogador está fazendo uso de haker",
                aluno.elogiarSecretaria("O jogador está fazendo uso de haker"));
    }
}