package com.listaP1;

/*Do enunciado:
    "OBS: O atributo numAberturas deve contar
        o total de aberturas de todas as portas possiveis."
    ---> Portanto, numAberturas é static! */

public class Porta {

    private boolean isOpen; //em java, boolean começa false por padrão, mas optei por passar parâmetro pelo construtor
    private static int numAberturas;

    public Porta(boolean isOpen){
        this.isOpen = isOpen;
    }

    public void abrir(){
        if(!isOpen()){  //aqui fiz com o método getter. Poderia ser pelo atributo: if(isOpen == false) ou ainda if(!isOpen)
            isOpen = true;
            numAberturas++;
        }
   }

    public void fechar(){
        if(isOpen()) //Poderia ser pelo atributo: if(isOpen == true) ou ainda if(isOpen). Ambos produzem o mesmo resultado, já que você está dentro da própria classe Porta, então tem acesso direto ao atributo privado.
            isOpen = false; //o if aqui não é necessário; não tem problema fechar o que já tá fechado para a contagem de aberturas.
    }

    public boolean isOpen(){
        return isOpen;
    }

     public static int getNumAberturas() {
        return numAberturas;
    }

}
