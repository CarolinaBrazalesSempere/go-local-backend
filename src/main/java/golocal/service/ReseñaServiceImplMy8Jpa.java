package golocal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import golocal.modelo.dto.ReseñaDTO;
import golocal.repository.ReseñaRepository;
import java.util.List;

@Service
public class ReseñaServiceImplMy8Jpa implements ReseñaService{

    @Autowired
    private ReseñaRepository reseñaRepository;

    public List<ReseñaDTO> getReseñasByGuiaId(int idGuia) {
        return reseñaRepository.findReseñasByGuiaId(idGuia);
    }
}
