package com.ludo.app.model;

import java.awt.Color;

public class GreenCamp implements Camp{

	@Override
	public int[] getCampLocation() {
		// TODO Auto-generated method stub
		return new int[] {72,74,75,76};
	}

	@Override
	public int getStart() {
		// TODO Auto-generated method stub
		return 32;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.GREEN;
	}
}
