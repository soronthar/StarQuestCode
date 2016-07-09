package com.starquestminecraft.sqtechbase;

import org.bukkit.inventory.ItemStack;

import com.starquestminecraft.sqtechbase.gui.GUI;

public class MachineType {

	int maxEnergy = 0;
	public String name = "Machine Type";
	
	public boolean autodetect = true;
	
	public MachineType(int maxEnergy) {
		
		this.maxEnergy = maxEnergy;
		
	}
	
	public boolean detectStructure(GUIBlock guiBlock) {
		
		return false;
		
	}
	
	public GUI getGUI() {
		
		return new GUI();
		
	}
	
	public int getMaxEnergy() {
		
		return maxEnergy;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getSpaceLeft(Machine machine, ItemStack itemStack) {
		
		return 0;
		
	}
	
	public void sendItems(Machine machine, ItemStack itemStack) {

	}
	
	public void updateEnergy(Machine machine) {
		
	}
	
}
