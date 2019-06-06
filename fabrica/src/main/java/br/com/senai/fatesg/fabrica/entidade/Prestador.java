package br.com.senai.fatesg.fabrica.entidade;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.ambientinformatica.util.AmbientValidator;

@Entity
public class Prestador {

	@Id
	@GeneratedValue(generator = "prestador_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "prestador_seq", sequenceName = "prestador_seq", allocationSize = 1, initialValue = 1)
	
	
	private Integer id;
	
    @NotEmpty(message="Informe o nome do Prestador.", groups=AmbientValidator.class)
    @Column(length=60, nullable=false)
    @Length(min=0, max=60, message="O limite do campo nome da prestador é de 60 caracteres.", groups=AmbientValidator.class)
	private String nome;
    
	private Date dataDeNascimento;
	private String identidade;
	/*
	@NotEmpty(message="Informe o CPF do Prestador.", groups=AmbientValidator.class)
    @Column(length=14, nullable=false, unique=true)
    @Length(min=0, max=14, message="O limite do campo CPF da fonecedor é de 11 caracteres.", groups=AmbientValidator.class)
	*/
	private String cpf;
	
	@NotEmpty(message="Informe o CNPJ do Prestador.", groups=AmbientValidator.class)
    @Column(length=18, nullable=false, unique=true)
    @Length(min=0, max=18, message="O limite do campo CNPJ da fonecedor é de 14 caracteres.", groups=AmbientValidator.class)
	private String cnpj;
	private String telefone;
	private String email;
	private String endereco;
	private String codigo_banco;
	private String agencia;
	private String conta;
	
	
   @OneToOne
   private TipoDePrestador tipoDePrestador;
   
   public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

@OneToOne
   private Usuario usuario;
   
   public String getCodigo_banco() {
	return codigo_banco;
}

public void setCodigo_banco(String codigo_banco) {
	this.codigo_banco = codigo_banco;
}

public TipoDePrestador getTipoDePrestador() {
	return tipoDePrestador;
}

public void setTipoDePrestador(TipoDePrestador tipoDePrestador) {
	this.tipoDePrestador = tipoDePrestador;
}

private String banco;
   private String senha;

   	public Date getDataDeNascimento() {
   		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getIdentidade() {
		return identidade;
	}
	
	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	@Column(name = "PRESTADOR_ID", unique = true, nullable = false)
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
	      return nome;
   }

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

   public Integer getId() {
      return id;
   }

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getBanco() {
		return banco;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getConta() {
		return conta;
	}
	
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}