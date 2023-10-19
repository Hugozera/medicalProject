package com.example.AulaJPA1.control;

import com.example.AulaJPA1.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class RelatorioControl {
    @Autowired
    private RelatorioService relatorioService;

    @GetMapping("/")
    public String home(Model model) {
        int totalMedicos = relatorioService.getTotalMedicos();
        int totalConsultas = relatorioService.getTotalConsultas();
        int totalPacientes = relatorioService.getTotalPacientes();
        double valorTotalConsultas = relatorioService.getValorTotalConsultas();

        model.addAttribute("totalMedicos", totalMedicos);
        model.addAttribute("totalConsultas", totalConsultas);
        model.addAttribute("totalPacientes", totalPacientes);
        model.addAttribute("valorTotalConsultas", valorTotalConsultas);
        return "home";
    }

}
