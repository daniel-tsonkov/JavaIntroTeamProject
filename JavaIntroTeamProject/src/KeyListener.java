	private class Key implements KeyListener {

		
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			
			if(key == KeyEvent.VK_RIGHT && !left) { 
				up = false;
				down = false;
				right = true;
			}
			
			if(key == KeyEvent.VK_LEFT && !right) { 
				up = false;
				down = false;
				left = true;
			}
			
			if(key == KeyEvent.VK_UP && !down) {
				left = false;
				right = false;
				up = true;
			}
			
			if(key == KeyEvent.VK_DOWN && !up) {
				left = false;
				right = false;
				down = true;
			}
			
			
		}
