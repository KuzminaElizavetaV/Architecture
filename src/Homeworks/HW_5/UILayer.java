package Homeworks.HW_5;

public interface UILayer {

    void openProject(String fileName);
    void showProjectSettings();
    void saveProject();
    void printAllModels();
    void printAllTextures();
    void renderAll();
    void renderModel(int i);

    void addModel3D();
    void deleteModel3D(int id);
    void addTexture();
    void addTextureToModel(int modelID, int textureID);
    void deleteTexture(int id);

}
