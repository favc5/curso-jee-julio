package cl.ibm.auto.arriendo;

import cl.ibm.auto.Automovil;
import cl.ibm.auto.Chevrolet;

public class Audi {

		public void acelerar() {
			Automovil auto = new Chevrolet();
			
			auto = new Ford();
			
			auto.acelerar();
			
			boolean c = (auto instanceof Chevrolet)? true : false;
			
			int i = 0;
			boolean x = true;
			for (; x ;) {
				i++;
			}
		}
}
