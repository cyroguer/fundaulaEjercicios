package javabasicoo;

public class Actividad8 {
    public static void main(String[] args) {

        String enunciado ="La lluvia en Sevilla es una maravilla";
        int contador =0;

        for (int i=0; i<enunciado.length();i++){

            char checklist = enunciado.charAt(i);

           if (checklist=='a' || checklist=='e' ||checklist=='i'|| checklist=='o' ||checklist=='u' ){
               contador++;

           }

        }
        System.out.println("Las vocales en este enunciado son: " +contador);
    }
}
