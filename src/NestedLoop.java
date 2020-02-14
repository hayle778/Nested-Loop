public class NestedLoop {
public static void main(String[]args) {

  for(int i = 0; i < 1; i++) {

     System.out.print( "It is so freaking cold outside !" );
  }



      String[] colors ={" Red", " Blue", " Green"};


      for(int i =0; i<3; i++){
          System.out.print(colors[i]);
      }



      System.out.print( "-------------------------" );
      String[][] fancyColors = {{"Red", "Blue", "Green"},{"Cyan", "Magenta","Turqiouse"}};

// nested loop for those i and j value we multiply both values even though we put them in a different variable
      for(int i = 0; i < 2; i++){
          for(int j = 0; j < 1; j++){

          System.out.print(  "i " + i + "j " + j );

          }


    }
}

}
