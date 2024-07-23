package org.lang;

public class LanguageInfo extends StateDetails{
	public void tamilLanguage() {
		System.out.println(" TAMIl Language");
	}
	public void englishLanguage() {
		System.out.println("ENGLISH Language ");
	}
	public void hindiLanguage() {
		System.out.println(" HINDI Language ");
	}
	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		l.southIndia();
		l.northIndia();
	}
}
