package atv_Cinema;
public class EntradaDeCinema {
	int sala, idade;
	float horario, valor;
public EntradaDeCinema (int sala, int idade, float horario, float valor) {
	this.sala= sala;
	this.idade=idade;
	this.horario=horario;
	this.valor=valor;
}public String calculaDesconto (int idade){
	if (idade<12) {
		valor= (float) (valor *0.5);
		return ("Teve desconto pela idade");
}else{
		/*valor=valor;*/
		return ("Não teve desconto");
}}public String calculaDesconto (int idade, int carteirinha) {
	if (carteirinha!=0) {
		if (idade>= 12 && idade <=15) {
			valor = (float) (valor*0.6);
			return ("Estudante teve desconto de 40%");
}else if(idade>=16 && idade<=20) {
			valor = (float) (valor*0.7);
			return ("Estudante teve desconto de 30%");
}else {
			valor=(float) (valor*0.8);
			return ("Estudante teve desconto de 20% ");
}}else{
		/*valor=valor;*/
		return ("Sem carteirinha");
}}public String calculaDescontoHorario(float horario) {
	if (horario <16) {
		valor = (float) (valor*0.9);
		return ("Teve desconto por causa do horário");
}else{
		/*valor=valor;*/
		return ("Não teve desconto pelo horário");
}}public String exibir() {
	return ("O valor do ingresso foi: "+ valor + "  O numero da sala é: " + sala + "  O horario  escolhido foi: "
			+ horario);
}}