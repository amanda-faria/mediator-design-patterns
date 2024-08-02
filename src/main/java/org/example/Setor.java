package org.example;


public interface Setor {
    String denunciaPorAbandono(String mensagem);
    String denunciaPorComportamentoDesrespeitoso(String mensagem);
    String denunciaPorTrapaca(String mensagem);
}