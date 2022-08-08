package br.com.edson.section06._0603;

import br.com.edson.section05._0504.MaxKt;

public class HelloKotlinFromJava {

    public static void main(String[] args) {

        Person edson = new Person("Edson", "Barbosa");
        System.out.println("His name is " +  edson.getFirstName());

        // Alterando atributos
        edson.setFirstName("Uncle Edson");
        System.out.println("Now his name is " + edson.getFirstName());

        Integer maxInt = MaxKt.max(2001, 2022);
        System.out.println("The max value is " + maxInt);
    }
}
