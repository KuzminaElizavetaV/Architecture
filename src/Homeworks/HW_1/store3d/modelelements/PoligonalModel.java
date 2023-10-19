package Homeworks.HW_1.store3d.modelelements;

import java.util.Collection;

public class PoligonalModel {

    //region Конструкторы
    public PoligonalModel(Collection<Poligon> poligons, Collection<Texture> textures)
    {
        this.poligons = poligons;
        this.textures = textures;
    }

    public PoligonalModel(Collection<Poligon> poligons)
    {
        this.poligons = poligons;
    }
    //endregion

    //region Свойства
    public Collection<Poligon> getPoligons() {
        return poligons;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }

    public void setTextures(Collection<Texture> textures) {
        this.textures = textures;
    }
    //endregion

    //region Поля
    private Collection<Poligon> poligons;

    private Collection<Texture> textures;
    //endregion
}