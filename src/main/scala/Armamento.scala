/**
 * Arma: nombre: String, puntosDeAtaque: Int, peso: Int, dueno: Option[Personaje]
 */
trait Arma {
  val nombre: String
  var puntosDeAtaque: Int
  var peso: Int
  var dueno: Option[Personaje]
}

/**
 * ArmaNormal: nombre: String, puntosDeAtaque: Int, peso: Int, dueno: Option[Personaje] = None -> ArmaNormal
 */
class ArmaNormal(val nombre: String, var puntosDeAtaque: Int, var peso: Int, var dueno: Option[Personaje] = None) extends Arma

/**
 * ArmaMagica: nombre: String, puntosDeAtaque: Int, puntosDeAtaqueMagico: Int, peso: Int, dueno: Option[Personaje] = None -> ArmaMagica
 */
class ArmaMagica(val nombre: String, var puntosDeAtaque: Int, var puntosDeAtaqueMagico: Int, var peso: Int, var dueno: Option[Personaje] = None) extends Arma