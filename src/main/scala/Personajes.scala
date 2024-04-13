/**
 * Personaje: nombre: String, puntosDeVida: Int, defensa: Int, peso: Int
 * estaVivo: -> Boolean
 */
trait Personaje {
  var nombre: String
  var puntosDeVida: Int
  var defensa: Int
  var peso: Int

  def estaVivo: Boolean = puntosDeVida > 0
}

/**
 * PersonajeMagico (extends Personaje): puntosDeMana: Int
 */
trait PersonajeMagico extends Personaje {
  var puntosDeMana: Int
}

/**
 * Paladin: nombre: String, puntosDeVida: Int, defensa: Int, peso: Int -> Paladin
 */
class Paladin(var nombre: String, var puntosDeVida: Int, var defensa: Int, var peso: Int) extends Personaje

/**
 * Guerrero: nombre: String, puntosDeVida: Int, defensa: Int, peso: Int -> Guerrero
 */
class Guerrero(var nombre: String, var puntosDeVida: Int, var defensa: Int, var peso: Int) extends Personaje

/**
 * Ninja: nombre: String, puntosDeVida: Int, defensa: Int, peso: Int -> Ninja
 */
class Ninja(var nombre: String, var puntosDeVida: Int, var defensa: Int, var peso: Int) extends Personaje

/**
 * MagoNegro: nombre: String, puntosDeVida: Int, defensa: Int, peso: Int, puntosDeMana: Int -> MagoNegro
 */
class MagoNegro(var nombre: String, var puntosDeVida: Int, var defensa: Int, var peso: Int, var puntosDeMana: Int) extends PersonajeMagico

/**
 * MagoBlanco: nombre: String, puntosDeVida: Int, defensa: Int, peso: Int, puntosDeMana: Int -> MagoBlanco
 */
class MagoBlanco(var nombre: String, var puntosDeVida: Int, var defensa: Int, var peso: Int, var puntosDeMana: Int) extends PersonajeMagico
