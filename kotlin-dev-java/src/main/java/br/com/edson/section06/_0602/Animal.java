package br.com.edson.section06._0602;

public class Animal {

    // Esse atributo e visto pelo Kotlin com um val, porque ele e uma constante final
    private final String name;

    // Esse atributo e visto pelo Kotlin com um val, porque ele e uma constante final
    private final String kind;

    // Esse atributo e visto pelo Kotlin com um var
    private Integer weight;

    public Animal(String name, String kind, Integer weight) {
        this.name = name;
        this.kind = kind;
        this.weight = weight;
    }

    public String show() {
        return name +  " is a " + kind + " and weights " + weight + " kg!";
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public Integer getWeight() {
        return weight;
    }

    // Como esse atributo temos o Setter para ele
    // Podemos manipular ou modificar seu valor durante o
    // uso dessa classe no Kotlin
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
