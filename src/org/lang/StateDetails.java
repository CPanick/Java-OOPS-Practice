package org.lang;

public class StateDetails {
	
	public void southIndia() {
		System.out.println("South India : Tamil Nadu, Kerala, Karnataka, Andhra Pradesh");
	}
	public void northIndia(){
		System.out.println("North India : UP, MP, Delhi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateDetails sd = new StateDetails();
		sd.southIndia();
		sd.northIndia();
		LanguageInfo lang = new LanguageInfo();
		lang.tamilLanguage();
		lang.hindiLanguage();
		lang.englishLanguage();

	}

}
