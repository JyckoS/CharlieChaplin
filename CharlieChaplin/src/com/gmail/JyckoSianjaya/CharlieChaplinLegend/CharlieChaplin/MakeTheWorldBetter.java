package com.gmail.JyckoSianjaya.CharlieChaplinLegend.CharlieChaplin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MakeTheWorldBetter extends JavaPlugin implements Listener {
	private SimpleTask task;
	@Override
	public void onEnable() {
		runnable = new HeroRunnable(this);
		this.getCommand("charliechaplin").setExecutor(new ChaplinCommand(this));
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public void onChat(PlayerChatEvent e) {
		if (task != null && !task.isDestroyed()) {
			e.setCancelled(true);
		}
	}
	@Override
	public void onDisable() {
		Utility.sendConsole("Charlie Chaplin: HUMANS, LET US ALL UNITE!");
		return;
	}
	public SimpleTask getTask() {
		return this.task;
	}
	public void setTask(SimpleTask tas) {
		this.task = tas;
	}
	private HeroRunnable runnable;
	public HeroRunnable getRunnable() {
		return this.runnable;
	}
}
