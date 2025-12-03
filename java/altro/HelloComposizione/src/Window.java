public class Window {
    private float height;
    private float width;
    private Button[] buttons;

    public Window(float height, float width) {
        this.height = height;
        this.width = width;
        this.buttons = new Button[8]; //composizione
    }

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

    public Button[] getButtons() {
        return buttons;
    }

    public void setButtons(Button[] buttons) {
        this.buttons = buttons;
    }
}
