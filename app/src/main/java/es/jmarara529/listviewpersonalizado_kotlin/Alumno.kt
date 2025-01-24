package es.jmarara529.listviewpersonalizado_kotlin


data class Alumno(val nombre: String, val apellidos: String, val sexo: String, val modulo: String)

/*
class Alumno {

    private  var nombre: String
    var apellidos: String
    var sexo: String
    var modulo: String

    public constructor(nombre: String, apellidos: String, sexo: String, modulo: String) {
        this.nombre = comprobarNombre(nombre)
        this.apellidos = apellidos
        this.sexo = comprobarSexo(sexo)
        this.modulo = comprobarModulo(modulo)
    }


    private fun comprobarNombre(nombre: String): String {

        if (!(nombre.isNullOrBlank() || nombre.isEmpty())){
            return nombre
        }else{
            throw IllegalArgumentException("El nombre no puede estar vacío")
        }

    }

    private fun comprobarSexo(sexo: String): String {

        if (sexo.uppercase() == "H") {
            return "Hombre"
        } else if (sexo.uppercase() == "M") {
            return "Mujer"
        }else{
            return "Desconocido"
        }

    }

    private fun comprobarModulo(modulo: String): String {

        if (modulo.uppercase() == "DAM") {
            return "DAM"
        } else if (modulo.uppercase() == "DAW") {
            return "DAW"
        } else if (modulo.uppercase() == "ASIR") {
            return "ASIR"
        }else{
            throw IllegalArgumentException("El módulo no es correcto")
        }

    }


}*/