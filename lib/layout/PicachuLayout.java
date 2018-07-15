package lib.layout;

import java.awt.Dimension;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Container;
import java.awt.FlowLayout;
public class PicachuLayout extends FlowLayout {

	private int maxWidth = 300;
	public void setMaxWidth(int maxWidthIn){
		maxWidth = maxWidthIn;
	}
	public int getMaxWidth(){
		return maxWidth;
	}

    public PicachuLayout() {
        super(CENTER, 5, 5);
    }

    public PicachuLayout(int align) {
        super(align, 5, 5);
    }

    public PicachuLayout(int align, int hgap, int vgap) {
        setHgap(hgap);
        setVgap(vgap);
        setAlignment(align);
    }

    public Dimension preferredLayoutSize(Container target) {
	  synchronized (target.getTreeLock()) {
        Insets insets = target.getInsets();
        //int maxwidth = target.getWidth() - (insets.left + insets.right + getHgap()*2);
		int maxwidth = getMaxWidth() - (insets.left + insets.right + getHgap()*2);
        int nmembers = target.getComponentCount();
        int x = 0, y = insets.top + getVgap();
        int rowh = 0, start = 0;

        boolean ltr = target.getComponentOrientation().isLeftToRight();

        boolean useBaseline = getAlignOnBaseline();
        int[] ascent = null;
        int[] descent = null;

        if (useBaseline) {
            ascent = new int[nmembers];
            descent = new int[nmembers];
        }

        for (int i = 0 ; i < nmembers ; i++) {
            Component m = target.getComponent(i);
            if (m.isVisible()) {
                Dimension d = m.getPreferredSize();
                m.setSize(d.width, d.height);

                if (useBaseline) {
                    int baseline = m.getBaseline(d.width, d.height);
                    if (baseline >= 0) {
                        ascent[i] = baseline;
                        descent[i] = d.height - baseline;
                    }
                    else {
                        ascent[i] = -1;
                    }
                }
                if ((x == 0) || ((x + d.width) <= maxwidth)) {
                    if (x > 0) {
                        x += getHgap();
                    }
                    x += d.width;
                    rowh = Math.max(rowh, d.height);
                } else {
                    rowh = moveComponentsTest(target, insets.left + getHgap(), y,
                                   maxwidth - x, rowh, start, i, ltr,
                                   useBaseline, ascent, descent);
                    x = d.width;
                    y += getVgap() + rowh;
                    rowh = d.height;
                    start = i;
                }
            }
        }
		Dimension dim = new Dimension(0, 0);
		dim.width = getMaxWidth();
		dim.height = y + rowh + getVgap() ;
        return dim;

      }
    }

    public Dimension minimumLayoutSize(Container target) {
		return preferredLayoutSize(target);
    }

	private int moveComponentsTest(Container target, int x, int y, int width, int height,
                                int rowStart, int rowEnd, boolean ltr,
                                boolean useBaseline, int[] ascent,
                                int[] descent) {
        switch (getAlignment()) {
        case LEFT:
            x += ltr ? 0 : width;
            break;
        case CENTER:
            x += width / 2;
            break;
        case RIGHT:
            x += ltr ? width : 0;
            break;
        case LEADING:
            break;
        case TRAILING:
            x += width;
            break;
        }
        int maxAscent = 0;
        int nonbaselineHeight = 0;
        int baselineOffset = 0;
        if (useBaseline) {
            int maxDescent = 0;
            for (int i = rowStart ; i < rowEnd ; i++) {
                Component m = target.getComponent(i);
                if (m.isVisible()) {
                    if (ascent[i] >= 0) {
                        maxAscent = Math.max(maxAscent, ascent[i]);
                        maxDescent = Math.max(maxDescent, descent[i]);
                    }
                    else {
                        nonbaselineHeight = Math.max(m.getHeight(),
                                                     nonbaselineHeight);
                    }
                }
            }
            height = Math.max(maxAscent + maxDescent, nonbaselineHeight);
            baselineOffset = (height - maxAscent - maxDescent) / 2;
        }
        for (int i = rowStart ; i < rowEnd ; i++) {
            Component m = target.getComponent(i);
            if (m.isVisible()) {
                int cy;
                if (useBaseline && ascent[i] >= 0) {
                    cy = y + baselineOffset + maxAscent - ascent[i];
                }
                else {
                    cy = y + (height - m.getHeight()) / 2;
                }
                x += m.getWidth() + getHgap();
            }
        }
        return height;
    }
}
