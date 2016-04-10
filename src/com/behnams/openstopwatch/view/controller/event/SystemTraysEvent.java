package com.behnams.openstopwatch.view.controller.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.behnams.openstopwatch.view.SystemTrays;

public class SystemTraysEvent {
	public static MouseListener systemTrayIconClick = new MouseListener() {

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getButton() == 1) {
				SystemTrays.showApp();
			}
		}
	};

	public static ActionListener menuItemShow = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			SystemTrays.showApp();
		}
	};
	
	public static ActionListener menuItemClose = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	};

}
