public class FuncaoNumero {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void numeroExtenso(){
        String[] unidades ={" ", " um"," dois"," três"," quatro"," cinco"," seis"," sete"," oito"," nove",
    " dez"," onze"," doze", " treze", " quatorze"," quinze"," dezesseis"," dezessete"," dezoito"," dezonove"};

        String[] dezenas = {" ", " ", " vinte", " trinta", " quarenta", " cinquenta", " sessenta", " setenta", " oitenta", " noventa" };
    
    if(numero >+ 0 && numero <= 99){
        if(numero<20){
            System.out.println(unidades[numero]);
        }else{
            int dezena = numero / 10;
            int unidade = numero % 10;
            System.out.println(dezenas[dezena]+(unidade != 0 ? " e"+ unidades[unidade] : " "));
        }
        }else{
        System.out.println("Número inválido");
    }
    
    }
}
