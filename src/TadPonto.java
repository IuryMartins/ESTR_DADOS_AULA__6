public class TadPonto {
    private int x;
    private int y;

    public TadPonto(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String distancia(Ponto p) {
        double dx = p.getX() - x;
        double dy = p.getY() - y;
        return String.valueOf(Math.sqrt(dx * dx + dy * dy));
    }

    public String soma(Ponto p) {
        x += p.getX();
        y += p.getY();
        return x + "," + y;
    }

    public String subtracao(Ponto p) {
        x -= p.getX();
        y -= p.getY();
        return x + "," + y;
    }
}