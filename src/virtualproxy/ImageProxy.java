package virtualproxy;

import java.awt.*;
import java.net.*;
import java.util.concurrent.atomic.AtomicReference;

import javax.swing.*;

class ImageProxy implements Icon {
	AtomicReference<ImageIcon> imageIcon = new AtomicReference<>();
	final URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;

	public ImageProxy(URL url) {
		imageURL = url;
	}

	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.get().getIconWidth();
		} else {
			return 800;
		}
	}

	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.get().getIconHeight();
		} else {
			return 600;
		}
	}

	public void paintIcon(final Component c, Graphics g, int x, int y) {
		if (imageIcon != null) {
			imageIcon.get().paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading album cover, please wait...", x + 300, y + 190);
			if (!retrieving) {
				retrieving = true;

				Thread.ofVirtual().start(() -> {
					try {
						this.imageIcon.set(new ImageIcon(imageURL, "Album Cover"));
						c.repaint();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
			}
		}
	}
}