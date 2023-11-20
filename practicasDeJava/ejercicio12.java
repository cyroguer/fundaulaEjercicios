package practicasdejava;

import java.util.Arrays;

public class ejercicio12 {
    public static void main(String[] args) {
        int [] lista={5,6,2,10,1,31231,131,4,7};
        //Arrays.sort(lista);
        //System.out.println(Arrays.toString(lista));
        for (int i=0; i < lista.length -1; i++){
            for (int j=i+1; j < lista.length; j++){
                if (lista [j] < lista[i]){
                    int arreglo2= lista[j];
                    lista[j]=lista[i];
                    lista[i]=arreglo2;
                }
            }
        }
        System.out.println(Arrays.toString(lista));
}
}