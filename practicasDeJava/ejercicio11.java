package practicasdejava;

public class ejercicio11 {
    public static void main(String[] args) {

        int[] arreglo1={1,2,3,4,5,};
        int[] arreglo2=new int[arreglo1.length];

        for(int i=(arreglo1.length-1),j=0; i>=0; i--, j++){
            arreglo2[j]=arreglo1[i];

            System.out.println(arreglo2[j]);
        }
    }
}
