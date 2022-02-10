fun main() {

    val fisica = Formulas()

    val peso = fisica.forcaPeso(10f, 22f)

    val forcaCentripeta = fisica.forcaCentripeta(45f,99.9,45f)

    var impulso = fisica.impulso(45f,41f,78f)

    val forcaElastica = fisica.forcaElastica(10f,66f)

    val velocidadeMedia = fisica.velocidadeMedia(12f,56f,89f,125f)

    val mru = fisica.mru(45f,12f,98f,78f)

    val mruv = fisica.mruv(45810f,125f,36.96,89f,)

    println("digite a massa:")
    var massa:Float = readLine()!!.toFloat()

    println("digite a gravidade:")
    var gravidade:Float = readLine()!!.toFloat()

    println("O peso é =" + fisica.forcaPeso(massa,gravidade))

    println("digite a massa:")
    var massaA:Float = readLine()!!.toFloat()

    println("digite a velocidade:")
    val velocidade:Double = readLine()!!.toDouble()

    println("digite o raio:")
    val raio:Float = readLine()!!.toFloat()



















}
