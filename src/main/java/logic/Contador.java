package logic;

import application.Global;
import exceptions.CedulasInsuficientesException;
import exceptions.ResultadoImpossivelException;
import models.Valor;

public class Contador {

    private static Valor[] t = new Valor[6];

    private static int[] result = new int[6];

    public int[] testador(int teste){
        if (Global.banco.getTotal() < teste) throw new CedulasInsuficientesException();
        Valor.teste = teste;
        calcular();
        return result;
    }

    private static void calcular(){

        while (true){

            for (int cont = 0; t[0].isHabilited() && cont <= Global.banco.getQuantidade()[0]; cont++){

                if ((cont + 1) * Global.tipos[0].getValor() > Valor.teste){
                    t[0].setQuantidadePropria(cont);
                    t[0].setHabilited(false);
                }

                if (!t[1].isHabilited() && !t[2].isHabilited() && !t[3].isHabilited() && !t[4].isHabilited() && !t[5].isHabilited()) resetHabilited(0);
            }

            for (int cont = 0; t[1].isHabilited() && cont <= Global.banco.getQuantidade()[1]; cont++){

                if ((cont + 1) * Global.tipos[1].getValor() > Valor.teste){
                    t[1].setQuantidadePropria(cont);
                    t[1].setHabilited(false);
                }

                if (!t[2].isHabilited() && !t[3].isHabilited() && !t[4].isHabilited() && !t[5].isHabilited()) resetHabilited(1);
            }

            for (int cont = 0; t[2].isHabilited() && cont <= Global.banco.getQuantidade()[2]; cont++){

                if ((cont + 1) * Global.tipos[2].getValor() > Valor.teste){
                    t[2].setQuantidadePropria(cont);
                    t[2].setHabilited(false);
                }

                if (!t[3].isHabilited() && !t[4].isHabilited() && !t[5].isHabilited()) resetHabilited(2);
            }

            for (int cont = 0; t[3].isHabilited() && cont <= Global.banco.getQuantidade()[3]; cont++){

                if ((cont + 1) * Global.tipos[3].getValor() > Valor.teste){
                    t[3].setQuantidadePropria(cont);
                    t[3].setHabilited(false);
                }

                if (!t[4].isHabilited() && !t[5].isHabilited()) resetHabilited(3);
            }

            for (int cont = 0; t[4].isHabilited() && cont <= Global.banco.getQuantidade()[4]; cont++){

                if ((cont + 1) * Global.tipos[4].getValor() > Valor.teste){
                    t[4].setQuantidadePropria(cont);
                    t[4].setHabilited(false);
                }

                if (!t[5].isHabilited()) resetHabilited(4);
            }

            for (int cont = 0; t[5].isHabilited() && cont <= Global.banco.getQuantidade()[5]; cont++){

                if ((cont + 1) * Global.tipos[5].getValor() > Valor.teste){
                    t[5].setQuantidadePropria(cont);
                    t[5].setHabilited(false);
                }

            }

            if (Valor.valorAtual == Valor.teste) break;
            if (!t[0].isHabilited() && !t[1].isHabilited() && !t[2].isHabilited() && !t[3].isHabilited() && !t[4].isHabilited() && !t[5].isHabilited()) throw  new ResultadoImpossivelException();
        }

        for (int cont = 0; cont < 6; cont++){
            result[cont] = t[cont].getQuantidadePropria();
        }
    }

    private static void resetHabilited(int op){
        for (int cont = op; cont < 6; cont++){
            if (cont == op){
                t[cont].setHabilited(false);
            }
            else{
                t[cont].setHabilited(true);
                t[cont].reset();
                t[cont].setQuantidadePropria(0);
                t[cont].setValorProprio(0);
            }
        }
    }
}
