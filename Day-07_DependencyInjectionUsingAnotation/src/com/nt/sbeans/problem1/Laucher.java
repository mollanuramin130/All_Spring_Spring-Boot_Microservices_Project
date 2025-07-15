package com.nt.sbeans.problem1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laucher {
		private Rocket rocket;

		public Laucher() {
			super();
		}
		
		@Autowired
		public void setRocket(Rocket rocket) {
			System.out.println("Laucher.setRocket()");
			this.rocket = rocket;
		}
		
		public void launch() {
			rocket.ignite("Full");
		}
}
