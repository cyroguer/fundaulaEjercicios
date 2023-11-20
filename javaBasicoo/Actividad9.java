package javabasicoo;

public class Actividad9 {
    public static void main(String[] args) {
        //String enunciado = ( "La lluvia en Sevilla es una maravilla");
        //System.out.println(enunciado.replace('a','e'));

        StringBuilder enunciado=new StringBuilder();
        enunciado.append("la noche en sevilla es una maravilla");
        for (int i=0; i<enunciado.length(); i++){
            char letra= enunciado.charAt(i);
            if (letra=='a'){
                enunciado.setCharAt(i,'e');
            }
        }
        System.out.println(enunciado);



        }

    }

