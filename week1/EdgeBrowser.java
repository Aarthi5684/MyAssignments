package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser obj =new Browser();
		String browser=obj.launchBrowser("Edge");
		System.out.println("The browser is "+browser);
		obj.loadUrl();
	}

}
