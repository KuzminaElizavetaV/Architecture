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
        System.out.printf("Добавлена новая 3D-модель: " + model3D + "\n");
    }

    @Override
    public void deleteModel3D(int modelID) {
        Model3D model3D = (Model3D) databaseAccess.searchEntityByID(modelID);
        if (model3D != null) {
            databaseAccess.removeEntity(model3D);
            System.out.printf("Удалена модель № %d из проекта.\n", modelID);
        }
        else throw new RuntimeException("3D-модель не найдена!");
    }



    @Override
    public void addTexture() {
        Texture texture = new Texture();
        databaseAccess.addEntity(texture);
        System.out.printf("Добавлена новая текстура: " + texture + "\n");

    }

    @Override
    public void deleteTexture(int textureID) {
        Texture texture = (Texture) databaseAccess.searchEntityByID(textureID);
        if (texture != null) {
            databaseAccess.removeEntity(texture);
            System.out.printf("Удалена текстура № %d из проекта:\n", textureID);
        }
        else throw new RuntimeException("Текстура не найдена!");
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
