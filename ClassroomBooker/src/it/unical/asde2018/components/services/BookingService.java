package it.unical.asde2018.components.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.model.Prenotazione;
import it.unical.asde2018.model.User;
@Service
public class BookingService {
	List<Prenotazione> lista;
	public List<Prenotazione>getLista(){
		return lista;
	}

	@PostConstruct
	public void init() throws ParseException {
		lista=new ArrayList<>();
		Date start=new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("04/11/2018 11:00");
		Date end=new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("04/11/2018 12:00");
		lista.add(new Prenotazione("MT7",start,end,new User("GB","https://www.mat.unical.it/ianni/L_GB2.jpg")));
		lista.add(new Prenotazione("MT6",start,end,new User("Ciccio Ricca","https://www.mat.unical.it/ricca/stuffs/me.png")));
	}

	public String prenota(String aula, String start, String end, User user) throws ParseException {
		String res="";
		Date s=new SimpleDateFormat("dd/MM/yyyy hh:mm").parse(start);
		Date e=new SimpleDateFormat("dd/MM/yyyy hh:mm").parse(end);
		if(lista.stream().anyMatch(p->p.getAula().equals(aula) && (p.getInizio().compareTo(s)<=0&&p.getFine().compareTo(s)>=0)))
			res+= "Change start date; ";
		if(lista.stream().anyMatch(p->p.getAula().equals(aula) && (p.getInizio().compareTo(s)<=0&&p.getFine().compareTo(s)>=0)))
			res+= "Change end date";

		if(res.equals(""))
			lista.add(new Prenotazione(aula,s,e,user));
		return res;

	}



}
