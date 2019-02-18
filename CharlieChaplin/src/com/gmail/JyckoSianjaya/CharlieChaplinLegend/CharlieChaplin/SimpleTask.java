package com.gmail.JyckoSianjaya.CharlieChaplinLegend.CharlieChaplin;

public interface SimpleTask {
	public int getHealth();
	public void reduceHealth();
	public void run();
	public void runTaskOnDeath();
	public boolean isDestroyed();
	public void destroy();
}
