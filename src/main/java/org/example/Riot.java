package org.example;

public class Riot implements Setor {

    private static Riot instancia = new Riot();

    private Riot() {}

    public static Riot getInstancia() {
        return instancia;
    }

    public String denunciaPorAbandono(String mensagem) {
        return "A Riot agradece sua denúncia: " + mensagem;
    }

    public String denunciaPorComportamentoDesrespeitoso(String mensagem) {
        return "A Riot agradece sua denúncia: " + mensagem;
    }

    public String denunciaPorTrapaca(String mensagem) {
        return "A Riot agradece sua denúncia: " + mensagem;
    }
}