package br.senai.sp.jandira.imc.util

import java.time.LocalDate

fun formatarDataParaBrasil(data: LocalDate): String{

    var dia = data.dayOfMonth
    var mes = data.month.value
    var ano = data.year

    return "$dia/$mes/$ano"

}