

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChessPanel extends JPanel implements MouseListener ,Runnable{
	//��������
	//chesses[0][0]->chesses[18][18],Ĭ����0����ʾû�����ӣ���ɫ-1����ɫ1
	int[][] chesses = new int[19][19];
	int currentColor = 1;//��ʼ��ɫ����ɫ����־����µ�������ɫ
	String blackMessage = "ʱ��������";//��д����
	String whiteMessage = "ʱ��������";
	int blackTime = 0;//ʣ������ʱ��
	int whiteTime = 0;
	Thread t = new Thread(this);//newһ���߳�
	int undoTimeX;//����ʱ��
	int undoTimeY;
	
	@Override
	public void paint(Graphics g) {//�����
		
	}

	public void drawBackground(Graphics g) {//������
		
	}

	public void drawGameInfo(Graphics g) {//д��Ϸ��Ϣ
		
	}

	public void drawTime(Graphics g) {//��ʱ������Ҫ��Ϸ�����ü�ʱ�ŵ���ʱ
		
	}

	public void drawChessBoard(Graphics g) {//������
		
	}
	boolean gameOver = false;//��Ϸ������־
	@Override
	public void mouseClicked(MouseEvent e) {//������¼�
		
	}
	
	public String currentColorStringfy() {//�ж����һ�����ӵ���ɫ

	}

	public void playChess(int mouseX,int mouseY) {//����
		
	}
	
	public boolean checkWin() { //�ж���Ӯ
		
	}
	
	public boolean checkOneDirection() {//����Ƿ��Ѿ�������
		
	}
	
	public void run() {//����
		
	}
	
	//���涼�Ǽ��ĳ�����ܵ�ķ�Χ
	public boolean isChessBoardRange (int mouseX, int mouseY) {

	}

	public boolean isStartGameRange (int mouseX, int mouseY) {

	}

	public boolean isSettingRange (int mouseX, int mouseY) {

	}

	public boolean isGameBriefRge (int mouseX, int mouseY) {

	}
	
	public boolean isDefeat (int mouseX, int mouseY) {

	}

	public boolean isGiveUpRange (int mouseX, int mouseY) {

	}

	public boolean isAboutRange (int mouseX, int mouseY) {

	}

	public boolean isExitRange (int mouseX, int mouseY) {

	}

	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}