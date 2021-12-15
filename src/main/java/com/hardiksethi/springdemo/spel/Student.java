package com.hardiksethi.springdemo.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("#{11+21}")
	private int x;
	
	@Value("#{false}")
	private boolean y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public boolean getY() {
		return y;
	}
	public void setY(Boolean y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + "]";
	}
	
}
