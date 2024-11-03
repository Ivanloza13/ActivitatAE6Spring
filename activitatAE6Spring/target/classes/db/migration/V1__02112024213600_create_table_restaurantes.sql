CREATE TABLE IF NOT EXISTS activitat."restaurantes" (
    restaurante_id uuid NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    capacidad INT NOT NULL,
    tipo_comida VARCHAR(50) NOT NULL,
    PRIMARY KEY (restaurante_id)
);