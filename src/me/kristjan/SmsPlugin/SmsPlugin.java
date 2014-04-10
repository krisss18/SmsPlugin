package me.kristjan.SmsPlugin;
//®HighCraft Copyright 2014
//All rights reserved.

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class SmsPlugin extends JavaPlugin {
@Override
public void onEnable(){
  getLogger().info(" on aktiveeritud.");
 }
 
 @Override
public void onDisable(){
  getLogger().info(" on katkestatud!");
 }

@Override
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
  if(cmd.getName().equalsIgnoreCase("k2sklus"));{
    if(args.length < 1){
     sender.sendMessage(ChatColor.RED + "/" + ChatColor.RED + "k2sklus " + ChatColor.GREEN + "Teenus1" + "\n" + ChatColor.RED + "/" + ChatColor.RED + "k2sklus " + ChatColor.GREEN + "Teenus2" + "\n" + ChatColor.RED + "/" + ChatColor.RED + "k2sklus " + ChatColor.GREEN + "Teenus3" + "\n" + ChatColor.RED + "/" + ChatColor.RED + "k2sklus " + ChatColor.GREEN + "Teenus4");
    }else if(args.length > 1){
     sender.sendMessage(ChatColor.RED + "/k2sklus <Teenus> ");
    
    //+ name + = Automaatselt m22rab tellija kasutajanime
    }else if(args[0].equalsIgnoreCase("Teenus1")){
    	
    final String name;
    
	name = sender.getName();
    
    sender.sendMessage(ChatColor.GREEN + "Teenus1: " + ChatColor.RED + "Tekst siia" + name ); 
    
    
    }else if(args[0].equalsIgnoreCase("Teenus2")){
    	
    final String name;
    
	name = sender.getName();
    
    sender.sendMessage(ChatColor.GREEN + "Teenus2: " + ChatColor.RED + " Tekst siia " + name );
    
    
    }
  
  
   else if(args[0].equalsIgnoreCase("Teenus3")){
   	
   final String name;
   
   name = sender.getName();
   
   sender.sendMessage(ChatColor.GREEN + "Teenus3: " + ChatColor.RED + " Tekst siia " + name );
   
   
   }
    
   else if(args[0].equalsIgnoreCase("Teenus4")){
	   	
   final String name;
   
   name = sender.getName();
   
   sender.sendMessage(ChatColor.GREEN + "Teenus4: " + ChatColor.RED + " Tekst siia " + name );
   
   
   }
    
  }
  return true;
 }
 
}