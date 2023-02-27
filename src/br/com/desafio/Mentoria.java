package br.com.desafio;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return 0;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
