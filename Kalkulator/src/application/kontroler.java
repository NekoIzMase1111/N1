package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class kontroler {
	@FXML
	private Label tekst;
	
	
	
	public int rezultat = 0;
	private int temp = 0;
	
	public String brUstr = "";
	public int brUint = 0;
	
	private int index = 0;			//1-plus, 2-minus, 3-puta, 4-podeljeno,
	
	public void jedan() {
		brUstr += "1";
	}
	public void dva() {
		brUstr += "2";
	}
	public void tri() {
		brUstr += "3";
	}
	public void cetiri() {
		brUstr += "4";
	}
	public void pet() {
		brUstr += "5";
	}
	public void sest() {
		brUstr += "6";
	}
	public void sedam() {
		brUstr += "7";
	}
	public void osam() {
		brUstr += "8";
	}
	public void devet() {
		brUstr += "9";
	}
	public void nula() {
		brUstr += "0";
	}
	
	public void plus() {
		if(rezultat != 0) {
			temp = rezultat;
			brUint = 0;
			rezultat = 0;
		}else {
			brUint = Integer.parseInt(brUstr);
		}
		
		temp += brUint;
		brUstr = "";
		index = 1;
	}
	public void minus() {
		if(rezultat != 0) {
			temp = rezultat;
			brUint = 0;
			rezultat = 0;
		}else {
			brUint = Integer.parseInt(brUstr);
		}
		
		temp -= brUint;
		brUstr = "";
		index = 2;
	}
	public void pomnozi() {
		if(rezultat != 0) {
			temp = rezultat;
			brUint = 1;
			rezultat = 0;
		}else if((rezultat == 0) && (temp>1)) {
			brUint = Integer.parseInt(brUstr);
		}else {
			brUint = Integer.parseInt(brUstr);
			temp = 1;
		}
		
		temp *= brUint;
		brUstr = "";
		index = 3;
	}
	public void brisi() {
		temp = 0;
		rezultat = 0;
		index = 0;
		brUstr = "";
		brUint = 0;
		tekst.setText(Integer.toString(rezultat));
	}
	public void jednako() {
		if(index == 1) {
			plus();
			index = 0;
		}else if(index == 2) {
			minus();
			index = 0;
		}else if(index == 3) {
			pomnozi();
			index = 0;
		}

		rezultat = temp;
		tekst.setText(Integer.toString(rezultat));
		temp = 0;
	}
}
