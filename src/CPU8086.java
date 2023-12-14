public class CPU8086 {
    private int ax, bx, cx, dx;

    public CPU8086() {
        ax = bx = cx = dx = 0;
    }

    public void setAX(int value) {
        ax = value;
    }
    public void setBX(int value) {
        bx = value;
    }
    public void setCX(int value) {
        cx = value;
    }
    public void setDX(int value) {
        dx = value;
    }

    public int getAX() {
        return ax;
    }
    public int getBX() {
        return bx;
    }
    public int getCX() {
        return cx;
    }
    public int getDX() {
        return dx;
    }

    public void addAX(int value) {
        ax += value;
    }
    public void subAX(int value) {
        ax -= value;
    }
    public void addBX(int value) {
        bx += value;
    }
    public void subBX(int value) {
        bx -= value;
    }
    public void addCX(int value) {
        cx += value;
    }
    public void subCX(int value) {
        cx -= value;
    }
    public void addDX(int value) {
        dx += value;
    }
    public void subDX(int value) {
        dx -= value;
    }
}
