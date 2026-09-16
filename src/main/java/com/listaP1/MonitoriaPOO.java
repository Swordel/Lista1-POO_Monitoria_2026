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

         if (j.advinhar(1)) 
            System.out.println("Acertou! ^_^");
         else
            System.out.println("Errou! :C");
        */

       //=================== Exercício 7
    }
}
