package Homeworks.HW_5;

import java.util.Collection;
import java.util.Random;

public class EditorBusinessLogicalLayer implements BusinessLogicalLayer {

    private DatabaseAccess databaseAccess;

    public EditorBusinessLogicalLayer(DatabaseAccess databaseAccess){
        this.databaseAccess = databaseAccess;
    }



    @Override
    public Collection<Model3D> getAllModels() {
        return databaseAccess.getAllModels();
    }

    @Override
    public Collection<Texture> getAllTextures() {
        return databaseAccess.getAllTextures();
    }

    @Override
    public void renderModel(Model3D model) {
        processRender(model);
    }

    @Override
    public void renderAllModels() {
        for (Model3D model: getAllModels()) {
            processRender(model);
        }
    }

    @Override
    public void addModel3D() {
        Model3D model3D = new Model3D();
        databaseAccess.addEntity(model3D);
        System.out.printf("Добавлена новая 3D-модель: " + model3D);
    }

    @Override
    public void deleteModel3D(int modelID) {
        for (Model3D model: getAllModels()) {
            if (model.getId() == modelID) {
                databaseAccess.removeEntity(model);
                System.out.printf("Модель № %d удалена из проекта.", modelID);
                break;
            }
        }
    }

    @Override
    public void addTexture() {
        Texture texture = new Texture();
        databaseAccess.addEntity(texture);
        System.out.printf("Добавлена новая текстура: " + texture);

    }

    @Override
    public void deleteTexture(int textureID) {
        for (Texture texture: getAllTextures()) {
            if (texture.getId() == textureID) {
                databaseAccess.removeEntity(texture);
                System.out.printf("Текстура № %d удалена из проекта.", textureID);
                break;
            }
        }
    }

    private Random random = new Random();

    private void processRender(Model3D model){
        try {
            Thread.sleep(2500 - random.nextInt(2000));
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
