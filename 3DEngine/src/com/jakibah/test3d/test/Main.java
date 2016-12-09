package com.jakibah.test3d.test;

import org.lwjgl.opengl.Display;

import com.jakibah.test3d.DisplayManager;
import com.jakibah.test3d.Loader;
import com.jakibah.test3d.RawModel;
import com.jakibah.test3d.Renderer;

public class Main {

	public static void main(String[] args) {
		DisplayManager.createDisplay();
		
		Loader loader = new Loader();
		Renderer renderer = new Renderer();
		
		float[] vertices = { -0.5f, 0.5f, 0f, -0.5f, -0.5f, 0f, 0.5f, -0.5f, 0f, 0.5f, -0.5f, 0f, 0.5f, 0.5f, 0f, -0.5f, 0.5f, 0f};
		
		RawModel model = loader.loadToVAO(vertices);
		
		while(!Display.isCloseRequested()){
			renderer.prepare();
			//logic
			//render
			renderer.render(model);
			DisplayManager.updateDisplay();
		}
		loader.cleanUp();
		DisplayManager.closeDisplay();

	}

}
