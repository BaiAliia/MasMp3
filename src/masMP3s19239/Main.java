package masMP3s19239;

import masMP3s19239.masAbstractPolymorth.IgInfluencer;
import masMP3s19239.masAbstractPolymorth.Person;
import masMP3s19239.masAbstractPolymorth.Youtuber;
import masMP3s19239.masmp1Overlap.Game;
import masMP3s19239.masmp1Overlap.GameType;

import java.time.LocalDate;
import java.util.EnumSet;

public class Main {
    public static void main(String args[]){
        //Little documentation Mp3 Inheritance
        //Disjoint  Parent class Animal ,child classes Aquatic Terrestrial
        //Abstract  Parent abstract class Person ,Child classes Youtuber ,IgInfluenser ,abstract method is get income based on the number of followers
        //Polymorphic method call used in Class Person ,Youtuber,IgInfluencer
        //Overlapping  Classes Game and Gametype
        //Multi inheritance  so the hierarchy goes like this Animal-(Aquatic ,Terrestrial)-Amphibians (used an interface ITerrestrial for implementation)
        //Multi aspect didnt manage to implement it(
        //Dynamic as well(

        Aquatic a1=new Aquatic("Shark",150,"White,big,dangerous",true,-170);
        Terrestrial t1=new Terrestrial("monkey",70,"Cute funny ,red booty","Amazon",false);
         Amphibians am1=new Amphibians("Frog",1,"Noisy ,not cute",false,1,false,"Amazon");

       //Polymorphic method call
        Person p1i  =new IgInfluencer("H2oDelirious","del",25,16677,"hhhjdelirious");
        Person p2y=new Youtuber("Felix","Smth",23,"Pewdipie",100000,"Gaming ,minecraft");

         System.out.println( p1i.getIncome());
        System.out.println( p2y.getIncome());

        //Overlapping  Classes Game and Gametype
        Game g1= new Game(LocalDate.of(1869, 05, 16),"Little nighmares",13445, EnumSet.of(GameType.Escape,GameType.Horror),1,50,16);
       System.out.println(g1.toString());



    }
}
