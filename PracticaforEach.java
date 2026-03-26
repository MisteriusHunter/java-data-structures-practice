package com.mycompany.practicafor.each;

public class PracticaforEach {

    public static void main(String[] args) {
        String[]animales = {"gato","perro","rata","pajaro"};
                //for(int i=0; i< animales.length; i++){
                    //System.out.println(animales[i]);
                //}               for normal
                for(String i : animales){
                    System.out.println(i); //for each , mas facil y sencillo para mostrar los datos
                }
    }
}
