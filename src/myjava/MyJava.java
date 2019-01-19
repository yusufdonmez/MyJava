/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

/**
 *
 * @author yusuf
 */
public class MyJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Merhaba Ders");
        insan Ali = new insan();
        Ali.boy = 180;
        Ali.kilo = 60;
        Ali.yas = 22;
        System.out.println("Alini yası: "+Ali.yas+" Alini kilosu: "+Ali.kilo+" ali boy: "+Ali.boy);
        insan Veli = new insan();
        Veli.boy=170;
        Veli.yas=25;
        Veli.kilo=55;
        System.out.println("Velini yası: "+Veli.yas+" Velini kilosu: "+Veli.kilo+" ali boy: "+Veli.boy);
        Ali.maas = 100;
        Ali.zam(20);
        Ali.yemek();
        System.out.println("ali maas: "+Ali.maas);
        System.out.println("ali kilo: "+Ali.kilo);
        Ali.zam(30);
        System.out.println("ali maas: "+Ali.maas);
    }
    
}
