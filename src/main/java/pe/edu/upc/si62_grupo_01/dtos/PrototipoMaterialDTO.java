package pe.edu.upc.si62_grupo_01.dtos;

import pe.edu.upc.si62_grupo_01.entities.Material;
import pe.edu.upc.si62_grupo_01.entities.Prototipo;

public class PrototipoMaterialDTO {
    private  int PrototipoMaterialId;
    private Prototipo prototipo;
    private Material material;

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Prototipo getPrototipo() {
        return prototipo;
    }

    public void setPrototipo(Prototipo prototipo) {
        this.prototipo = prototipo;
    }

    public int getPrototipoMaterialId() {
        return PrototipoMaterialId;
    }

    public void setPrototipoMaterialId(int prototipoMaterialId) {
        PrototipoMaterialId = prototipoMaterialId;
    }
}
