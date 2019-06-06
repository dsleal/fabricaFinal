package br.com.senai.fatesg.fabrica.entidade;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.ambientinformatica.util.AmbientValidator;

@Entity
public class TipoDeItemServico  {
	
	@Id
	@GeneratedValue(generator = "tipodeitemservico_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "tipodeitemservico_seq", sequenceName = "tipodeitemservico_seq", allocationSize = 1, initialValue = 1)
	private Integer id;
	
	@NotEmpty(message="Informe a descriçao do tipo de Item de Serviço.", groups=AmbientValidator.class)
    @Column(length=40, nullable=false)
    @Length(min=0, max=40, message="O limite do campo descrição do tipo de Item de Serviço é de 40 caracteres.", groups=AmbientValidator.class)
	private String descricao;
	private boolean desativado;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isDesativado() {
		return desativado;
	}
	public void setDesativado(boolean desativado) {
		this.desativado = desativado;
	}
	
	

}
