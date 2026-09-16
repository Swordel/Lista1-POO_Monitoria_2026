package com.listaP1;

public class MonitoriaPOO {

    public static void main(String[] args) {
        
        //=================== Exercício 1
        /*
        Churrasco ch = new Churrasco();

        Pessoa p1 = new Pessoa("Gaby", "F", 31, false);
        Pessoa p2 = new Pessoa("Bela", "F", 2, false);   //2 anos, não consome
        Pessoa p3 = new Pessoa("Xuxu", "M", 12, false);  // 12 anos, 1 kg
        Pessoa p4 = new Pessoa("Joao", "M", 15, true);  //é vegetariano

        ch.verificarConsumo(p1);
        System.out.println(p1.getNome() + ": " + ch.getQtdCarne() + "kg");

        ch.verificarConsumo(p2);
        System.out.println(p2.getNome() + ": " + ch.getQtdCarne() + "kg");

        ch.verificarConsumo(p3);
        System.out.println(p3.getNome() + ": " + ch.getQtdCarne() + "kg");

        ch.verificarConsumo(p4);
        System.out.println(p4.getNome() + ": " + ch.getQtdCarne() + "kg");
        */

       //=================== Exercício 2
       /*
        Lampada l = new Lampada();

        System.out.println(l.checaEstado()); // APAGADA
        l.click();
        System.out.println(l.checaEstado()); // ACESA
        l.click();
        System.out.println(l.checaEstado()); // APAGADA
        l.click();
        System.out.println(l.checaEstado()); // ACESA
        System.out.println(l.getContagem()); // 2
        */

       //=================== Exercício 3
        /*
        Complexo c1 = new Complexo(3, 2);  
        Complexo c2 = new Complexo(1, 4);   

        System.out.println("c1 = " + c1);                        // 3.0 + 2.0i
        System.out.println("Soma = " + c1.soma(c2));               // 4.0 + 6.0i
        System.out.println("Mult = " + c1.multiplica(c2));         // -5.0 + 14.0i
        System.out.println("Modulo = " + c1.modulo());               // 3.605...
        System.out.println("Arg Principal = " + c1.argumentoPrincipal());   // 0.588... radianos

        System.out.println("Modulo c2 = " + c2.modulo());      //4.123105...         
        System.out.println("Arg Principal c2 = " + c2.argumentoPrincipal());   //1.325817...
        
        */

        //=================== Exercício 4
        /*

        Cliente c = new Cliente("Gaby",100,500);
        System.out.println(c.obterNome());
        System.out.println("Saldo + Limite = " + c.checarSaldo()); //600
        c.sacar(300);
        System.out.println("Apos sacar 300: " + c.checarSaldo()); // 300 (saldo=-200, limite=500)
        c.sacar(400); // saldo=-200, limite=500 → disponível=300 -> insuficiente

        c.depositar(150);
        System.out.println("Apos depositar 150: " + c.checarSaldo()); // 450

        c.sacar(450);
        System.out.println("Saldo + Limite = " + c.checarSaldo()); // 0
        System.out.println(c.getSaldo()); //-500, saldo totalmente negativo

        c.depositar(501);
        System.out.println("Saldo + Limite = " + c.checarSaldo()); // 1
        System.out.println(c.getSaldo()); //-499
    
        */
        //=================== Exercício 5
        /*
        Triangle t = new Triangle(5);
        t.calcArea();
        t.calcPerimetro();
        System.out.println("Lado: " + t.getLado()); // 5
        System.out.println("Area: " + t.getArea()); //10.82531754...
        System.out.println("Perimetro: " + t.getPerimetro()); //15
        
        */

        //=================== Exercício 6
        /*
        Jogo j = new Jogo();

        j.sortear();
        System.out.println("Sorteado = " + j.getNumeroSorteado()); //método extra auxiliar só pra confirmar

         if (j.adivinhar(1)) 
            System.out.println("Acertou! ^_^");
         else
            System.out.println("Errou! :C");
        */

       //=================== Exercício 7
        /*

        Eq2Grau eq = new Eq2Grau(1,-4,4); //Teste 1 = 1,2,-15 | Teste 2 = 1,2,5 | Teste 3 = 1,-4,4

        System.out.println("Delta = " + eq.delta()); // 64 | -16  | 0
        System.out.println("Raiz 1 = " + eq.raiz1()); // 3 | NaN  | 2
        System.out.println("Raiz 2 = " + eq.raiz2()); //-5 | NaN  | 2

        //O Java converte o Double.NaN para a string "NaN" automaticamente na concatenação.
        //Se o retorno for NaN, não dá erro, não lança exceção: É impresso literalmente a string -> "Raiz 1 = NaN"

        System.out.println("ou"); //Ou armazena numa variável pra imprimir bonitinho, como abaixo:

        double r = eq.raiz1();
        if (Double.isNaN(r)) 
            System.out.println("Não há raízes reais.");
        else
            System.out.println("Raiz 1: " + r);
        
        */

        //=================== Exercício 8
        /*
        Porta p1 = new Porta(false);
        Porta p2 = new Porta(false);
        Porta p3 = new Porta(false);

        System.out.println("P1 = " + p1.isOpen()); //fechada

        p1.abrir();                                 //1x
        System.out.println("P1 = " + p1.isOpen()); //aberta

        p1.abrir();                                 //não contabiliza, já está aberto
        p1.fechar();
        System.out.println("P1 = " + p1.isOpen());  //fechada

        System.out.println("P2 = " + p2.isOpen());  //fechada
        p2.abrir();                                 //2x
        p2.fechar();
        System.out.println("P2 = " + p2.isOpen());  //fechada

        System.out.println("P3 = " + p3.isOpen());  //fechada
        p3.abrir();                                 //3x
        System.out.println("P3 = " + p3.isOpen());  //aberta
        
        System.out.println(Porta.getNumAberturas()); //3
        */

        //**************** Outro exemplo abaixo, rode separadamente:
        /*
        Porta porta1 = new Porta(false);
        Porta porta2 = new Porta(false);

        porta1.abrir();
        porta1.fechar(); //Se tirar essa linha, o total de aberturas = 2

        porta2.abrir();
        porta2.fechar();

        porta1.abrir();

        System.out.println("Porta 1 esta aberta? " + porta1.isOpen()); //true
        System.out.println("Porta 2 esta aberta? " + porta2.isOpen()); //false

        System.out.println("Total de aberturas: " + Porta.getNumAberturas()); //3
        */

       //=================== Exercício 9

       
    }
}
