package ejecutable;

import modelo.Coordenada;

public class Test {
    public static void main(String[] args) {
        //Punto 2
        Coordenada c1 = new Coordenada(1, 1);
        Coordenada c2 = new Coordenada(1, 1);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        if(c1.equals(c2))
        {
            System.out.println("Son las mismas coordenadas");
        }
        else
        {
            System.out.println("No son las mismas coordenadas");
        }
    }
}
