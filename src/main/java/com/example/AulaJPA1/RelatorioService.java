package com.example.AulaJPA1;
import com.example.AulaJPA1.model.entity.Consulta;
import com.example.AulaJPA1.model.repositories.ConsultaRepositorio;
import com.example.AulaJPA1.model.repositories.MedicoRepositorio;
import com.example.AulaJPA1.model.repositories.PacienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RelatorioService {

    @Autowired
    private MedicoRepositorio medicoRepositorio;

    @Autowired
    private ConsultaRepositorio consultaRepositorio;

    @Autowired
    private PacienteRepositorio pacienteRepositorio;

    public int getTotalMedicos() {
        return medicoRepositorio.medicos().size();
    }

    public int getTotalConsultas() {
        return consultaRepositorio.consultas().size();
    }

    public int getTotalPacientes() {
        return pacienteRepositorio.pacientes().size();
    }

    public double getValorTotalConsultas() {
        List<Consulta> consultas = consultaRepositorio.consultas();
        return consultas.stream().mapToDouble(Consulta::getValor).sum();
    }
}
