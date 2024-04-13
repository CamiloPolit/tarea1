/**
 * Enemigo: nombre: String, puntosDeVida: Int, ataque: Int, defensa: Int, peso: Int -> Enemigo
 * estaVivo: -> Boolean
 */
class Enemigo(var nombre: String, var puntosDeVida: Int, var ataque: Int, var defensa: Int, var peso: Int) {
  def estaVivo: Boolean = puntosDeVida > 0
}