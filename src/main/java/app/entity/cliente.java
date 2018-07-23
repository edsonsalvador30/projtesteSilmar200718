package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CLIENTE
 * @generated
 */
@Entity
@Table(name = "\"CLIENTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.cliente")
public class cliente implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nom_cliente", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nom_cliente;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_equip", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Equipamento fk_equip;

  /**
   * Construtor
   * @generated
   */
  public cliente(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public cliente setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nom_cliente
   * return nom_cliente
   * @generated
   */
  
  public java.lang.String getNom_cliente(){
    return this.nom_cliente;
  }

  /**
   * Define nom_cliente
   * @param nom_cliente nom_cliente
   * @generated
   */
  public cliente setNom_cliente(java.lang.String nom_cliente){
    this.nom_cliente = nom_cliente;
    return this;
  }

  /**
   * Obtém fk_equip
   * return fk_equip
   * @generated
   */
  
  public Equipamento getFk_equip(){
    return this.fk_equip;
  }

  /**
   * Define fk_equip
   * @param fk_equip fk_equip
   * @generated
   */
  public cliente setFk_equip(Equipamento fk_equip){
    this.fk_equip = fk_equip;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    cliente object = (cliente)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
