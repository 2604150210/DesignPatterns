package abstractFactory.depositSlip;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/**
 * Created by jal on 2018/4/9 0009.
 */
public class SealThree implements Seal {
    BufferedImage image;
    Graphics2D g;
    SealThree(){
        image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        g = image.createGraphics();
        g.setColor(Color.white);
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 100, 100);
        g.fill(rect);
        g.setColor(Color.red);
        BasicStroke bs = new BasicStroke(3f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND);//画直线
        g.setStroke(bs);
        Line2D line = new Line2D.Double(5, 105, 55, 5);
        g.draw(line);
        line.setLine(55, 5, 105, 105);
        g.draw(line);
        line.setLine(105, 105, 5, 105);
        g.draw(line);
        g.setFont(new Font("宋体", Font.BOLD, 14));
        g.drawString("中国银行",16, 50);
    }
    @Override
    public Image getImage() {
        return image;
    }
}
