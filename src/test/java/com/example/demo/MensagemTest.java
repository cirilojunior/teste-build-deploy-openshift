package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class MensagemTest {

    @Test
    public void informandoNulo() {
        Mensagem mensagem = new Mensagem(null);
        assertEquals("Nenhuma mensagem definida.", mensagem.toString());
    }

    @Test
    public void informandoVazio() {
        Mensagem mensagem = new Mensagem(null);
        assertEquals("Nenhuma mensagem definida.", mensagem.toString());
    }

    @Test
    public void informandoTexto() {
        Mensagem mensagem = new Mensagem("Teste para build no Openshift.");
        assertEquals("Mensagem{texto='Teste para build no Openshift.'}", mensagem.toString());
    }

}