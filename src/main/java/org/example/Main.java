package org.example;


import java.util.Scanner;
import java.util.*;
import java.io.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws IOException {

        ArrayList<Judet> judet = new ArrayList<>();
        Scanner sc = new Scanner(new File("/Users/mattias/Desktop/labwork01/Colocviu/judete.txt"));
        while (sc.hasNextLine()) {
            String linie = sc.nextLine();
            String[] parts = linie.split(" ");
            String codISO = parts[0];
            String nume = parts[1];
            String regiune = parts[2];
            int locuitori = Integer.parseInt(parts[3]);
            int suprafata = Integer.parseInt(parts[4]);

            judet.add(new Judet(codISO, nume, regiune, locuitori, suprafata));
            ModAfisare afisare = new Consola();
            afisare.Afiseaza(judet);
        }
        sc.close();
    }
}
