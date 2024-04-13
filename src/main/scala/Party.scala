/**
 * Party: -> Party
 * agregarMiembro: Personaje -> Unit
 * estaDerrotado: -> Boolean
 */
class Party {
  private var miembros: List[Personaje] = List()

  def agregarMiembro(personaje: Personaje): Unit = {
    miembros = personaje :: miembros
  }

  def estaDerrotado: Boolean = !miembros.exists(_.estaVivo)
}