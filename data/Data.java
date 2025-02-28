package programacaomodular.datamain;

/**
 *
 * @author Nico
 */

public class Data {
    private int dia;
    private int mes;
    private int ano;

        private void init(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (!dataValida()) {
            this.dia = 25;
            this.mes = 2;
            this.ano = 2005;
        }
    }

    public Data(int dia, int mes, int ano) {
        init(dia, mes, ano);
    }
    
    public Data(int dia, int mes){
        init(dia,mes,2005);
    }
    
    public Data(){
        init(25,2,2005);
    }
    
    public boolean dataValida(){
        int[] mes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if(this.ano < 0){
            return false;
        }
        
        if(this.mes < 1 || this.mes > 12){
            return false;
        }
        
        if(anoBissexto()){
            mes[1]=29;
        }
        
        if(this.dia <= 0 && this.dia > mes[this.mes-1]){
            return false;
        }
        return true;
    }
    
    public boolean anoBissexto(){
        if((ano % 4 == 0 && ano % 100!= 0)||(ano%400==0)){
            return true;
        } else{
            return false;
        }
    }
    
    public String dataFormatada(){
        return this.dia+ "/" + this.mes + "/" + this.ano;
    }
}
