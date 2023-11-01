package Homeworks.HW_5;

import java.util.Collection;

public interface BusinessLogicalLayer {

    Collection<Model3D> getAllModels();
    Collection<Texture> getAllTextures();

    void renderModel(Model3D model);
    void renderAllModels();

    void addModel3D();
    void deleteModel3D(int id);

    void addTexture();
    void deleteTexture(int id);


}
