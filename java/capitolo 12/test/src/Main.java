public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Box box = new Box(1, 1, 1);
        Geometry cube = new Geometry("Cube", box);

        Material mat = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);

        cube.setMaterial(mat);
        rootNode.attachChild(cube);
    }
}