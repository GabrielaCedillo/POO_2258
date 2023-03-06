package org.example;
import java.awt.*;

public class Perro {
    //atributos
    private String raza;
    private float tamanio;
    private Color color;
    private String nombre;
    private int patas;
    // metodo constructor
    public Perro(){
    }
    public Perro(String raza, float tamanio, Color color, String nombre, int patas){
        this.raza = raza;
        this.tamanio = tamanio;
        this.color = color;
        this.nombre = nombre;
        this.patas = patas;
    }
    public Perro(String raza, String nombre){
        this.raza = raza;
        this.nombre = nombre;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public void setTamanio(float tamanio){
        this.tamanio = tamanio;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getPatas(){
        return patas;
    }
    public int setPatas(int patas){
        this.patas =patas;
    }
    //toString
    @Override
    publig String toString(){
        return "Perro{" +
                "raza=" +raza +
                ", tamanio=" + tamanio +
                ", color=" + color +
                ", nombre='" + nombre + '\'' +
                ", patas=" + patas +
                '}';
    }
    public boolean morder(){

        boolean resultado = Math.random() >0.51;
        if (resultado==true){
            System.out.println(nombre + " esta mordiendo algo" );
        }
        else {
            System.out.println(nombre+ " No esta mordiendo nada");
        }

        return resultado;
    }

    public float correr (){
        float distancia = (float) Math.random();
        System.out.println(nombre +" recorrio: "+distancia +" distancia");

        return distancia;
    }

    public String comer (){
        int aleatorio = (int) (Math.random() *10+1);

        if((aleatorio==0) || (aleatorio==1) || (aleatorio==2) ||(aleatorio==3) ) {
            String comida = new String("Croquetas");
            System.out.println(nombre +" comió: "+comida);
            return comida;
        }
        if((aleatorio==4) || (aleatorio==5) || (aleatorio==6) ||(aleatorio==7) ) {
            String comida = new String("Pollo");
            System.out.println(nombre +" comió: "+comida);
            return comida;
        }

        return null;
    }
}


//TAREA PT.2

public class Puerta {
    //Generando atributos
    private String color;
    private float precio;
    private float altura;
    private String material;
    private float ancho;

    //Constructor por defecto
    public Puerta() {
    }

    //Constructor sobrecargado

    public Puerta(String  color, float precio, float altura, String material, float ancho) {
        this.color = color;
        this.precio = precio;
        this.altura = altura;
        this.material = material;
        this.ancho = ancho;
    }
    //Metodos de acceso
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    //Metodo to.String


    @Override
    public String toString() {
        return "Puerta{" +
                "color=" + color +
                ", precio=" + precio +
                ", altura=" + altura +
                ", material='" + material + '\'' +
                ", ancho=" + ancho +
                '}';
    }
    //metodos de uso general
    //metodos de uso general
    public boolean abrir;
    public boolean seguro;
    public boolean tiempo;
    }
    