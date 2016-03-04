package model;

import java.awt.Image;
import java.util.ArrayList;

public class Library {
	
	private ArrayList<Image> myImages;
	
	public Library() {
		loadMyImages();
	}
	
	private void loadMyImages() {
		// populate the image list
	}
	
	public Image downloadImage(int index) {
		return myImages.get(index);
	}
	
	public int addImage(final Image theImage) {
		int size = myImages.size();
		if (theImage != null) {
			myImages.add(theImage);
		}
		return size; // the index to the new image
	}
	
	public void deleteImage(final int index) {
		myImages.remove(index);
	}

}
