package celestialInterface;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.SubScene;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.AmbientLight;
import javafx.scene.PointLight;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Priority;
import javafx.scene.shape.Sphere;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.geometry.Point3D;

import java.util.Map;
import java.util.HashMap;


public class celestial extends Application {

    private static final int WIDTH = 1400;
    private static final int HEIGHT = 800;

    private Map<Node, Label> nodeToLabelMap;

    @Override
    public void start(Stage stage) {
        // Create main scene graph

        var objects3d = new Group();

        Rotate xRotate = new Rotate (0, 0, 0, 0, Rotate.X_AXIS);
        Rotate yRotate = new Rotate (0, 0, 0, 0, Rotate.Y_AXIS);
        objects3d.getTransforms().addAll (
                xRotate,
                yRotate
        );

        var root3d = new Group();
        root3d.getChildren().add (objects3d);

        var camera = new PerspectiveCamera (true);
        camera.setTranslateZ (-25);

        var scene3d = new SubScene (root3d, 500, 500, true, SceneAntialiasing.BALANCED);
        scene3d.setFill (Color.rgb (20, 20, 80));
        scene3d.setCamera (camera);

        var sceneRoot = new Group (scene3d);
        var objects2d = new Group();
        sceneRoot.getChildren().add (objects2d);
        var viewScene = new SubScene (sceneRoot, 500, 500);

        scene3d.widthProperty().bind (viewScene.widthProperty());
        scene3d.heightProperty().bind (viewScene.heightProperty());

        // Add lights and objects

        var ambient = new AmbientLight (Color.color (0.7, 0.7, 0.7));
        var point = new PointLight (Color.color (0.3, 0.3, 0.3));
        point.setTranslateX (-25);
        point.setTranslateY (-25);
        point.setTranslateZ (-50);

        root3d.getChildren().addAll (ambient, point);

        var globe = new Sphere (5);
        globe.setMaterial (new PhongMaterial (Color.color (0.3, 0.3, 0.3)));

        var xSphere = new Sphere (0.5);
        xSphere.setMaterial (new PhongMaterial (Color.RED));
        xSphere.setTranslateX (5);

        var ySphere = new Sphere (0.5);
        ySphere.setMaterial (new PhongMaterial (Color.GREEN));
        ySphere.setTranslateY (5);

        var zSphere = new Sphere (0.5);
        zSphere.setMaterial (new PhongMaterial (Color.BLUE));
        zSphere.setTranslateZ (5);

        objects3d.getChildren().addAll (globe, xSphere, ySphere, zSphere);

        var nubMaterial = new PhongMaterial (Color.color (0.2, 0.2, 0.2));
        for (int i = 0; i < 200; i++) {
            var nub = new Sphere (0.125);
            nub.setMaterial (nubMaterial);
            var phi = 2*Math.PI*Math.random();
            var theta = Math.acos (2*Math.random() - 1);
            var z = -5 * Math.sin (theta) * Math.cos (phi);
            var x = 5 * Math.sin (theta) * Math.sin (phi);
            var y = -5 * Math.cos (theta);
            nub.setTranslateX (x);
            nub.setTranslateY (y);
            nub.setTranslateZ (z);
            objects3d.getChildren().add (nub);
        } // for

        // Add labels

        var xLabel = new Label ("X axis");
        xLabel.setTextFill (Color.RED);

        var yLabel = new Label ("Y axis");
        yLabel.setTextFill (Color.GREEN);

        var zLabel = new Label ("Z axis");
        zLabel.setTextFill (Color.BLUE);

        objects2d.getChildren().addAll (xLabel, yLabel, zLabel);

        nodeToLabelMap = new HashMap<>();
        nodeToLabelMap.put (xSphere, xLabel);
        nodeToLabelMap.put (ySphere, yLabel);
        nodeToLabelMap.put (zSphere, zLabel);

        xRotate.angleProperty().addListener ((obs, oldVal, newVal) -> updateLabels());
        yRotate.angleProperty().addListener ((obs, oldVal, newVal) -> updateLabels());
        camera.translateZProperty().addListener ((obs, oldVal, newVal) -> updateLabels());
        Platform.runLater (() -> updateLabels());

        // Create main pane

        var gridPane = new GridPane();

        var stackPane = new StackPane (viewScene);
        viewScene.heightProperty().bind (stackPane.heightProperty());
        viewScene.widthProperty().bind (stackPane.widthProperty());
        viewScene.setManaged (false);

        gridPane.add (stackPane, 0, 0);
        gridPane.setVgrow (stackPane, Priority.ALWAYS);
        gridPane.setHgrow (stackPane, Priority.ALWAYS);

        // Add controls

        var xSlider = new Slider (-90, 90, 0);
        xRotate.angleProperty().bind (xSlider.valueProperty());
        var ySlider = new Slider (-180, 180, 0);
        yRotate.angleProperty().bind (ySlider.valueProperty());
        var zSlider = new Slider (-60, -25, -25);
        camera.translateZProperty().bind (zSlider.valueProperty());

        ToolBar toolbar = new ToolBar (
                new Label ("X rotation:"),
                xSlider,
                new Label ("Y rotation:"),
                ySlider,
                new Label ("Z position:"),
                zSlider
        );
        gridPane.add (toolbar, 0, 1);

        // Start the show

        stage.setTitle ("Label Test");
        stage.setScene (new Scene (gridPane, 800, 600));
        stage.show();

    } // start

    private void updateLabels () {

        nodeToLabelMap.forEach ((node, label) -> {
            var coord = node.localToScene (Point3D.ZERO, true);
            System.out.println ("label = " + label.getText() + ", coord = " + coord);
            label.getTransforms().setAll (new Translate(coord.getX(), coord.getY()));
        });

    } // updateLabels

    public static void main (String[] args) {

        launch (args);

    } // main

} // LabelTest class

