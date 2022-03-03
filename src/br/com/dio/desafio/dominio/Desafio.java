package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Desafio extends Conteudo {

    private String linkRepositorio;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public int tipoConteudo() {
        return 2;
    }

    public boolean entregue(){
        return this.linkRepositorio != null;
    }
    @Override
    public String toString() {
        if (!this.entregue()){
            return "Desafio{" +
                    "titulo='" + getTitulo() + '\'' +
                    ", descricao='" + getDescricao() + '\'' + '}';
        }else {
            return "Desafio{" +
                    "titulo='" + getTitulo() + '\'' +
                    ", descricao='" + getDescricao() + '\'' +
                    ", linkRepositorio='" + this.linkRepositorio + '\'' + '}';
        }
    }

    public String getLinkRepositorio() {
        return linkRepositorio;
    }

    public void setLinkRepositorio(String linkRepositorio) {
        this.linkRepositorio = linkRepositorio;
    }
}
