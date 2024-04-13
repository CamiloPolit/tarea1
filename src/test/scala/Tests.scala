import munit.FunSuite

class JuegoTests extends FunSuite {

  // Pruebas personajes
  test("Los personajes están vivos al ser inicializados") {
    val paladin = new Paladin("Ruperto", 100, 50, 30)
    val guerrero = new Guerrero("Furro", 120, 40, 35)
    val ninja = new Ninja("DonDCC", 80, 30, 20)
    val magoNegro = new MagoNegro("Camilo", 70, 20, 25, 150)
    val magoBlanco = new MagoBlanco("Yael", 65, 25, 22, 180)

    assert(paladin.estaVivo, "El paladín debe estar vivo")
    assert(guerrero.estaVivo, "El guerrero debe estar vivo")
    assert(ninja.estaVivo, "El ninja debe estar vivo")
    assert(magoNegro.estaVivo, "El mago negro debe estar vivo")
    assert(magoBlanco.estaVivo, "El mago blanco debe estar vivo")
  }

  // Pruebas para party
  test("El party puede agregar miembros y verificar si está derrotado") {
    val party = new Party
    val paladin = new Paladin("Furro1", 100, 50, 30)
    val guerrero = new Guerrero("Furro2", 0, 40, 35) // este guerrero está "muerto"

    party.agregarMiembro(paladin)
    party.agregarMiembro(guerrero)

    assert(!party.estaDerrotado, "El party no debe estar derrotado con al menos un personaje vivo")

    // Ahora todos están muertos
    paladin.puntosDeVida = 0
    assert(party.estaDerrotado, "El party no puede estar vivo con todos los personajes miuertos")
  }

  // Pruebas enemigos
  test("Los enemigos pueden cambiar de estado de vivo a muerto") {
    val enemigo = new Enemigo("Goblin", 50, 15, 10, 5)
    assert(enemigo.estaVivo, "El enemigo debe estar inicialmente vivo")

    enemigo.puntosDeVida = 0
    assert(!enemigo.estaVivo, "El enemigo debe estar muerto si sus puntos de vida son 0")
  }

  // Pruebas para verificar la gestión y funcionalidad de las armas
  test("Las armas son asignadas correctamente a los personajes") {
    val espada = new ArmaNormal("Espada Larga", 15, 10, None)
    val bastonMagico = new ArmaMagica("Bastón de Sabio", 10, 20, 5, None)

    val paladin = new Paladin("Anakena", 100, 50, 30)
    espada.dueno = Some(paladin)
    assert(espada.dueno.contains(paladin), "La espada debe estar asignada al paladín")

    val magoBlanco = new MagoBlanco("Darío", 65, 25, 22, 180)
    bastonMagico.dueno = Some(magoBlanco)
    assert(bastonMagico.dueno.contains(magoBlanco), "El bastón mágico debe estar asignado al mago blanco")
  }
}