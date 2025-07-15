// class Test{
//     public static void main(String args[]){
//         System.out.println("hello");
//     }
// }

// 1-The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.
// perimeter=2(length+breadth)
// area =l*b

class Test{
    public static void main(String args[])
    {
        // int length=70,breadth,perimeter=230,area;
        // breadth=(perimeter/2)-length;
        // System.out.println("the breadth of the recatangle is :"+breadth);

        // area=length*breadth;
        // System.out.println("the area of the recatangle is :"+area);


        /////////////////////////////////////////////////////////////////////////////////////

        // The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter. 
        // int area=96,breadth=8,length,perimeter;
        // length=area/breadth;
        // perimeter=2*(length+breadth);
        // System.out.println(length);
        // System.out.println(perimeter);

        ////////////////////////////////////////////////////////////////////////////////
        // How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm? 
        // int lt=13,bt=7,at,lr=520,br=140,ar;
        // at=lt*bt;
        // ar=lr*br;
        // int totalTileRequired=ar/at;
        // System.out.println(totalTileRequired);

        ///////////////////////////////////////////////////////////////////////////////////

        // Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m. 
        // int length=300,breadth=150,area;
        // area=length*breadth;
        // int totalCost=(area/100)*6;
        // System.out.println(totalCost);

        //////////////////////////////////////////////////////////////////////////////////////////////////
        //  If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.
        // int length=20,breadth,perimeter,area,cost=1600;
        // perimeter=cost/25;
        // breadth=(perimeter/2)-length;
        // area=length*breadth;
        // System.out.println(breadth);
        // System.out.println(perimeter);
        // System.out.println(area);

        //////////////////////////////////////////////////////////////////////////////////
        // Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.
        // int a=10,b=9,c,perimeter=36;
        // c=perimeter-a-b;
        // int s=(a+b+c)/2;
        // double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        // System.out.println(area);


        // Find the height of a triangle whose base is 50 cm and whose area is 500 cm².
        // int height,base=50,area=500;
        // height=(2*area)/base;
        // System.out.println(height);

        // 8. Find the base of a triangle whose altitude is 20 cm and area is 0.8 m².
        // to convert in cm2 multilply by 10000
        // int altitude=20,base,area=8000;
        // base=(2*area)/altitude;
        // System.out.println(base);

        // Find the area of an equilateral triangle, the length of whose sides is 12 cm.
        // int a=12;
        // double area=0.433*a*a;
        // System.out.println(area);

        // Find the area of an isosceles right angled triangle of equal sides 15 cm each.
        // wthout  f all integer with decimals  are treated as double in java

        // float a=15;
        // float area=0.5f*a*a;
        // System.out.println(area);

        // //////////////////////////////////////////////////////////////////////////////

        // 15. Shelly has a rectangular garden of length 22 m and breath 15 m. Her friend Rachel has a square garden of side 21 m. Whose garden is bigger and by how much?

        // int lr=22,br=15,fg=21;
        // int areaShelly=lr*br;
        // int areaRachel=fg*fg;
        // if(areaShelly>areaRachel)
        // {
        //     System.out.println("shelly garden in bigger than her friend rahcel by "+(areaShelly-areaRachel));

        // }
        // else{
        //     System.out.println("rahcel garden in bigger than her friend shelly by "+(areaRachel-areaShelly));

        // }


        //////////////////////////////////////////////////////////////////////////////////

        // 16. Tina wants a new carpet for her rectangular dining room. Her dining room is a 5 meters by 7 meters rectangle. How much carpet does she need to buy to cover her entire dining room.
        // int length=5,breadth=7,surfaceArea;
        // surfaceArea=length*breadth;
        // System.out.println("tina have to buy "+surfaceArea+"m^2 carpet to cover then room");

        ///////////////////////////////////////////////////////////////////////////////////////
        // 17. Luci is making a display board for the school exhibition. The display board is a 3 m by 2 m rectangle. He needs to add a ribbon border around the entire display board. What is the length of ribbon that he need
        // int length=3,breadth=2,perimeter;
        // perimeter=2*(length+breadth);
        // System.out.println("luci need "+perimeter+"m ribbon to cover the border of the board");

        // 18. Ron jogs around a rectangular park of length 50 m and breadth 30 m. If he takes 10 rounds of the park each day, how much distance does he cover in a day in km?
        // int length=50,breadth=30,perimeter;
        // perimeter=2*(length+breadth);
        // int totalDistance=10*perimeter;
        // System.out.println("ron covers total:"+totalDistance+" m");

        // A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. Which shape has more volume?
        // int volCube,volCuboid;
        // volCube=7*7*7;
        // volCuboid=7*4*8;
        // if(volCube>volCuboid)
        // {
        //     System.out.println("cube is having the large voume");
        // }
        // else{
        //     System.out.println("cuboid is having the large voume");

        // }

        // // What is the volume of a brick of ice-cream with length 25 cm, breadth 10 cm and height 8 cm?
        // int length=25,breadth=10,height=8;
        // int vol=length*breadth*height;
        // System.out.println("the volume of cube is :"+vol);

        // A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres?
        // int bl=15,bh=5,bb=8,wh=1500,wl=1000,wb=800,areaBrick,areaWall;
        // areaBrick=bl*bh*bb;
        // areaWall=wh*wl*wb;
        // float totalBrickRequired=areaWall/areaBrick;
        // System.out.println(totalBrickRequired);

        /////////////////////////////////////////////////////////////////////////////

        // 22. A pond is 50 m long, 30 m wide and 2 m deep. Find the capacity of the pond in cubic metre.
        // int length=50,breadth=30,deep=2,vol;
        // vol=length*breadth*deep;
        // System.out.println(vol);

        /////////////////////////////////////////////////////////////////////////////////
        // 23. Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
        // int volCube,volCartoon;
        // volCube=3*3*3;
        // volCartoon=15*9*12;
        // float totalCube=volCartoon/volCube;
        // System.out.println(totalCube);

        /////////////////////////////////////////////////////////////////////////////////
        // 24. How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wall?
        // double wallVolume,brickvol;
        // brickvol=25*10*7.5;
        // wallVolume=2000*200*75;
        // double totalBrickRequired=wallVolume/brickvol;
        // double totalCost=(totalBrickRequired/1000)*900;
        // System.out.println(totalCost);
        //////////////////////////////////////////////////////////////////////////////////////


        // 25. 100 bricks of length 24 cm and breadth 15 cm are used to tile a path of a garden. What is the area of the path?
        // int areaBrick,surfaceArea;
        // areaBrick=24*15;
        // surfaceArea=areaBrick*100;
        // System.out.println(surfaceArea);

        ////////////////////////////////////////////////////////////////////////////////////////
        // How many bricks will be required to lay a path 120 m long and 2.4 m breadth if a brick is 24 cm long and 15 cm wide?
        // int areaBrick;
        // areaBrick=24*15;
        // int surfaceArea=12000*240;
        // int totalBrickRequired=surfaceArea/areaBrick;
        // System.out.println(totalBrickRequired);

        // 27. Find the cost of tiling a dining room 20 m long and 15 m wide at the rate of $ 5 per square m.
        // int surfaceArea,cost;
        // surfaceArea=20*15;
        // cost=surfaceArea*5;
        // System.out.println(cost);

        // 28. A carpet is 5 m long and 4 m wide. Find its price at the rate of $ 205 per square meter.
        // int surfaceArea,cost;
        // surfaceArea=5*4;
        // cost=surfaceArea*205;
        // System.out.println(cost);

        // 29. How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm?
        // int areafloor,areatile;
        // areafloor=800*900;
        // areatile=10*10;
        // int totalTileRequired=areafloor/areatile;
        // System.out.println(totalTileRequired);
        ///////////////////////////////////////////////////////////////////////////////////

        // 30. How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide?
        // int areafloor,areatile;
        // areafloor=200*400;
        // areatile=5*8;
        // int totalTileRequired=areafloor/areatile;
        // System.out.println(totalTileRequired);
        
        ///////////////////////////////////////////////////////////////////////////////////
        // What will be the area of a square with perimeter 200 m
        // int perimeter=200,side,area;
        // side=perimeter/4;
        // area=side*side;
        // System.out.println(area);

        ////////////////////////////////////////////////////////////////////////////////////
        // 32. A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of 25 m . Calculate the area of the garden.
        // int areaGarden,areaPool;
        // areaPool=25*25;
        // areaGarden=(150*150)-areaPool;
        // System.out.println(areaGarden);

        // ///////////////////////////////////////////////////////////////////////////////////
        // 33. A rectangular garden has dimensions of 30 m by 20 m and is divided in to 4 parts by two pathways that run perpendicular from its sides. One pathway has a width of 3 m and the other, 4 m. Calculate the total usable area of the garden.
        // int totlaGardenArea,totalPathWayarea,crossection;
        // totlaGardenArea=30*20;
        // totalPathWayarea=(3*30)+(4*20);
        // crossection=3*4;
        // int totaluseablearea=totlaGardenArea-(totalPathWayarea-crossection);
        // System.out.println(totaluseablearea);
        // System.out.println(crossection);
        // System.out.println(totalPathWayarea);
        // System.out.println(totlaGardenArea);

        // /////////////////////////////////////////////////////////////////////////////

        //34. A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases. Calculate the area of the wooded area after the addition of the walkway.
        // int walkwayarea;
        // double totlarea=0.5*(128+92)*40;
        //  walkwayarea=4*40;
        // double areawow=totlarea-walkwayarea;
        // System.out.println(areawow);

        ////////////////////////////////////////////////////////////////////////////////
        // . Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.
        // double surfacearea;
        // surfacearea=2*3.14*7.7*(7.7+12);
        // System.out.println(surfacearea);

        /////////////////////////////////////////////////////////////////////////////////
        // What is the surface area of a cylinder if the diameter is 15m height is 7m?
        // double surfacearea;
        // surfacearea=2*3.14*7.5*(7.5+7);
        // System.out.println(surfacearea);

        //////////////////////////////////////////////////////////////////////////////////
        // 37. The surface of the cylinder is 149 cm². The cylinder height is 6 cm. What is the diameter of this cylinder?


        // //////////////////////////////////////////////////////////////////////////////////

        // 39. Find the surface of the cylinder if its diameter is 12 centimeters and its height is 9 centimeters.
        // double surfacearea;
        // surfacearea=2*3.14*6*(6+9);
        // System.out.println(surfacearea);

        /////////////////////////////////////////////////////////////////////////////////////
        // 40. Calculate the volume of the cylinder: r = 5 cm, h = 9 cm
        // double vol;
        // vol=3.14*5*5*9;
        // System.out.println(vol);

        //////////////////////////////////////////////////////////////////////////////////
        //  I need to calculate the cylinder volume with a height of 50 cm and a diameter of 30 cm.
        // double vol;
        // vol=3.14*15*15*50;
        // System.out.println(vol);
        ////////////////////////////////////////////////////////////////////////////////
        // Find the Volume of Cylinder whose diameter and height are 2.25cm

        // double vol;
        // vol=3.14*1.125*1.125*2.25;
        // System.out.println(vol);
        ////////////////////////////////////////////////////////////////////////////////////
        // 43. Find the cost of polishing the base of a cone whose height is 4cm and slant height 5 cm at the rate of 10 rs. Per sq. cm


        // Find the 28th term of an Arithmetic Progression -21 -18 -15 -12 . . . . . 
        // int a=-21,d=-18-(-21),an;
        // an=a+(27)*d;
        // System.out.println(an);

        // 45. Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .
        // int a=-21,d=-18-(-21),sn;
        // sn=28/2*(2*(-21)+27*d);
        // System.out.println(sn);










 


    }
}
