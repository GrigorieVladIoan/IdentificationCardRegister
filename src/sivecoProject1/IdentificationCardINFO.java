/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sivecoProject1;

/**
 *
 * @author PC
 */



public class IdentificationCardINFO implements java.io.Serializable{
    
    public String nume;
    public String prenume;
    public String cetatenie;
    public String locNastere;
    public String adresa;
    public int CNP;
    public String randomNumber; //not given, automated generated based on CNP + seria + nr
    public String dataNasterii; //different type needed
    public String seria;
    public int nr;
    public String valabilitate;// automated generated based on today's data + 7 years
    
    
    
    public IdentificationCardINFO(String inputNume, String inputPrenume, 
                                  String inputCetatenie, String inputLocNastere,
                                  String inputAdresa,
                                  int inputCNP, String inputDataNasterii,
                                  String inputSeria, int inputNr, String inputRandomNumber,String inputValabilitate){
        
        nume = inputNume;
        prenume = inputPrenume;
        cetatenie = inputCetatenie;
        locNastere = inputLocNastere;
        CNP = inputCNP;
        dataNasterii = inputDataNasterii;
        seria = inputSeria;
        nr = inputNr;
        adresa = inputAdresa;
        randomNumber = inputRandomNumber;
        valabilitate = inputValabilitate;
    }
    
}
