package com.fusco2k.jofoa.courses

import com.fusco2k.jofoa.R

data class Course(val courseName: String, val professorName: String, val eventTime: String, val pictureID: Int)

class CourseLab() {
    val monday = listOf(
        Course("Abertura Solene", "", "08:00", R.drawable.c0),
        Course(
            "Curso Internacional: Cirurgia de ATM",
            "Prof. Dr. Louis Mercuri",
            "09:00 as 12:00 (Parte 1)\n14:00 as 18:00 (Parte 2)\n",
            R.drawable.c1
        ),
        Course(
            "Planejamento estético em facetas indiretas",
            "Prof. Dr. Luiz Rafael Calixto",
            "14:00 as 16:00",
            R.drawable.c2
        ),
        Course(
            "Arquitetura e Ergonomia para seu consultório",
            "Prof. Dr. Alexandre Casarim",
            "16:00 as 18:00",
            R.drawable.c3
        ),
        Course(
            "Cirurgia Plastica Periodontal",
            "Prof. Dr. Élcio Marcantônio Júnior",
            "19:00 as 21:00",
            R.drawable.c4
        )
    )

    val tuesday = listOf(
        Course(
            "Classe III Esquelética: Abordagem Ortodôntica-Cirúrgica",
            "Prof. Dr. João Gonçalves",
            "08:00 as 10:00",
            R.drawable.c5
        ),
        Course(
            "Atendimento Inicial ao Politraumatismo de Face, o Cirurgião Dentista na Sala de Emergência",
            "Prof. Dr. Mário Francisco Real Gabrielli",
            "10:00 as 12:00",
            R.drawable.c6
        ),
        Course(
            "Replicando Miméticamente a Anatomia de Dentes Posteriores com Resinas Compostas - Teórico",
            "Prof. Dr. Maciel Júnior",
            "14:00 as 16:00",
            R.drawable.c7
        ),
        Course(
            "Replicando Miméticamente a Anatomia de Dentes Posteriores com Resinas Compostas - Hands On",
            "Prof. Dr. Maciel Jínior",
            "16:00 as 18:00",
            R.drawable.c7
        ),
        Course(
            "Cirurgia Para a Extraço de Dentes Inclusos",
            "Prof. Dr. Roberto Henrique Barbeiro",
            "16:00 as 18:00",
            R.drawable.c9
        )
    )

    val wednesday = listOf(
        Course(
            "Planejamento Virtual e Confecção de Guias Cirúrgicas",
            "Prof. Dr. Élcio Marcantônio Júnior",
            "08:00 as 10:00",
            R.drawable.c4
        ),
        Course(
            "Atendendo Pacientes com Doenças Oncológicas",
            "Profa. Dra. Mária Elvira Pizzigatti Correa",
            "10:00 as 12:00",
            R.drawable.c11
        ),
        Course(
            "Carcinogênese Bucal Experimental",
            "Prof. Dr. Daniel Araki Ribeiro",
            "14:00 as 16:00 ",
            R.drawable.c12
        ),
        Course(
            "Aperfeiçoe Sua Atividade Clínica Identificando As Principais Doenças Diagnosticadas na Clínica Odontológica",
            "Dr. Fábio de Abreu Alves",
            "16:00 as 18:00",
            R.drawable.c13
        ),
        Course(
            "Jornada Acadêmica",
            "Apresentações de Painéis e Apresentações Orais",
            "14:00 as 18:00",
            R.drawable.c0
        )
    )

    val thursday = listOf(
        Course(
            "Osteonecrose por Bifosfatos, a Visão do Cirurgião",
            "Profa. Dra. Águida Maria Menezes Aguiar Miranda",
            "10:00 as 12:00",
            R.drawable.c15
        ),
        Course(
            "Jornada Acadêmica",
            "Apresentações de Painéis e Apresentações Orais",
            "08:00 as 16:00",
            R.drawable.c0
        ),
        Course(
            "Sistemas Cerâmicos para Laminados Ultrafinos, Facetas e Coroas: Da Indicação à Cimentação",
            "Prof. Dr. Hamilton Pedrozzi",
            "14:00 as 16:00",
            R.drawable.c16
        ),
        Course(
            "Jornada Acadêmica",
            "Tabulação de Resultados e Publicação das Menções Honrosas e dos Classificados para as Finais",
            "16:00 as 18:00",
            R.drawable.c0
        )
    )

    val friday = listOf(
        Course(
            "Jornada Acadêmica: Final",
            "",
            "08:00 as 12:00",
            R.drawable.c0
        ),
        Course(
            "Instrumentação Rotatória e reciprocamente - Mtwo e Reciproc - Hands On",
            "Prof. Dr. Mário Tanomaru",
            "08:00 as 12:00",
            R.drawable.c17
        ),
        Course(
            "Endodontia Minimamente Invasiva e Conservadora",
            "Prof. Dr. Mário Roberto Leonardo",
            "14:00 as 18:00",
            R.drawable.c18
        ),
        Course(
            "Coquetel de Encerramento e Entrega dos Prêmios da Jornada Acadêmica",
            "",
            "20:30",
            R.drawable.c0
        )
    )

    val event = listOf(monday, tuesday, wednesday, thursday, friday)
}
