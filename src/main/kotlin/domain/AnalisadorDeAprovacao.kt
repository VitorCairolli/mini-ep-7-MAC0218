package domain

import domain.criterios.CriterioDeAprovacao



class AnalisadorDeAprovacao {

    lateinit var criterioDeAprovacao : CriterioDeAprovacao

    fun defineCriterio(criterio: CriterioDeAprovacao) {
        criterioDeAprovacao = criterio
    }

    fun fechaBoletim(boletim: Boletim) : BoletimFechado {
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, criterioDeAprovacao.mediaFinal(boletim), criterioDeAprovacao.estaAprovado(boletim))
    }

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------

}