package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("clienteDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface clienteDAO extends JpaRepository<cliente, java.lang.String> {

  /**
   * Obtém a instância de cliente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM cliente entity WHERE entity.id = :id")
  public cliente findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de cliente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM cliente entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key fk_equip
   * @generated
   */
  @Query("SELECT entity FROM cliente entity WHERE entity.fk_equip.id = :id")
  public Page<cliente> findclientesByFk_equip(@Param(value="id") java.lang.String id, Pageable pageable);

}
