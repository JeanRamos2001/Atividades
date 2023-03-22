package uea.pagamentos_api.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uea.pagamentos_api.dto.ResumoLancamentoDto;
import uea.pagamentos_api.models.Lancamento;
import uea.pagamentos_api.repositories.filters.LancamentoFilter;
import uea.pagamentos_api.repositories.lanmento.LancamentoRepositoryQuery;

@Repository
public interface LancamentoRepository extends 
	JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
	
	public Page<ResumoLancamentoDto> filtrar(
			LancamentoFilter lamcamentoFilter, Pageable pageable);

}
