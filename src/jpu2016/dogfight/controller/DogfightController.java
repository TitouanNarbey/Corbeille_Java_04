package jpu2016.dogfight.controller;

import java.util.ArrayList;

import javax.swing.JSpinner.ListEditor;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer{

	private final int TIME_SLEEP = 30;
	private ArrayList<IDogfightModel> dogfightModel;
	private ArrayList<IViewSystem> viewSystem;

	public DogfightController(IDogfightModel dogfightModel_) {
		
	}
	
	public void orderPerformer(UserOrder userOrder) {
		
	}
	
	public void play() {
		
	}

	public void setViewSystem(IViewSystem viewSystem) {
		
	}
	
	private void lunchMissile(int player) {
		
	}
	
	private void gameLoop() {
		
	}

	public int getTIME_SLEEP() {
		return TIME_SLEEP;
	}

	public ArrayList<IDogfightModel> getDogfightModel() {
		return dogfightModel;
	}
	
	public ArrayList<IViewSystem> getViewSystem() {
		return viewSystem;
	}

	
}
