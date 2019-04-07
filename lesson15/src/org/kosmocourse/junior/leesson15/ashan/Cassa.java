package org.kosmocourse.junior.leesson15.ashan;

import org.kosmocourse.junior.leesson15.ashan.country.Coutry;
import org.kosmocourse.junior.leesson15.ashan.country.Iran;
import org.kosmocourse.junior.leesson15.ashan.country.Russia;
import org.kosmocourse.junior.leesson15.ashan.country.Turkish;
import org.kosmocourse.junior.leesson15.ashan.employee.Cassir;
import org.kosmocourse.junior.leesson15.ashan.employee.ICassir;
import org.kosmocourse.junior.leesson15.ashan.employee.Manager;
import org.kosmocourse.junior.leesson15.ashan.gadgets.Gadget;
import org.kosmocourse.junior.leesson15.ashan.gadgets.PC;
import org.kosmocourse.junior.leesson15.ashan.gadgets.TV;
import org.kosmocourse.junior.leesson15.ashan.product.Apple;
import org.kosmocourse.junior.leesson15.ashan.product.Bred;
import org.kosmocourse.junior.leesson15.ashan.product.Food;
import org.kosmocourse.junior.leesson15.ashan.product.Tomato;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Cassa {

    private ICassir cassir;

    <T extends ICassir> Cassa (T cassir){
        this.cassir = cassir;
    }

    public static <T extends AbstractBox> void printer(T box){
        System.out.println(box);
        System.out.println(box.getEntity());
    }

    public static void printer2(Box<?> box){
        System.out.println(box);
        System.out.println(box.getEntity());
    }

    public static void main(String[] args) {

        Cassa cassa1 = new Cassa(new Cassir());
        Cassa cassa2 = new Cassa(new Manager());


        Packet<Apple, Coutry> packet1 = new Packet<>();
        packet1.setProduct(new Apple());
        packet1.setConutry(Coutry.TR);
//        packet1.setProduct(new Tomato());

        Packet<Bred, Coutry> packet2 = new Packet<>();
        packet2.setProduct(new Bred());
        packet2.setConutry(Coutry.RU);

        Packet<Tomato, Coutry> packet3 = new Packet<>();
        packet3.setProduct(new Tomato());
        packet3.setConutry(Coutry.IR);

        System.out.println(packet1.getProduct());
        System.out.println(packet2.getProduct());
        System.out.println(packet3.getProduct());

        if (Coutry.TR.equals(packet1.getConutry())) {
            System.out.println("price: 3$");
        } else {
            System.out.println("price: 33$");
        }

        //RAW TYPE
        //Packet<Object, Object> packet4 = new Packet<>();

        List list = new LinkedList();
        //packet1.setProduct(new Bred());

        Box<Gadget> box = new Box<>();
        //box.setEntity(new Apple());
        box.setEntity(new PC());

        BubbleBox<TV> bubbleBox = new BubbleBox<>();
        bubbleBox.setEntity(new TV());

        FNStorage<Long, AbstractBox> storage = new FNStorageImpl<>();
        storage.save(1L, packet1);
        storage.save(2L, packet2);
        storage.save(3L, packet3);
        storage.save(44L, box);
        storage.save(5L, bubbleBox);


        printer(packet1);
//        printer("asas");

        if (packet1 instanceof Packet) {
            System.out.println("Это пакет!");
        }
//        if (packet1 instanceof Packet<Apple, Coutry>) {
//            System.out.println("Это пакет!");
//        }

        AbstractBox<Apple> absBox = (AbstractBox<Apple>)packet1;


    }
}
