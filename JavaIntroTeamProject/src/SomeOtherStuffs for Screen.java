public void paint(Graphics g) {
		g.clearRect(0, 0, WIDTH, HEIGHT);
		
		g.setColor(new Color(10, 50, 0));
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.setColor(Color.BLACK);
		for(int i = 0; i < WIDTH / 10; i++) {
			g.drawLine(i * 10, 0, i * 10, HEIGHT);
		}
		
		for(int i = 0; i < HEIGHT / 10; i++) {
			g.drawLine(0, i * 10, WIDTH, i * 10);
		}
		
		for(int i = 0; i < snake.size(); i++) {
			snake.get(i).draw(g);
		}
		for(int i = 0; i < apples.size(); i++) {
			apples.get(i).draw(g);
		}
	
	}
	
	public void start() {
		running = true;
		thread = new Thread(this, "Game Restart");
		thread.start();
	}
	
	public void stop() {
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		while(running) {
			tick();
			repaint();
		}
	}
	
