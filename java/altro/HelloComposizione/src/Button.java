public class Button {
    private float height;
    private float width;
    private String label;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Button{" +
                "height=" + height +
                ", width=" + width +
                ", label='" + label + '\'' +
                '}';
    }
}
