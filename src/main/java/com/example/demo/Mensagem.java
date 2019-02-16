package com.example.demo;

public class Mensagem {

    private String texto;

    public Mensagem(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        if (texto == null || "".equals(texto)) {
            return "Nenhuma mensagem definida.";
        }

        return "Mensagem{" +
                "texto='" + texto + '\'' +
                '}';
    }

}
