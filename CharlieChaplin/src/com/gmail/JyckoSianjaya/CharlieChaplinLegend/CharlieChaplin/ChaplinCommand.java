package com.gmail.JyckoSianjaya.CharlieChaplinLegend.CharlieChaplin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ChaplinCommand implements CommandExecutor {
	private MakeTheWorldBetter m;
	public ChaplinCommand(MakeTheWorldBetter m) {
		this.m = m;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		if (!sender.hasPermission("the.legend")) return true;
		redo(sender);
		return true;
	}
	private void redo(CommandSender snd) {
		if (m.getTask() != null && !m.getTask().isDestroyed()) return;
		Utility.broadcast("&7You will be listening to a speech made by &aCharlie Chaplin&7, a speech for humanity. ");
		SimpleTask task = new SimpleTask() {
			int health = 1;
			boolean died = false;
			@Override
			public int getHealth() {
				// TODO Auto-generated method stub
				return health;
			}

			@Override
			public void reduceHealth() {
				// TODO Auto-generated method stub
				health++;
				if (health > 100) {
					this.destroy();
				}
			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				switch (health) {
				case 2:
					Utility.broadcast("&e&lCharlie Caplin:&f I'm sorry, but I don't want to be an emperor.");
					return;
				case 3:
					Utility.broadcast("&fThat's not my business.");
					return;
				case 4:
					Utility.broadcast("I don't want to rule or conquer anyone.");
					return;
				case 5:
					Utility.broadcast("I should like to help everyone if possible.");
					return;
				case 6:
					Utility.broadcast(" ");

					Utility.broadcast("Jew - Gentile - Black Man, White.");
					return;
				case 7:
					Utility.broadcast("We all want to help one another, human beings are like that.");
					return;
				case 8:
					Utility.broadcast("We want to live by each other's happiness.");
					return;
				case 9:
					Utility.broadcast("Not by each other's misery.");
					return;
				case 10:
					Utility.broadcast("We don't want to hate and despise one another.");
					return;
				case 11:
					Utility.broadcast("And this world has room for everyone, and the good Earth is rich-");
					return;
				case 12:
					Utility.broadcast("-can provide for everyone.");
					return;
				case 13:
					Utility.broadcast(" ");

					Utility.broadcast("The way of life can be free and beautiful,");
					return;
				case 14:
					Utility.broadcast("but we have lost the way.");
					return;
				case 15:
					Utility.broadcast(" ");

					Utility.broadcast("Greed has posioned men's souls,");
					return;
				case 16:
					Utility.broadcast("has barricaded the world with hate,");
					return;
				case 17:
					Utility.broadcast("has goose-stepped us into misery and bloodshed.");
					return;
				case 18:
					
					Utility.broadcast(" ");

					Utility.broadcast("We have developed speed,");
					return;
				case 19:
					Utility.broadcast("but we have shut ourselves in.");
					return;
				case 20:
					Utility.broadcast(" ");

					Utility.broadcast("Machinery that gives us abundance has left us in want.");
					return;
				case 21:
					Utility.broadcast("Our knowledge has made us cynnical.");
					return;
				case 22:
					Utility.broadcast("Our cleverness, hard and unkind.");
					return;
				case 23:
					Utility.broadcast(" ");

					Utility.broadcast("We think too much, and feel too little.");
					return;
				case 24:
					Utility.broadcast("More than machinery, we need humanity.");
					return;
				case 25:
					Utility.broadcast("More that cleverness, we need kindness and gentleness.");
					return;
				case 26:
					Utility.broadcast("Without these qualities life will be violent,");
					return;
				case 27:
					Utility.broadcast("and all will be lost.");
					return;
				case 28:
					Utility.broadcast(" ");

					Utility.broadcast("The aeroplane and the radio have brought us closer together.");
					return;
				case 29:
					Utility.broadcast("The very nature of these inventions cries out for the goodness in men -");
					return;
				case 30:
					Utility.broadcast("- cries out for universal brotherhood - ");
					return;
				case 31:
					Utility.broadcast("for the unity of us all.");
					return;
				case 32:
					Utility.broadcast(" ");

					Utility.broadcast("Even now my voice is reaching millions throughout the world -");
					return;
				case 33:
					Utility.broadcast("millions of despairing men, women, and little children -");
					return;
					
				case 34:
					Utility.broadcast("victims of a system that makes men torture and imprison innocent people.");
					return;
				case 35:
					Utility.broadcast(" ");

					Utility.broadcast("To those who can hear me, I say -");
					return;
					
				case 36:
					Utility.broadcast("do not despair.");
					return;
					
				case 37:
					Utility.broadcast(" ");

					Utility.broadcast("The misery that is now upon us is but the passing of greed -");
					return;
				case 38:
					Utility.broadcast("- the bitterness of men who fear the way of human progress.");
					return;
				case 39:
					Utility.broadcast(" ");

					Utility.broadcast("The hate of men will pass, and dictators die,");
					return;
					
				case 40:
					Utility.broadcast("and the power they took from the people will return to the people.");
					return;
				case 41:
					Utility.broadcast(" ");

					Utility.broadcast("And so long as men die,");
					return;
					
				case 42:
					Utility.broadcast("liberty will never perish....");
					return;
				case 43:
					Utility.broadcast(" ");

					Utility.broadcast("Soldiers!");
					return;
				case 44:
					Utility.broadcast("don't give yourselves to brutes - men who despise you -");
					return;
				case 45:
					Utility.broadcast("- enslave you - who regiment your lives");
					return;
					
				case 46:
					Utility.broadcast("- tell you what to do - what to think and what to feel!");
					return;
				case 47:
					Utility.broadcast("Who drill you - diet you ");
					return;
				case 48:
					Utility.broadcast("- treat you like cattle, use you as cannon fodder.");
					return;
				case 49:
					Utility.broadcast(" ");

					Utility.broadcast("Don't give yourselves to these unnatural men -");
					return;
					
				case 50:
					Utility.broadcast("machine men with machine minds and machine hearts!");
					return;
				case 51:
					Utility.broadcast("You are not machines!");
					return;
				case 52:
					Utility.broadcast("You are not cattle!");
					return;
				case 53:
					Utility.broadcast("You are men!");
					return;
				case 54:
					Utility.broadcast("You have the love of humanity in your hearts!");
					return;
				case 55:
					Utility.broadcast("You don't hate!");
					return;
				case 56:
					Utility.broadcast("Only the unloved hate -");
					return;
					
				case 57:
					Utility.broadcast("- the unloved and the unnatural!");
					return;
				case 58:
					Utility.broadcast(" ");

					Utility.broadcast("Soldiers!");
					return;
				case 59:
					Utility.broadcast("Don't fight for slavery!");
					return;
					
				case 60:
					Utility.broadcast("Fight for liberty!");
					return;
				case 61:
					Utility.broadcast("In the 17th Chapter of St Luke it is written:");
					return;
					
				case 62:
					Utility.broadcast("\"the Kingdom of God is within man\"");
					return;
				case 63:
					Utility.broadcast("- not one man nor a group of men, but in all men!");
					return;
				case 64:
					Utility.broadcast("In you!");
					return;
				case 65:
					Utility.broadcast(" ");

					Utility.broadcast("You, the people have the power -");
					return;
				case 66:
					Utility.broadcast("- the power to create machines -");
					return;
				case 67:
					Utility.broadcast("The power to create happiness!");
					return;
				case 68:
					Utility.broadcast("You, the people,");
					return;
				case 69:
					Utility.broadcast(" have the power to make this life free and beautiful,");
					return;
				case 70:
					Utility.broadcast("to make this life a wonderful adventure.");
					return;
				case 71:
					Utility.broadcast(" ");

					Utility.broadcast("Then - in the name of democracy -");
					return;
				case 72:
					Utility.broadcast(" let us use that power - let us all unite!");
					return;
				case 73:
					Utility.broadcast(" ");

					Utility.broadcast("Let us fight for a new world!");
					return;
				case 74:
					Utility.broadcast("- a decent world that will give men a chance to work -");
					return;
				case 75:
					Utility.broadcast("- that will give youth a future and old age a security.");
					return;
				case 76:
					Utility.broadcast(" ");

					Utility.broadcast("By the promise of these things, brutes have risen to power.");
					return;
				case 77:
					Utility.broadcast("But they lie! - They do not fulfil that promise.");
					return;
				case 78:
					Utility.broadcast("They never will!");
					return;
				case 79:
					Utility.broadcast("Dictators free themselves but they enslave the people!");
					return;
				case 80:
					Utility.broadcast("Now let us fight to fulfil that promise!");
					return;
				case 81:
					Utility.broadcast("Let us fight to free the world - to do away with national barriers -");
					return;
				case 82:
					Utility.broadcast("- to do away with greed, with hate and intolerance.");
					return;
				case 83:
					Utility.broadcast("Let us fight for a world of reason,");
					return;
				case 84:
					Utility.broadcast("a world where science and progress will lead to all men's happiness.");
					return;
				case 85:
					Utility.broadcast("");
					return;
				case 86:
					Utility.broadcast("Soldiers!");
					return;
				case 87:
					Utility.broadcast("In the name of democracy, let us all unite!");
					return;
				case 88:
					this.destroy();
					return;
				case 89:
					return;
				}
			}
/*
 * I'm sorry, but I don't want to be an emperor.

That's not my business.
I don't want to rule or conquer anyone.
I should like to help everyone if possible.
Jew - Gentile - Black Man, White.
We all want to help one another, human beings are like that.
We want to live by each other's happiness.
Not by each other's misery.
We don't want to hate and despise one another.
And this world has room for everyone, and the good Earth is rich can provide for everyone.
The way of life can be free and beautiful, but we have lost the way.
Greed has posioned men's souls, has barricaded the world with hate, has goose-stepped us into misery and bloodshed.
We have developed speed, but we have shut ourselves in.
Machinery that gives us abundance has left us in want.
Our knowledge has made us cynincal.
Our cleverness, hard and unkind.
We think too much, and feel too little.
More than machinery, we need humanity.
More that cleverness, we need kindness and gentleness.
Without these qualities life will be violent, and all will be lost.
The aeroplane and the radio have brought us closer together.
The very nature of these inventions cries out for the goodness in men - cries out for universal brotherhood - for the unity of us all.
Even now my voice is reaching millions throughout the world - millions of despairing men, women, and little children - victims of a system that makes men torture and imprison innocent people.
To those who can hear me, I say - do not despair.
The misery that is now upon us is but the passing of greed - the bitterness of men who fear the way of human progress.
The hate of men will pass, and dictators die, and the power they took from the people will return to the people.
And so long as men die, liberty will never perish. ...
Soldiers!
don't give yourselves to brutes - men who despise you - enslave you - who regiment your lives - tell you what to do - what to think and what to feel!
Who drill you - diet you - treat you like cattle, use you as cannon fodder.
Don't give yourselves to these unnatural men - machine men with machine minds and machine hearts!
You are not machines!
You are not cattle!
You are men!
You have the love of humanity in your hearts!
You don't hate!
Only the unloved hate - the unloved and the unnatural!
Soldiers!
Don't fight for slavery!
Fight for liberty!
In the 17th Chapter of St Luke it is written: "the Kingdom of God is within man" - not one man nor a group of men, but in all men!
In you!
You, the people have the power - the power to create machines.
The power to create happiness!
You, the people, have the power to make this life free and beautiful, to make this life a wonderful adventure.
Then - in the name of democracy - let us use that power - let us all unite.
Let us fight for a new world - a decent world that will give men a chance to work - that will give youth a future and old age a security.
By the promise of these things, brutes have risen to power.
But they lie!
They do not fulfil that promise.
They never will!
Dictators free themselves but they enslave the people!
Now let us fight to fulfil that promise!
Let us fight to free the world - to do away with national barriers - to do away with greed, with hate and intolerance.
Let us fight for a world of reason, a world where science and progress will lead to all men's happiness.
Soldiers!
in the name of democracy, let us all unite

 */
			@Override
			public void runTaskOnDeath() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean isDestroyed() {
				// TODO Auto-generated method stub
				return died;
			}

			@Override
			public void destroy() {
				// TODO Auto-generated method stub
				died = true;
			}
			
		};
		this.m.setTask(task);
		this.m.getRunnable().addTask(task);
	}
}
