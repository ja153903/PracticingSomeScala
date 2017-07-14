/**
  * Created by Jaime Abbariao on 7/14/2017.
  */
import Run._

object ScalaApp {
  def main(args: Array[String]){
    val pt = new Point(10, 20);

    // Move to a new location
    pt.move(10, 10);

    val loc = new Location(100, 200, 300);

    loc.move(120, 320, -30);

    4 times println("Fuck you")

    // From 1 to 9
    for (a <- 1 until 10){
      println(a * 12);
    }

    // From 1 to 12
    for (a <- 1 to 12){
      println(a * 123);
    }

    println(factorial(3));

    println(apply(layout, 10))
  }

  def factorial(i: Int): Int ={
    def fact(i: Int, accumulator: Int): Int ={
      if (i <= 1){
        return accumulator
      }
      else{
        return fact(i - 1, i * accumulator)
      }
    }
    return fact(i, 1)
  }

  def apply(f: Int=>String, v: Int) = f(v);

  def layout [A](x:A) = "[" + x.toString + "]";
}

class Point(val xc: Int, val yc: Int){
  var x: Int = xc;
  var y: Int = yc;

  def move(dx: Int, dy: Int): Unit ={
    x = x + dx;
    y = y + dy;
    println("Point x location: " + x);
    println("Point y location: " + y);
  }
}

class Location(override val xc: Int, override val yc: Int, val zc: Int)
extends Point(xc, yc){
  var z: Int = zc;

  def move(dx:Int, dy:Int, dz:Int): Unit ={
    x = x + dx
    y = y + dy
    z = z + dz
    println("Point x location: " + x)
    println("Point y location: " + y)
    println("Point z location: " + z)
  }
}
