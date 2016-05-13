package gticket

class Estabelecimento {

	String nome
	String endereco
	Boolean temEstacionamento
	
	static mapping = {
		id generator: 'identity'

	}
    static constraints = {
		
		nome nullable:false, blank:false, maxSize:128, unique:true
		endereco nullable:false, blank:false, maxSize:256
		temEstacionamento nullable:false, blank:false
	}
}
