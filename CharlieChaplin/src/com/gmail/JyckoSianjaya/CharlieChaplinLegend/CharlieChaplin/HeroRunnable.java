package com.gmail.JyckoSianjaya.CharlieChaplinLegend.CharlieChaplin;

import java.util.ArrayList;


import org.bukkit.scheduler.BukkitRunnable;


public class HeroRunnable {
	private MakeTheWorldBetter m;
	private ArrayList<SimpleTask> tasks = new ArrayList<SimpleTask>();
	public HeroRunnable(MakeTheWorldBetter m) {
		this.m = m;
		initialize();
	}
	public void addTask(SimpleTask task) {
		this.tasks.add(task);
	}
	private void initialize() {
		new BukkitRunnable() {
			@Override
			public void run() {
				for (SimpleTask task : new ArrayList<SimpleTask>(tasks)) {
					if (task.isDestroyed()) {
						tasks.remove(task);
					}
					if (task.getHealth() <= 0) {
						tasks.remove(task);
						task.runTaskOnDeath();
						task.destroy();
						continue;
					}
					task.reduceHealth();
					task.run();
				}
			}
		}.runTaskTimerAsynchronously(m, 80L, 80L);
	}
}
