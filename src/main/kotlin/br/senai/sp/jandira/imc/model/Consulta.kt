package br.senai.sp.jandira.imc.model

import br.senai.sp.jandira.imc.util.formatarDataParaBrasil
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalTime

class Consulta {

    private var paciente: Paciente? = null
    private var medico: Medico? = null
    private var dataConsulta: LocalDate? = null
    private var horaConsulta: LocalTime? = null
    private var valorConsulta: Double = 0.0


    fun agendarConsulta (
                            paciente: Paciente,
                            medico: Medico,
                            dataConsulta: LocalDate,
                            horaConsulta: LocalTime,
                            valor: Double
                        ){
                            this.paciente = paciente
                            this.medico = medico
                            this.dataConsulta = dataConsulta
                            this.horaConsulta = horaConsulta
                            this.valorConsulta = valor
                        }

    fun mostrarDadosDaConsulta(){
        println("=======================")
        println("DADOS DA CONSULTA")
        println("=======================")
        println("DATA: ${formatarDataParaBrasil(dataConsulta!!)}")
        println("HORÁRIO: $horaConsulta")
        println("PACIENTE: ${paciente!!.nome}")
        println("IMC: ${paciente!!.calcularImc()}")
        println("MEDICO: ${medico!!.nome}")
        println("=======================")
    }

}