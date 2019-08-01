package com.company.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ListBox {

    public void findFragileThing() {

        System.out.println("\nTask 4 : \n");

        List<Thing> firstBoxContent = new ArrayList<>();
        firstBoxContent.add(new Thing("cityMap", false));
        firstBoxContent.add(new Thing("chessBoard", false));
        firstBoxContent.add(new Thing("table", false));
        firstBoxContent.add(new Thing("flowerVaze", true));

        List<Thing> secondBoxContent = new ArrayList<>();
        secondBoxContent.add(new Thing("lamp", true));
        secondBoxContent.add(new Thing("statue", true));
        secondBoxContent.add(new Thing("board", false));
        secondBoxContent.add(new Thing("glass", true));

        List<Thing> thirdBoxContent = new ArrayList<>();
        thirdBoxContent.add(new Thing("pillow", false));
        thirdBoxContent.add(new Thing("fence", false));
        thirdBoxContent.add(new Thing("damper", false));
        thirdBoxContent.add(new Thing("binoculars", true));

        List<Thing> fourthBoxContent = new ArrayList<>();
        fourthBoxContent.add(new Thing("kettle", true));
        fourthBoxContent.add(new Thing("axe", false));
        fourthBoxContent.add(new Thing("clothing", false));
        fourthBoxContent.add(new Thing("porcelain", true));

        List<Thing> fifthBoxContent = new ArrayList<>();
        fifthBoxContent.add(new Thing("dictionary", false));
        fifthBoxContent.add(new Thing("glassDoll", true));
        fifthBoxContent.add(new Thing("chair", false));
        fifthBoxContent.add(new Thing("picture", true));

        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(firstBoxContent));
        boxes.add(new Box(secondBoxContent));
        boxes.add(new Box(thirdBoxContent));
        boxes.add(new Box(fourthBoxContent));
        boxes.add(new Box(fifthBoxContent));

        List<Protected> protect = boxes.stream()
                .flatMap(a -> a.getThings().stream())
                .filter(Thing::isFragile)
                .map(Protected::new)
                .collect(Collectors.toList());

        System.out.println(protect);

    }
  /*  public static void filterListByBoxFragility () {
        List<Box> boxes = createListOfBox();


        List<Box> groupByFragility = boxes.stream()
                                          .filter(Box::isFragility)
                                          .collect(Collectors.toList());

        System.out.println("\n" + boxes + "\n");


        for (int i =0; i<groupByFragility.size();i++) {

        System.out.println("\n" + groupByFragility.get(i) + "is Protected\n");
    }}


    public static List<Box> createListOfBox(){

        List<Box> box = new ArrayList<>();

        box.add(new Box(Thing.generateThing(),true));
        box.add(new Box(Thing.generateThing(),false));
        box.add(new Box(Thing.generateThing(),true));
        box.add(new Box(Thing.generateThing(),false));
        box.add(new Box(Thing.generateThing(),true));
        return box;
    }*/
}
