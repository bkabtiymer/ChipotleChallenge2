package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Main {



    public static void main(String[] args) {



//        First Populate arrays with ingredients
        String rice[] = {"white", "brown", "no rice"};

        String meat[] = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};

        String beans[] = {"pinto", "black", "no beans"};

        String salsa[] = {"mild", "medium", "hot", "no salsa"};

        String veggies[] = {"lettuce", "fajita veggies", "no veggies"};

//       Generate a random combination of ingredients
        Random rand = new Random();
//       Insert a for-loop statement to repeat the same fuction 10 times
        for(int i =1;i<=10;i++){
            System.out.print("Burrito "+i+" is: ");
//            Combine the ingredients and the generator to make each burrito
            String yum= (rice[rand.nextInt(rice.length-1)]+","+meat[rand.nextInt(meat.length-1)]+" ,"+beans[rand.nextInt(beans.length-1)])+","+(salsa[rand.nextInt(salsa.length-1)])+"," +(veggies[rand.nextInt(veggies.length-1)]);
            System.out.println(yum);
        }



////
    }




}
