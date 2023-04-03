package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity(name = "usuarios")
@Table(name="tb_usuarios")

@NamedQuery(name="UsuarioxTipo",
	query = "SELECT u FROM usuarios u WHERE u.idtipo =:tipo")

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_usua", unique=true, nullable=false)
	private int codigo;
	
	@Column(name="nom_usua", length=15)
	private String nombre;
	
	@Column(name="ape_usua", length=25)
	private String apellido;
	
	@Column(name="usr_usua", nullable=false, length=45)
	private String user;
	
	@Column(name="cla_usua", length=100)
	private String password;
	
	@Column(name="fna_usua")
	private String fecha_nacimiento;
	
	@Column(name="idtipo")
	private int idtipo;
	
	@Column(name="est_usua")
	private int estado;
		
}
