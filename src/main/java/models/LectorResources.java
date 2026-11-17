package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorResources implements Runnable {
	public int numCaracteres;
	private final String RUTA_RESOURCES = "src/main/resources";
	
	public LectorResources() {
		this.numCaracteres = 0;
	}
	@Override
	public void run() {
		this.contar();
	}
	
	public void contar() {
		String path = Thread.currentThread().getName();
		File f = new File(this.RUTA_RESOURCES, path);
		if (f.exists() && f.isFile()) {
			try {
				FileReader fr = new FileReader(f);
				BufferedReader bf = new BufferedReader(fr);
				
				String linea = bf.readLine();
				while (linea != null) {
					this.numCaracteres += linea.length();
					linea = bf.readLine();
				}
				bf.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
