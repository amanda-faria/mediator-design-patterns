package org.example;

public class Denuncia {

    private static Denuncia instancia = new Denuncia();

    private Denuncia() {}

    public static Denuncia getInstancia() {
        return instancia;
    }

    public String denunciaPorAbandono(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A Riot respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Riot.getInstancia().denunciaPorAbandono(mensagem);
    }

    public String denunciaPorComportamentoDesrespeitoso(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A Riot respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Riot.getInstancia().denunciaPorComportamentoDesrespeitoso(mensagem);
    }

    public String denunciaPorTrapaca(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A Riot respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Riot.getInstancia().denunciaPorTrapaca(mensagem);
    }

}