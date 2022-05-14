package diagram;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class DiagramPanel extends JPanel{
	
	private int padding = 25;
    private int labelPadding = 25;
    private Color lineColor = new Color(44, 102, 230, 180);
    private Color pointColor = new Color(100, 100, 100, 180);
    private Color gridColor = new Color(200, 200, 200, 200);
    private static final Stroke GRAPH_STROKE = new BasicStroke(2f);
    private int pointWidth = 4;
    private int numberYDivisions = 10;
    
	private static List<Integer> scoresX;
	private static List<Integer> scoresY;
	
	public DiagramPanel(List<Integer> dataArray, List<Integer> timeArray) {
		DiagramPanel.scoresX = dataArray;
		DiagramPanel.scoresY = timeArray;
	}
    
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        double xScale = ((double) getWidth() - 2 * padding - labelPadding) / (scoresY.size() - 1);
        double yScale = ((double) getHeight() - 2 * padding - labelPadding) / (getMaxScoreY());

        List<Point> graphPoints = new ArrayList<>();
        for (int i = 0; i < scoresY.size(); i++) {
            int x1 = (int) (i * xScale + padding + labelPadding);
            int y1 = (int) ((getMaxScoreY() - scoresY.get(i)) * yScale + padding);
            graphPoints.add(new Point(x1, y1));
        }

        // draw white background
        g2.setColor(Color.WHITE);
        g2.fillRect(padding + labelPadding, padding, getWidth() - (2 * padding) - labelPadding, getHeight() - 2 * padding - labelPadding);
        g2.setColor(Color.BLACK);

        // create hatch marks and grid lines for y axis.
        for (int i = 0; i < numberYDivisions + 1; i++) {
            int x0 = padding + labelPadding;
            int x1 = pointWidth + padding + labelPadding;
            int y0 = getHeight() - ((i * (getHeight() - padding * 2 - labelPadding)) / numberYDivisions + padding + labelPadding);
            int y1 = y0;
            if (scoresY.size() > 0) {
                g2.setColor(gridColor);
                g2.drawLine(padding + labelPadding + 1 + pointWidth, y0, getWidth() - padding, y1);
                g2.setColor(Color.BLACK);
                String yLabel = (int) (((int) (((getMaxScoreY()) * ((i * 1.0) / numberYDivisions)) * 100)) / 100.0) + "";
                FontMetrics metrics = g2.getFontMetrics();
                int labelWidth = metrics.stringWidth(yLabel);
                g2.drawString(yLabel, x0 - labelWidth - 5, y0 + (metrics.getHeight() / 2) - 3);
            }
            g2.drawLine(x0, y0, x1, y1);
        }

        // and for x axis
        for (int i = 0; i < scoresY.size(); i++) {
            if (scoresY.size() > 1) {
                int x0 = i * (getWidth() - padding * 2 - labelPadding) / (scoresY.size() - 1) + padding + labelPadding;
                int x1 = x0;
                int y0 = getHeight() - padding - labelPadding;
                int y1 = y0 - pointWidth;
                if ((i % ((int) ((scoresY.size() / 20.0)) + 1)) == 0) {
                    g2.setColor(gridColor);
                    g2.drawLine(x0, getHeight() - padding - labelPadding - 1 - pointWidth, x1, padding);
                    g2.setColor(Color.BLACK);
                    //String xLabel = i + "";
                    String xLabel = scoresX.get(i) + "";
                    FontMetrics metrics = g2.getFontMetrics();
                    int labelWidth = metrics.stringWidth(xLabel);
                    g2.drawString(xLabel, x0 - labelWidth / 2, y0 + metrics.getHeight() + 3);
                }
                g2.drawLine(x0, y0, x1, y1);
            }
        }

        // create x and y axes   
        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, padding + labelPadding, padding);
        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, getWidth() - padding, getHeight() - padding - labelPadding);

        Stroke oldStroke = g2.getStroke();
        g2.setColor(lineColor);
        g2.setStroke(GRAPH_STROKE);
        
        for (int i = 0; i < graphPoints.size() - 1; i++) {
            int x1 = graphPoints.get(i).x;
            int y1 = graphPoints.get(i).y;
            int x2 = graphPoints.get(i + 1).x;
            int y2 = graphPoints.get(i + 1).y;
            g2.drawLine(x1, y1, x2, y2);
        }
        
        g2.setStroke(oldStroke);
        g2.setColor(pointColor);
        for (int i = 0; i < graphPoints.size(); i++) {
            int x = graphPoints.get(i).x - pointWidth / 2;
            int y = graphPoints.get(i).y - pointWidth / 2;
            int ovalW = pointWidth;
            int ovalH = pointWidth;
            g2.fillOval(x, y, ovalW, ovalH);
        }
    }
    private double getMinScoreX() {
        long minScore = Integer.MAX_VALUE;
        for(int i = 0; i < scoresX.size(); ++i) {
        	minScore = Math.min(minScore, scoresX.get(i));
        }
        return minScore;
    }
    private double getMinScoreY() {
        long minScore = Integer.MAX_VALUE;
        for(int i = 0; i < scoresY.size(); ++i) {
        	minScore = Math.min(minScore, scoresY.get(i));
        }
        return minScore;
    }
    private double getMaxScoreX() {
        long maxScore = Integer.MIN_VALUE;
        for(int i = 0; i < scoresX.size(); ++i) {
        	maxScore = Math.max(maxScore, scoresX.get(i));
        }
        return maxScore;
    }
    private double getMaxScoreY() {
        long maxScore = Integer.MIN_VALUE;
        for(int i = 0; i < scoresY.size(); ++i) {
        	maxScore = Math.max(maxScore, scoresY.get(i));
        }
        return maxScore;
    }
    public static void setScoresX(List<Integer> scoresX) {
    	DiagramPanel.scoresX = scoresX;
    }
    public static void setScoresY(List<Integer> scoresY) {
    	DiagramPanel.scoresY = scoresY;
    }
    public List<Integer> getScoresX() {
        return scoresX;
    }
    public List<Integer> getScoresY() {
        return scoresY;
    }
    public void createGraphPanel() {
    	DiagramPanel mainPanel = new DiagramPanel(scoresX, scoresY);
        mainPanel.setPreferredSize(new Dimension(800, 600)); 
    }
}

