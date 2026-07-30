# Ejercicio 06 — Interface de notificaciones

## Enunciado
Crear una interface `CanalNotificacion` con un metodo `enviar(String mensaje, String destinatario)`.
Implementarla en `NotificacionEmail` y `NotificacionSMS`, cada una con un mensaje distinto.

## Archivos
| Archivo | Descripcion |
|---|---|
| `CanalNotificacion.java` | Interface con `enviar()` |
| `NotificacionEmail.java` | Implementa `CanalNotificacion`, envia por email |
| `NotificacionSMS.java` | Implementa `CanalNotificacion`, envia por SMS |
| `Main.java` | Prueba ambos canales de notificacion |

## Clave del ejercicio
- Misma interface, distinto comportamiento en cada implementacion
- Polimorfismo: una variable `CanalNotificacion` puede referirse a cualquier canal
- Facil de extender: agregar `NotificacionPush` no requiere modificar lo existente
