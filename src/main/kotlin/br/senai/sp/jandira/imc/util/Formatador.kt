package br.senai.sp.jandira.imc.util

import java.time.LocalDate

fun formatarDataParaBrasil(data: LocalDate): String{

    var dia = "${data.dayOfMonth}"
    var mes = "${data.month.value}"
    var ano = data.year

    if(dia.length == 1){
        dia = "0$dia"
    }

    if(mes.length == 1){
        mes = "0$mes"
    }

    return "$dia/$mes/$ano"

}