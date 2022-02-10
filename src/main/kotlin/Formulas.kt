import kotlin.math.pow

class Formulas {
    fun forcaPeso(massa: Float, gravidade: Float) = massa * gravidade

    fun forcaCentripeta(massa: Float, velocidade: Double, raio: Float) = velocidade.pow(
        2
    ) / raio * massa

    fun impulso(forca: Float, tempoIncial: Float, tempoFinal: Float) = forca * tempoFinal - tempoIncial

    fun forcaElastica(constante: Float, deformacao: Float) = forcaPeso(constante, deformacao)

    fun velocidadeMedia(velocidadeInicial: Float, velocidadeFinal: Float, tempoInicial: Float, tempoFinal: Float) =
        velocidadeFinal - velocidadeInicial / tempoFinal - tempoInicial

    fun mru(posicaoInicial: Float, velocidade: Float, tempoFinal: Float, tempoInicial: Float) =
        posicaoInicial + velocidade * (tempoFinal - tempoInicial)

    fun mruv(posicaoInicial: Float, velocidade: Float, tempo: Double, aceleracao: Float) =
        posicaoInicial + velocidade * tempo + aceleracao * tempo.pow(
            2
        ) / 2


}