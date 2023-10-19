package Homeworks.HW_1.store3d.inmemorymodel;

import java.util.ArrayList;
import java.util.Collection;
import Homeworks.HW_1.store3d.modelelements.*;


public class ModelStore implements ModelChanger {
    //region Публичные методы

    public void addPoligonalModel(PoligonalModel model) {
        poligonalModels.add(model);
        this.notifyChange();
    }

    public void removePolyModel(PoligonalModel model) {
        poligonalModels.remove(model);
        this.notifyChange();
    }

    public void addScene(Scene scene) {
        scenes.add(scene);
        this.notifyChange();
    }

    public void removeScene(Scene scene) {
        scenes.remove(scene);
        this.notifyChange();
    }

    public void addFlash(Flash flash) {
        flashes.add(flash);
        this.notifyChange();
    }

    public void removeFlash(Flash flash) {
        flashes.remove(flash);
        this.notifyChange();
    }

    public Scene getScene(int sceneId) {
        for (Scene scene : scenes) {
            if (scene.getId() == sceneId) {
                return scene;
            }
        }
        return null;
    }

    public void addCamera(Camera camera) {
        cameras.add(camera);
        this.notifyChange();
    }

    public void removeCamera(Camera camera) {
        cameras.remove(camera);
        this.notifyChange();
    }
    /**
     * Нотифицирует о событии
     */
    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : changeObservers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(ModelChangedObserver o) {
        changeObservers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        changeObservers.remove(o);
    }
    //endregion

    //region Свойства

    public Collection<PoligonalModel> getPolygonalModels() {
        return poligonalModels;
    }

    public Collection<Scene> getScenes() {
        return scenes;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    //endregion

    //region Поля

    private final Collection<PoligonalModel> poligonalModels = new ArrayList<>();
    private final Collection<Scene> scenes = new ArrayList<>();
    private final Collection<Flash> flashes = new ArrayList<>();
    private final Collection<Camera> cameras = new ArrayList<>();
    private final Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    //endregion
}