package progettoWS;
import progettoWS.DataBase;

public class ProvaWS {
	
	public String access(String nCard, String pin){
		DataBase ctl = new DataBase();
		return ctl.controller(nCard, pin);
	}


}