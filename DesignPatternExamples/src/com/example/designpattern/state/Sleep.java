package com.example.designpattern.state;

public class Sleep implements State {

	@Override

	public void on_button(Light light) {

		light.setState( new ON() );

	}

	@Override
	public void off_button(Light light) {
                light.setState( new OFF());
	}

}
