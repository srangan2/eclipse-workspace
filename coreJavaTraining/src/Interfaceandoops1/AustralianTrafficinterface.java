package Interfaceandoops1;

import Interfaceandoops.CentralTraffic;

public class AustralianTrafficinterface implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic a = new AustralianTrafficinterface();
		a.redstop();
		a.flashingyellow();
		a.greengo();
		AustralianTrafficinterface c = new AustralianTrafficinterface();
		c.walkonsymbol();
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		{
			System.out.println("greengo implementation");
		}
		
	}

	
	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		{
			System.out.println("redstop implementation");
		}
	}

	public void walkonsymbol() 
	
	{
		System.out.println("walking implemented");
	}
	
	@Override
	public void flashingyellow() {
		// TODO Auto-generated method stub
		{
			System.out.println("flashingyellow implementation");
		}
	}

}
