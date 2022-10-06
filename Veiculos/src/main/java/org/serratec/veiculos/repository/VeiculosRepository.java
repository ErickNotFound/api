package org.serratec.veiculos.repository;

import org.serratec.veiculos.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculo, Integer> {

}