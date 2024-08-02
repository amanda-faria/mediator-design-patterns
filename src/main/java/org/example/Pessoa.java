package org.example;

public class Pessoa {

    public String elogiarSecretaria(String mensagem) {
        return Denuncia.getInstancia().denunciaPorAbandono(mensagem);
    }

    public String reclamarSecretaria(String mensagem) {
        return Denuncia.getInstancia().denunciaPorComportamentoDesrespeitoso(mensagem);
    }

    public String sugerirSecretaria(String mensagem) {
        return Denuncia.getInstancia().denunciaPorTrapaca(mensagem);
    }


}