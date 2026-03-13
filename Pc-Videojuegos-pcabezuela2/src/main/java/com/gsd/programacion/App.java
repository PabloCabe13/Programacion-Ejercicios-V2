package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        // 2 argumentos
        if (args.length != 2) {
            System.err.println("Error: Se necesitan 2 argumentos con formato 'tipo-nombre-ataque-defensa-pociones-nivel'.");
            return;
        }

        try {
            Personaje[] jugadores = new Personaje[2];

            for (int i = 0; i < 2; i++) {
                // Separamos guiones
                String[] datos = args[i].split("-");
                
                if (datos.length != 6) throw new Exception("Formato incorrecto en argumento " + (i + 1));

                String tipo = datos[0].trim().toLowerCase();
                String nom = datos[1].trim();
                int atq = Integer.parseInt(datos[2].trim());
                int def = Integer.parseInt(datos[3].trim());
                int poc = Integer.parseInt(datos[4].trim());
                int niv = Integer.parseInt(datos[5].trim());

                // Crear jugadores
                switch (tipo) {
                    case "guerrero": jugadores[i] = new Guerrero(nom, atq, def, poc, niv); break;
                    case "mago":     jugadores[i] = new Mago(nom, atq, def, poc, niv); break;
                    case "arquero":  jugadores[i] = new Arquero(nom, atq, def, poc, niv); break;
                    default: throw new PersonajeInvalidoException("Tipo " + tipo + " no válido.");
                }
                jugadores[i].mostrarInfo();
            }

            Personaje p1 = jugadores[0];
            Personaje p2 = jugadores[1];

            System.out.println("\n¡Batalla iniciada!");

            // Bucle batalla
            while (p1.estaVivo() && p2.estaVivo()) {
                // Turno P1: Curar si salud < 50 (consume turno)
                if (p1.getSalud() < 50 && p1.getPociones() > 0) {
                    p1.autoCurar();
                } else {
                    // 50% ataque especial
                    if (Math.random() < 0.5) {
                        if (p1 instanceof Guerrero) ((Guerrero) p1).golpeCritico(p2);
                        else if (p1 instanceof Mago) ((Mago) p1).lanzarHechizo(p2);
                        else if (p1 instanceof Arquero) ((Arquero) p1).disparoAcertado(p2);
                    } else {
                        p1.atacar(p2);
                    }
                }

                // Turno P2
                if (p2.estaVivo()) {
                    if (p2.getSalud() < 50 && p2.getPociones() > 0) {
                        p2.autoCurar();
                    } else {
                        if (Math.random() < 0.5) {
                            if (p2 instanceof Guerrero) ((Guerrero) p2).golpeCritico(p1);
                            else if (p2 instanceof Mago) ((Mago) p2).lanzarHechizo(p1);
                            else if (p2 instanceof Arquero) ((Arquero) p2).disparoAcertado(p1);
                        } else {
                            p2.atacar(p1);
                        }
                    }
                }
                
                // Info fin turno
                System.out.println("-- Fin turno – " + p1.toString() + " – " + p2.toString());
            }

            // Resultado final
            if (!p1.estaVivo()) System.out.println(p1.getNombre() + " ha sido derrotado.");
            else if (!p2.estaVivo()) System.out.println(p2.getNombre() + " ha sido derrotado.");

        } catch (NumberFormatException e) {
            System.err.println("Err: Las estadísticas deben ser números.");
        } catch (EstadisticaInvalidaException | PersonajeInvalidoException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Errr: " + e.getMessage());
        }
    }
}
