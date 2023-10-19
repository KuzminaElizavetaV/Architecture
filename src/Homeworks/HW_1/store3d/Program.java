package Homeworks.HW_1.store3d;


import Homeworks.HW_1.store3d.inmemorymodel.CustomService3;
import Homeworks.HW_1.store3d.inmemorymodel.ModelStore;
import Homeworks.HW_1.store3d.inmemorymodel.CustomService1;
import Homeworks.HW_1.store3d.inmemorymodel.CustomService2;
import Homeworks.HW_1.store3d.modelelements.*;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        CustomService1 observer1 = new CustomService1();
        CustomService2 observer2 = new CustomService2();
        CustomService3 observer3 = new CustomService3();


        ModelStore modelStore = new ModelStore();
        modelStore.registerModelChanger(observer1);
        modelStore.registerModelChanger(observer2);
        modelStore.registerModelChanger(observer3);

        modelStore.addPoligonalModel(new PoligonalModel(new ArrayList<>()));
        modelStore.addCamera(new Camera(new Point3D(), new Angle3D(25, 15, 45)));
    }
}
