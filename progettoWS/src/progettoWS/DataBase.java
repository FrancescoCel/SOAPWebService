package progettoWS;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class DataBase {
	List<String> nCards = new ArrayList<String>();
	List<String> pins = new ArrayList<String>();
	Map<String,String> funds = new HashMap<String,String>();
	
	
	public void initCards(){
		nCards.add("1234");
		nCards.add("8346");
		nCards.add("9374");
		nCards.add("5473");
	}
	public void initPins(){
		pins.add("0000");
		pins.add("2834");
		pins.add("5672");
		pins.add("1849");
	}
	public void initFunds(){
		funds.put("1234", "$50000");
		funds.put("8346", "$3500");
		funds.put("9374", "$43000");
		funds.put("5473", "$15000");
	}
	public Map<String,String> getFunds(){
		return funds;
	}
	public List<String> getCards(){
		return nCards;
	}
	public List<String> getPins(){
		return pins;
	}
	
	public String controller(String nCard, String pin){
		initCards();
		initPins();
		initFunds();
		if (getCards().contains(nCard) && getPins().contains(pin)){
			return getFunds().get(nCard); 
		}else {
			return "Accesso Negato";
		}
	}
}
