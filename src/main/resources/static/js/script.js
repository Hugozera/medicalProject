function abrirModalMed() {
    event.preventDefault();
    const modal = document.querySelector("#modalMed");
    const fade = document.querySelector("#fadeMed");
    modal.classList.remove("hide");
    fade.classList.remove("hide");
}
function abrirModalPac() {
    event.preventDefault();
    const modal = document.querySelector("#modalPac");
    const fade = document.querySelector("#fadePac");
    modal.classList.remove("hide");
    fade.classList.remove("hide");
}

function fecharModalMed() {
    event.preventDefault();
    const modal = document.querySelector("#modalMed");
    const fade = document.querySelector("#fadeMed");
    modal.classList.add("hide");
    fade.classList.add("hide");
}
function fecharModalPac() {
    event.preventDefault();
    const modal = document.querySelector("#modalPac");
    const fade = document.querySelector("#fadePac");
    modal.classList.add("hide");
    fade.classList.add("hide");
}

function configurarEventos() {
    event.preventDefault();
    const openModalButton = document.querySelector("#open-modal");
    const closeModalButton = document.querySelector("#close-modal");
    const fade = document.querySelector("#fade");

    openModalButton.addEventListener("click", abrirModal);
    closeModalButton.addEventListener("click", fecharModal);
    fade.addEventListener("click", fecharModal);
}

function capturaPaciente(id, nome){
    console.log(id)
    id_paciente.value = id
    input_paciente.value = nome
    document.getElementById("input_paciente").innerText = nome;
    fecharModalPac()
}function capturaMedico(id, nome){
    console.log(id)
    id_medico.value = id
    input_medico.value = nome
    document.getElementById("input_medico").innerText = nome;
    fecharModalMed()
}

document.getElementById('campoPesquisa').addEventListener('input', function() {
    var termoPesquisa = this.value.toLowerCase();
    var linhasTabela = document.querySelectorAll('#tabelaPacientes tbody tr');

    linhasTabela.forEach(function(linha) {
        var textoLinha = linha.textContent.toLowerCase();
        linha.style.display = textoLinha.includes(termoPesquisa) ? '' : 'none';
    });
});

document.getElementById('campoPesquisaMedico').addEventListener('input', function() {
    var termoPesquisa = this.value.toLowerCase();
    var linhasTabela = document.querySelectorAll('#tabelaMedicos tbody tr');

    linhasTabela.forEach(function(linha) {
        var textoLinha = linha.textContent.toLowerCase();
        linha.style.display = textoLinha.includes(termoPesquisa) ? '' : 'none';
    });
});
configurarEventos();

    document.addEventListener('DOMContentLoaded', function() {
    // Função para aplicar a máscara e permitir apenas números
    function applyMask(input) {
        input.addEventListener('input', function() {
            this.value = this.value.replace(/\D/g, '');
        });
    }

    // Chamando a função para o campo de valor
    var valorInput = document.querySelector('input[name="valor"]');
    applyMask(valorInput);
});


    // function enviarFormulario() {
    //     var cpfInput = document.getElementById('cpf');
    //     var crmInput = document.getElementById('crm');
    //     if (cpfInput.value.trim() === '') {
    //         cpfInput.value = '0';
    //     }
    //     else if (crmInput.value.trim() === '') {
    //         crmInput.value = '0';
    //     }
    //     document.querySelector('form').submit();
    // }
