/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
/**
 *
 * @author Administrador
 */
public class Escola {
    
    private Integer codigo;
    private String nome;
    private Integer nralunos;
    private Double area;
    private Integer nrfuncionarios;
    private LocalDate abertura;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNralunos() {
        return nralunos;
    }

    public void setNralunos(Integer nralunos) {
        this.nralunos = nralunos;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getNrfuncionarios() {
        return nrfuncionarios;
    }

    public void setNrfuncionarios(Integer nrfuncionarios) {
        this.nrfuncionarios = nrfuncionarios;
    }

    public LocalDate getAbertura() {
        return abertura;
    }

    public void setAbertura(LocalDate abertura) {
        this.abertura = abertura;
    }

    @Override
    public String toString() {
        return "Escola{" + "nome=" + nome + '}';
    }
    
}
