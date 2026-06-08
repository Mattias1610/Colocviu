package org.example;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Judet {
    public String cod;
    public String numeJudet;
    public String regiuneDezvoltare;
    public int nrLocuitori;
    public int suprafata;

    public Judet(String cod, String numeJudet, String regiuneDezvoltare, int nrLocuitori, int suprafata ){
        this.cod = cod;
        this.numeJudet = numeJudet;
        this.regiuneDezvoltare = regiuneDezvoltare;
        this.nrLocuitori = nrLocuitori;
        this.suprafata = suprafata;
    }


}

interface ModAfisare{
    void Afiseaza(ArrayList<Judet> judete);
}

class Consola implements ModAfisare {
    @Override
    public void Afiseaza(ArrayList<Judet> judete) {
        System.out.println("Lista Județe");
        for (Judet judet : judete) {
            System.out.println(judet.numeJudet + " (" + judet.cod + ") - Regiunea: " + judet.regiuneDezvoltare + " | Locuitori: " + judet.nrLocuitori + " | Suprafață: " + judet.suprafata + " km");
        }
    }
}

class Fisier implements ModAfisare{
    private String numeFisier;
    public Fisier(String numeFisier){
        this.numeFisier = numeFisier;
    }
    @Override
    public void Afiseaza(ArrayList<Judet> judete){
        try(PrintWriter writer = new PrintWriter(numeFisier)){
            writer.println("Judete");
            for(Judet j : judete){
                writer.println(j.toString());
            }
        }
        catch (Exception e){
            System.out.println("Eroare");
        }

    }
}