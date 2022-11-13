package srl.neotech.corsojava.gestionebiblioteca;

import java.util.ArrayList;
import java.util.Random;

import com.github.javafaker.Faker;

import srl.neotech.corsojava.gestionebiblioteca.Associato.stato;
import srl.neotech.corsojava.gestionebiblioteca.Libro.sezione;

public class Startup {
	
static ArrayList <Libro> libri=new ArrayList  <Libro>();
static ArrayList <Associato> idassociato=new ArrayList <Associato>();

 public static void main(String[] args) {
	 
    Faker f=new Faker();
	Random 	rnd=new Random();
	Integer cons1=0;
	
for(int i=1; i<=100; i++) {
	Libro libros=new Libro();
	Integer libroCasuale = rnd.nextInt(1,5);
	
	String autore =f.book().author();
	String titolo=f.book().title();
	
    if(libroCasuale==1) {
	libros.setAutore(autore);
	libros.setTitolo(titolo);
	
	}
	
	else if(libroCasuale==2) {
		libros.setAutore("Manuel Casa");	
		libros.setTitolo("La grande societa'");
		libros.setScaffale(5);
		libros.setSezione(sezione.horror.toString());
	}

	else if(libroCasuale==3) {
		libros.setAutore("Patrick Casa");	
		libros.setTitolo("La grande scoperta");
		libros.setScaffale(2);
		libros.setSezione(sezione.fantasy.toString());
	}
	
	else if(libroCasuale==4) {
		libros.setAutore("Andrea Casa");	
		libros.setTitolo("Il primo serial killer d'America");
		libros.setScaffale(7);
		libros.setSezione(sezione.giallo.toString());
	}
	else if(libroCasuale==5) {
		libros.setAutore("Quinto Casa");	
		libros.setTitolo("La scoperta della luna");
		libros.setScaffale(8);
		libros.setSezione(sezione.scientifico.toString());
	}
	
	
	
	libros.setIdLibro(i);
	
	libri.add(libros);
	
	Associato associatone=new Associato();
	if(libroCasuale==1){
      associatone.setNominato("Roberto");
      associatone.setStato(stato.attivo.toString());
	}
	else if(libroCasuale==2){
	      associatone.setNominato("Massimiliano");
	      associatone.setStato(stato.rimosso.toString());
	}
	
	else if(libroCasuale==3){
	      associatone.setNominato("Alessandro");
	      associatone.setStato(stato.rimosso.toString());
	      
	}
	
	associatone.setIdAssociato(cons1);
	idassociato.add(associatone);
	
	
	
	
	
	
	
	}
	
	
for(Libro libros:libri) {
	
	System.out.println(libros);
	
for ( Associato associatone:idassociato) {
	
	System.out.println(associatone);
	
}
}
}
}

