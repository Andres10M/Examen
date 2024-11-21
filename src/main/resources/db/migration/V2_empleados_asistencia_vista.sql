CREATE VIEW empleados_asistencia_vista AS
SELECT
    ea.id,
    ea.nombre,
    ea.fecha,
    ea.hora_entrada AS horaEntrada,
    ea.hora_salida AS horaSalida,
    d.nombre AS departamento
FROM empleados_asistencia ea
         JOIN departamentos d ON ea.departamento_id = d.id;
