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
	
for(int i=1; i<=100; i++) {
	Libro libros=new Libro();
	Integer libroCasuale = rnd.nextInt(1,5);
	Integer scaf=rnd.nextInt(1,20);
	
	String autore =f.book().author();
	String titolo=f.book().title();
	libros.setAutore(autore);
	libros.setTitolo(titolo);
	libros.setScaffale(scaf);
	
   if(libroCasuale==1) 
	libros.setSezione(sezione.giallo.toString());
	else if(libroCasuale==2)
    libros.setSezione(sezione.fantasy.toString());
	else if(libroCasuale==3)
	libros.setSezione(sezione.horror.toString());
	else if(libroCasuale==4)
	libros.setSezione(sezione.romanzo.toString());
	else if(libroCasuale==5)
	libros.setSezione(sezione.scientifico.toString());
	libros.setIdLibro(i);
	
	libri.add(libros);
	
	
	
	Associato associatone=new Associato();
	Integer casualeLibri=rnd.nextInt(1,10);
	String nom1=f.name().fullName();
	
	associatone.setLibriPresi(casualeLibri);
	associatone.setNominato(nom1);
	
	if(libroCasuale==1)associatone.setStato(stato.attivo.toString());
	else associatone.setStato(stato.rimosso.toString());
	
	associatone.setIdAssociato(i);
	idassociato.add(associatone);
}

for(Libro libros:libri) 
System.out.println(libros);
	
for ( Associato associatone:idassociato) 
System.out.println(associatone);
Integer remove1=rnd.nextInt(1,99);

libri.remove(remove1);
idassociato.remove(remove1);
System.out.println("Associato rimosso "+idassociato);

System.out.println("Libro rimosso "+libri);

}
}

