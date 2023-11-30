package com.example.AulaJPA1.model.entity;

import com.example.AulaJPA1.model.validation.grupos.Insert;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Consulta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @NotBlank(message = "Digite a observação da consulta", groups = Insert.class)
    private String descricao;
    private String detalhe;
    @NotNull(message = "Digite o valor da consulta", groups = Insert.class)
    @DecimalMin(value = "0.0", inclusive = false, message = "O valor deve ser maior que zero.")
    private double valor;
    @DateTimeFormat
    private LocalDateTime data;


    @ManyToOne
    @JoinColumn(name = "medico")
    private Medico medico;
    @ManyToOne
    @JoinColumn(name = "paciente")
    private Paciente paciente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }


    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
