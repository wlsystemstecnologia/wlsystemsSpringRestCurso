package com.nelioalves.cursomc.domain;


import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nelioalves.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento{
	
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dataVencimento;
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dataPagamento;
	
	public PagamentoComBoleto(){
		
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido,  Date dataVencimento,  Date dataPagamento) {
		super(id, estado, pedido);
		// TODO Auto-generated constructor stub
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		
	}

	public Date getdataVencimento() {
		return dataVencimento;
	}

	public void setdataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getdataPagamento() {
		return dataPagamento;
	}

	public void setdataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	

}
