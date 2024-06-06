package golocal.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReseñaDTO {
	private double puntuacion;
	private String contenido;
	private String nombreCliente;
}
